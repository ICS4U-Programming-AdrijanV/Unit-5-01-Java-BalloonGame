import java.awt.Color;

/**
 * The main file.
 *
 * @author Adrijan Vranjkovic
 * @version 1.0
 * @since 2023-05-28
 */
public final class Main {

    /**
     * For style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * Print messages.
     *
     * @param args Unused
     */
    public static void main(String[] args) {

        // Create a balloon
        final Balloon balloonA = new Balloon(24, 76, Color.GREEN, 1);

        // Move the balloons coordinates
        System.out.println("Current balloon location: "
            + balloonA.xPosition + ", " + balloonA.yPosition);
        balloonA.moveBalloon(20, -76);

        System.out.println("New location: "
            + balloonA.xPosition + ", " + balloonA.yPosition);

        // Change the color of the balloon
        System.out.println(balloonA.color);
        balloonA.changeColor(Color.RED);
        System.out.println(balloonA.color);

        // Create the spike.
        final Spike spike = new Spike(34);

        // Move the spike to pop the balloon
        System.out.println("Balloon popped: " + balloonA.isPopped);
        System.out.println("Spike position: " + spike.xPosition);

        // Move the spike to the x position of the balloon.
        spike.moveSpike(balloonA.xPosition - spike.xPosition);
        System.out.println("New position: " + spike.xPosition);
        spike.popBalloon(balloonA);
        System.out.println("Balloon popped: " + balloonA.isPopped);
    }
}
