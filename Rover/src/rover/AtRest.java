/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rover;
/**
 * The AtRest class represents a state where an object is at rest. It extends the abstract
 * class State and defines specific behavior related to this state.
 * 
 * @author abdulmohsin
 * @version 2.0
 */
public class AtRest extends State {
    
    /**
     * Default constructor for the AtRest class. Initializes the name and subState attributes.
     * The name is set to "At Rest" and subState is set to "None".
     */
    AtRest() {
        this.name = "At Rest";
        this.subState = "None";
    }
    
   // Presses the right pedal; allows only a single press to transition to Move Forward State
    public Boolean pressRightPedal(int numOfTimesPressed) {
        if (numOfTimesPressed != 1) {
            System.out.println("Error: Can only press Right Pedal once when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Forward State...");
            return true;
        }
    }

   
    protected Boolean pressLeftPedalForTime(int numOfSecondsPressed) {
        if (numOfSecondsPressed != 5) {
            System.out.println("Error: Must press Right Pedal for 5 seconds when in At Rest State.\nUnable to move.");
            return false;
        } else {
            System.out.println("Transitioning from At Rest State to Move Backward State...");
            return true;
        }
    }
}