/**
* This is the spike class file.
*
* @author Adrijan Vranjkovic
* @version 1.0
* @since 2023-05-28
*/

public class Spike {

    /**
     * For style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    public static final int YPOSITION = 0;
    /**
    * For style checker.
    */
    int xPosition;

    /**
    * Creates the spike object.
    *
    * @param posX the x pos of the balloon
    */
    public Spike(int posX) {
        this.xPosition = posX;
    }

    /**
    * Pops the balloon.
    *
    * @param balloon the balloon that pops
    */
    public void popBalloon(Balloon balloon) {

        // Check to make sure the balloon will pop.
        if (balloon.xPosition == this.xPosition && balloon.yPosition
            == this.YPOSITION) {
            balloon.isPopped = true;
        }

    }

    /**
    * Move the spike.
    *
    * @param amount the amount the spike moves.
    */
    public void moveSpike(int amount) {
        amount = 10;
        // Changing the x pos of the spike
        this.xPosition += amount;
    }
}
