/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempconvert;

import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class Tempconvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cel, fah;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("input your temperature in degrees Celsius: ");
        cel = keyboard.nextInt();

        fah = (int) ((9.0 / 5.0) * cel + 32);

        System.out.println("The temperature in Fahrenheit is " + fah);
    }
    
}
