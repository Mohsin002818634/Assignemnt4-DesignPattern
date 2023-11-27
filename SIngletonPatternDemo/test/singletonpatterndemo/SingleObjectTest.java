/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package singletonpatterndemo;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import singletonpatterndemo.*;


/**
 * The SingleObjectTest is a JUnit Test class for testing the SingleObject class.
 * @author abdulmohsin
 * @version 1.0
 */
public class SingleObjectTest {
    
    public SingleObjectTest() {
    }
    
    /**
     * The getInstanceTest() method is used to test the getInstance() method from SingleObject class.
     * @version 1.0
     */
    @Test
    public void getInstanceTest(){
        
      SingleObject object1 = SingleObject.getInstance();
      SingleObject object2 = SingleObject.getInstance();
      assertTrue(object1.equals(object2));
        }
        
    }
    
   
   
