/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galtolit.java;

/**
 *
 * @author Jason
 */
//Program Start
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gallons; //use double for more precise #'s 0.00
        double liters;//use int for less precise #'s 0
        
        gallons = 10;
        //convert gallons to liters
        liters = gallons * 3.7854;
        
        System.out.println(gallons + " gallons is: " + liters + " liters. ");
        //end of program
    }
    
}
