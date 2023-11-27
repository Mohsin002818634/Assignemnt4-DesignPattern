/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpatterndemo;


/**
 *
 * @author abdulmohsin
 * @version 1.0
 */
public class SingleObject {
     /**
     * The single instance of the SingleObject class.
     */
    private static SingleObject instance = new SingleObject();
    /**
     * Private constructor to prevent the creation of additional instances.
     * This supports the singleton pattern.
     */
    public SingleObject(){}
     /**
     * Retrieves the single instance of the SingleObject class.
     *
     * @return The single instance of the SingleObject class.
     */
        public static SingleObject getInstance(){
            return instance;
        }
         /**
     * Displays a simple "Hello World" message to the console.
     */
        public void showMessage(){
            System.out.println("Hello World");
        }
    }

    
    
