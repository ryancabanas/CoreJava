/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment;

import java.util.Scanner;

/**
 *
 * @author Ryan Cabanas
 */
public class Chapter03
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
//    int testAND = 8 & 9;
//    System.out.println(toPaddedBinaryString(8, 4)
//            + " & " + toPaddedBinaryString(9, 4)
//            + " = " + toPaddedBinaryString(testAND, 4));
//    
//    int testOR = 1 | 2 | 4;
//    System.out.println(toPaddedBinaryString(1, 4)
//            + " | " + toPaddedBinaryString(2, 4)
//            + " | " + toPaddedBinaryString(4, 4)
//            + " = " + toPaddedBinaryString(testOR, 4));
    
//    int testXOR = Integer.parseInt("1010", 2) ^ Integer.parseInt("1111", 2);
//    System.out.println(toPaddedBinaryString(testXOR, 4));
//    
//    int testNOT = ~Integer.parseInt("1110", 2);
//    System.out.println(toPaddedBinaryString(testNOT, 4));
//    
//    int leftShift = Integer.parseInt("0001", 2) << 4;
//    System.out.println(toPaddedBinaryString(leftShift, 4));
    
//    System.out.println(toPaddedBinaryString(8, 32));
//    int rightShift = 8 >> 2;
//    System.out.println(toPaddedBinaryString(rightShift, 32));
//    
//    System.out.println(toPaddedBinaryString(-8, 32));
//    int rightShift1 = -8 >> 2;
//    System.out.println(toPaddedBinaryString(rightShift1, 32));
//
//    int rightShift3 = -8 >>> 2;
//    System.out.println(toPaddedBinaryString(rightShift3, 32));
//
//    int rightShift31 = -8 >> 31;
//    System.out.println(toPaddedBinaryString(rightShift31, 32));
    
//    int test = -2147483648 >> 1;
//    int test2 = -2147483648 >>> 1;
//    int test3 = 2147483647 >> 1;
//     int test4 = 2147483647 >>> 1;
//    System.out.println(toPaddedBinaryString(-2147483648, 32));
//    System.out.println(toPaddedBinaryString(2147483647, 32));
//    System.out.println();
//    System.out.println(toPaddedBinaryString(test, 32));
//    System.out.println(toPaddedBinaryString(test2, 32));
//    System.out.println(toPaddedBinaryString(test3, 32));
//    System.out.println(toPaddedBinaryString(test4, 32));
    
//    System.out.println(toPaddedBinaryString(-1, 32));
//    System.out.println(toPaddedBinaryString(-5, 32));
//    System.out.println(toPaddedBinaryString(-7, 32));
//    System.out.println(toPaddedBinaryString(-8, 32));
//    System.out.println(toPaddedBinaryString(-14, 32));
//    System.out.println(toPaddedBinaryString(-2147483648, 32));
//    System.out.println(toPaddedBinaryString(-2147483647, 32));
    
    // The AND (&) can turn bits "off" with a "0" bit mask.  It can also check the "1" status of
    // another bit with a mask bit of "1".
    //
    // The OR (|) can turn bits "on" with a "1" bit mask.
    //
    // The NOT (~) flips bits to the opposite of what they were.  There is no mask.
    //
    // The XOR (^) is a mix of AND and OR.  "0" + "0" = "0" ... "0" + "1" = "1" ... "1" + "1" = "0".
    // This, of course, uses a mask.
    //
    // "<<" and ">>" just shift bits left, or right.  ">>>" shifts bits right, but zeros are entered
    // on the left edge for fill in the spaces.  This really only makes a difference if you're
    // shifting a negative number.
    
//    String test = "Hello";
//    int index = test.offsetByCodePoints(0, 1);
//    System.out.println(test.charAt(index));
//    
//    System.out.println(Integer.parseUnsignedInt("1111111111111111", 2));
//    System.out.println("0x" + Integer.toString(65535, 16));
      
//    System.out.println("help".startsWith("e", 1));
//    System.out.println("help".startsWith("h"));
//    System.out.println("help".endsWith("p"));
//    System.out.println("help".indexOf('e'));
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
//    if (input.hasNextDouble()) {
//      double value = input.nextDouble();
//      System.out.println(value);
//    } else {
//      String word = input.next();      
//      System.out.println(word);
//    }
    if (input.hasNextLine()) {
      String sentence = input.nextLine();
      System.out.println(sentence);
    }

    
  }
  
  private static String toPaddedBinaryString(int number, int width) {
    String formatter = "%" + width + "s";
    return String.format(formatter, Integer.toBinaryString(number)).replace(" ", "0");
  }
}
