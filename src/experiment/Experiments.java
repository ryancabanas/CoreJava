/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment;

/**
 *
 * @author Ryan Cabanas
 */
public class Experiments
{
  public static void main(String[] args)
  {
    // Testing the backspace escape sequence.
//    System.out.println("Fart\n\bFast");
    
    //Testing out how the floorMod and floorDiv methods work.  Read the documentation.
//    System.out.println(Math.floorMod(4, -3));
//    System.out.println(Math.floorMod(5, -3));
//    System.out.println(-4 / 3);
//    System.out.println(Math.floorDiv(-4, 3));
    // Didn't know this, but a modulus is calculated as: (x - ((x/y) * y)).
    
    //Testing bitwise operators
    int testAND = 8 & 9;
    System.out.println(Integer.toBinaryString(8) + " & " + Integer.toBinaryString(9)
            + " = " + Integer.toBinaryString(testAND));
    
    int testOR = 1 | 2 | 4;
    System.out.println(
            Integer.toBinaryString(1)
                    + " | " + Integer.toBinaryString(2)
                    + " | " + Integer.toBinaryString(4)
                    + " = " + Integer.toBinaryString(testOR));
    
  }
}
