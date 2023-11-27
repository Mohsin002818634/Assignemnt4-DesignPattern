/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpatterndemo;

/**
 *
 * @author abdulmohsin
 * @version 1.0
 */
public class SingletonPatternDemo {

    /**
     * The main method of the application. It creates a single instance of the SingleObject class using the getInstance() method, then invokes the showMessage method on that instance.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of SingleObject using the getInstance() method
        SingleObject object = SingleObject.getInstance();
        // Invoke the showMessage method to display a "Hello World" message
        object.showMessage();
    }
    
}
