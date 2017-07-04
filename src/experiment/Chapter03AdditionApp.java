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
public class Chapter03AdditionApp {
  public static void main(String[] args) {  
    String word = "";
    Scanner input = new Scanner(System.in);
    int min = 0;
    int max = 0;
    
    System.out.println("***MATH PRACTICE: ADDITION***");
    System.out.println("(Type \"q\" at any time to leave the program.)");
    System.out.println();
    
    System.out.print("Enter a minimum range value: ");
    if (input.hasNextInt()) {
      min = input.nextInt();  
    } else if (input.hasNext()) {
      word = input.next();
    }
    
    if (!word.equalsIgnoreCase("q")) {
      System.out.print("Enter a maximum range value: ");
      if (input.hasNextInt()) {
        max = input.nextInt();  
      } else if (input.hasNext()) {
        word = input.next();
      } 
    }
    
    System.out.println();

    int range = (max - min) + 1;
    
    while (!word.equalsIgnoreCase("q")) {
      int random1 = (int) (Math.random() * range) + min;
      int random2 = (int) (Math.random() * range) + min;
      
      System.out.print(random1 + " + " + random2 + " = ");
      
      int answer = 0;
      if (input.hasNextInt()) {
        answer = input.nextInt();  
      } else if (input.hasNext()) {
        word = input.next();
      }
      
      if (!word.equalsIgnoreCase("q")) {
        if (answer == random1 + random2) {
          System.out.println("That's right!  Good job!");
          
        } else {
          System.out.println("Sorry.  The anwer was: " + (random1 + random2));
        }        
      }
    }
    
    System.out.println("\nGoodbye!");
  }
}
