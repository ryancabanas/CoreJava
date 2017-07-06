/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author Ryan Cabanas
 * 
 */
public class Chapter04 {
  public static void main(String[] args) {
//    System.out.println(new Date());
//    System.out.println(LocalDate.now());
//    System.out.printf("%02d\n", LocalDateTime.now().getMonthValue());
    
//    Test test = new Test(30);
//    int value = test.getValue();
//    value = 40;
//    int value2 = test.getValue();
//    System.out.println(value2);

//    Test test = new Test(10, "Bob");
//    System.out.println(test.getStringName());
//    StringBuilder sb = test.getName();
//    sb.append(" & Harry");
//    System.out.println(test.getStringName());
    
//    Test gotIt = Test.getADick();
//    System.out.println(gotIt.getStringName());


    
  }
}

/**
 * 
 * @author Ryan Cabanas
 * 
 */
class Test {
  private int value;
  /**
   * A StringBuilder instance variable.
   * @see experiment.Test#getStringName()
   */
  private StringBuilder name = new StringBuilder();
  
  Test(int value, String name) {
    this.value = value;
    this.name.append(name);
  }
  
  int getValue() {
    return value;
  }
  
  void changePrivateMemberTest(Test otherObject) {
    otherObject.value = 100;
  }
  
  StringBuilder getName() {
    return name;
  }
  
  /**
   * 
   * @return the {@code StringBuilder} instance variable as a {@code String}
   */
  String getStringName() {
    return name.toString();
  }
  
  // Factory method test
  /**
   * 
   * @return a new {@code Test} object
   * @see experiment.Test#name
   */
  static Test getADick() {
    return new Test(6, "Dick");
  }
  
  public static void main(String[] args) {
    
  }
}