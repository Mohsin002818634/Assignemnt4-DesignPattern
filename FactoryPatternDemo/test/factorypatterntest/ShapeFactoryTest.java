/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package factorypatterntest;

import factorypatterndemo.*;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The ShapeFactoryTest is a JUnit Test class for testing the ShapeFactory class.
 * @author abdulmohsin
 * @version 1.0
 */
public class ShapeFactoryTest {
    
    public ShapeFactoryTest() {
    }
    
    /**
     * The getShapeTest() method is used to test the getShape() method from ShapeFactory class.
     * @version 1.0
     */
    @Test
    public void getShapeTest(){
        ShapeFactory shapeFactory = new ShapeFactory();
        
        /** Test for Circle */
        Circle circle = new Circle();
        /** Positive Test cases */
        assertEquals(circle.getClass(), shapeFactory.getShape("CIRCLE").getClass());  
        /** Negative Test Cases */
        assertNull(shapeFactory.getShape("One Circle Please"));
        assertNotEquals(circle.getClass(), shapeFactory.getShape("RECTANGLE").getClass());
        assertNotEquals(circle.getClass(), shapeFactory.getShape("SQUARE").getClass());
        
        /** Test for Rectangle */
        Rectangle rectangle = new Rectangle();
        /** Positive Test cases */
        assertEquals(rectangle.getClass(), shapeFactory.getShape("RECTANGLE").getClass());
        /** Negative Test Cases */
        assertNull(shapeFactory.getShape("Just a rectangle - to go!"));
        assertNotEquals(rectangle.getClass(), shapeFactory.getShape("SQUARE").getClass());
        assertNotEquals(rectangle.getClass(), shapeFactory.getShape("CIRCLE").getClass());
        
        
        /** Test for Square */
        Square square = new Square();
        /** Positive Test cases */
        assertEquals(square.getClass(), shapeFactory.getShape("SQUARE").getClass());
        /** Negative Test Cases */
        assertNotEquals(square.getClass(), shapeFactory.getShape("RECTANGLE").getClass());
        assertNotEquals(square.getClass(), shapeFactory.getShape("CIRCLE").getClass());
        
        /** No Shape Test Cases - NULL */
        assertNull(shapeFactory.getShape(null));
        assertNull(shapeFactory.getShape(""));
    }
}