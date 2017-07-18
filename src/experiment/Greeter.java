/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment;

import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 *
 * @author Ryan Cabanas
 */
public class Greeter {
  public void greet(ActionEvent event) {
    System.out.println("Hello, world!");
  }
}

class TimedGreeter extends Greeter {
  public static void main(String[] args) {
    TimedGreeter tg = new TimedGreeter();
    tg.greet(new ActionEvent(new String(), 1, "nothing"));
  }
  
  @Override
  public void greet(ActionEvent event) {
    Timer t = new Timer(1000, super::greet);
    t.start();
  }
}

class Whatever {
  public void printSomething() {
    System.out.println("Whatever");
  }
}