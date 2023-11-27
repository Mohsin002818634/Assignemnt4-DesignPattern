/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package facadetest;

import facade.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The ShapeMakerTest is a JUnit Test class for testing the ShapeMaker class.
  * @author abdulmohsin
 * @version 1.0
 */
public class ShapeMakerTest {
     /**
     * Constructs a new ShapeMakerTest instance.
     */
   
    public ShapeMakerTest() {}
    
  
    @Test
    public void drawCircleTest(){
        ShapeMaker shapeMaker = new ShapeMaker();
        Circle circle = new Circle();
        /**
     * Test method for drawing a circle using ShapeMaker.
     * 
     * Positive Test Case: Compares the expected result with the result from the drawCircle method.
     * Negative Test Case: Compares the drawCircle method with incorrect results (rectangle and square).
     */
        /** Positive Test Case */
        assertEquals(circle.draw(), shapeMaker.drawCircle());
        assertEquals("Circle::draw()", shapeMaker.drawCircle());
        
        /** Negative Test Case */
        assertNotEquals("Circle::draw()", shapeMaker.drawRectangle());
        assertNotEquals("Circle::draw()", shapeMaker.drawSquare());
    }
    
    
    @Test
    public void drawRectangleTest(){
        ShapeMaker shapeMaker = new ShapeMaker();
        Rectangle rectangle = new Rectangle();
        /**
     * Test method for drawing a rectangle using ShapeMaker.
     * 
     * Positive Test Case: Compares the expected result with the result from the drawRectangle method.
     * Negative Test Case: Compares the drawRectangle method with incorrect results (circle and square).
     */
         /** Positive Test Case */
        assertEquals(rectangle.draw(), shapeMaker.drawRectangle());
        assertEquals("Rectangle::draw()", shapeMaker.drawRectangle());
        
        /** Negative Test Case */
        assertNotEquals("Rectangle::draw()", shapeMaker.drawCircle());
        assertNotEquals("Rectangle::draw()", shapeMaker.drawSquare());
    }
    
  
    @Test
    public void drawSquareTest(){
        ShapeMaker shapeMaker = new ShapeMaker();
        Square square = new Square();
        /**
     * Test method for drawing a square using ShapeMaker.
     * 
     * Positive Test Case: Compares the expected result with the result from the drawSquare method.
     * Negative Test Case: Compares the drawSquare method with incorrect results (circle and rectangle).
     */
        /** Positive Test Case */
        assertEquals(square.draw(), shapeMaker.drawSquare());
        assertEquals("Square::draw()", shapeMaker.drawSquare());
        /** Negative Test Case */
        assertNotEquals("Square::draw()", shapeMaker.drawCircle());
        assertNotEquals("Square::draw()", shapeMaker.drawRectangle());
    }
}