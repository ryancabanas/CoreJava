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
    System.out.println(toPaddedBinaryString(8, 4)
            + " & " + toPaddedBinaryString(9, 4)
            + " = " + toPaddedBinaryString(testAND, 4));
    
    int testOR = 1 | 2 | 4;
    System.out.println(toPaddedBinaryString(1, 4)
            + " | " + toPaddedBinaryString(2, 4)
            + " | " + toPaddedBinaryString(4, 4)
            + " = " + toPaddedBinaryString(testOR, 4));
    // The AND (&) can turn bits "off" with a "0" bit mask.  It can also check the "1" status of
    // another bit with a mask bit of "1".
    //
    // The OR (|) can turn bits "on" with a "1" bit mask.
    //
    // The NOT (~) flips bits to the opposite of what they were.  There is no mask.
    //
    // The XOR (^) is a mix of AND and OR.  "0" + "0" = "0" ... "0" + "1" = "1" ... "1" + "1" = "0".
    // This, of course, uses a mask.
    
  }
  
  private static String toPaddedBinaryString(int number, int width) {
    String formatter = "%" + width + "s";
    return String.format(formatter, Integer.toBinaryString(number)).replace(" ", "0");
  }
}
