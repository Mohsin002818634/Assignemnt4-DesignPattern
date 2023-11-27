/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rover;

 /**
 * The State class represents an abstract state that can be extended to create specific states for a rover.
 * It defines basic attributes and methods that can be overridden by subclasses to implement specific behavior.
 * 
 * @author abdulmohsin
 * @version 2.0
 */
public class State {
    public String name = "NULL";
    protected String subState = "NULL";

    /**
     * Default constructor for the State class.
     */
    State() {}

   // Empty default constructor for the State class

// Presses the right pedal a specified number of times and returns false
    public Boolean pressRightPedal(int numOfTimesPressed) {
        return false;
    }

  // Presses the right pedal for a specified duration
    protected void pressRightPedalForTime(int numOfSecondsPressed) {}

   // Presses the left pedal a specified number of times and returns false
    protected Boolean pressLeftPedal(int numOfTimesPressed) {
        return false;
    }

  // Presses the left pedal for a specified duration and returns false
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        return false;
    }

   // Performs a void action of pressing the left pedal for a specified duration
    protected void voidPressLeftPedalForTime(int numOfSecondsPressed) {}
}