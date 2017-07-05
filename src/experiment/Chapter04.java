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
 */
public class Chapter04 {
  public static void main(String[] args) {
    System.out.println(new Date());
    System.out.println(LocalDate.now());
    System.out.printf("%02d\n", LocalDateTime.now().getMonthValue());
    
  }
}
