import java.awt.Color;

/**
* The main class file.
*
* @author Adrijan Vranjkovic
* @version 1.0
* @since 2023-05-28
*/
public class Balloon {
    /**
     * For style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */

    /**
    * For style checker.
    */
    // x pos of the balloon
    int xPosition;

    /**
    * For style checker.
    */
    // y pos of the balloon
    int yPosition;

    /**
    * For style checker.
    */
    // Colour of the balloon
    Color color;

    /**
    * For style checker.
    */
    // To tell if balloon is popped.
    boolean isPopped;

    // ID of the balloon
    int id;
    /**
    * Create a Balloon with the position, color and ID.
    *
    * @param xInitial The x pos of balloon
    * @param yInitial The y pos of the balloon
    * @param initialColor The color of the balloon
    * @param idMain the ID of the balloon
    */

    public Balloon(int xInitial, int yInitial, Color initialColor, int idMain) {
        // Setting the values.
        this.xPosition = xInitial;
        this.yPosition = yInitial;
        this.color = initialColor;
        this.isPopped = false;
        this.id = idMain;
    }

    /**
    * This Changes the colour of the balloon.
    *
    * @param newColor the new color
    */
    public void changeColor(Color newColor) {

        // Change color
        this.color = newColor;
    }

    /**
    * Moves the balloon by the amount of x and y directions.
    *
    * @param xChange x pos change
    * @param yChange y pos change
    */
    public void moveBalloon(int xChange, int yChange) {
        // Change x an y values
        this.xPosition += xChange;
        this.yPosition += yChange;
    }
}
