/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.Test;
import static org.junit.Assert.*;
import rover.*;

/**
 *
 * @author abdulmohsin
 * @version 2.0
 */
public class StatePatternTest {
    
   /**
     * Default constructor for the RoverTest class.
     */ 
    public StatePatternTest() {
    }

   
    
    
    Rover r = new Rover();
    
    
    
    @Test
    public void testPressRightPedal() {
        
        // Test Case 1
        assertEquals("At Rest",r.currentState.name);
        
        // Test Case 2
        r.pressRightPedal(2);
        assertEquals("At Rest",r.currentState.name);
        
       // Test Case 3
        r.pressRightPedal(1);
        assertEquals("Move Forward",r.currentState.name);
        
    }

   /**
     * Placeholder method for testing the printStateAndSubState method of the Rover class.
     */
    
    @Test
    public void testPrintStateAndSubState() {
    }


    /**
     * Placeholder method for testing the main method of the Rover class.
     */
    
    @Test
    public void testMain() {
    }
    
}