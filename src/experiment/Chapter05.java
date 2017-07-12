/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment;

import java.io.File;
import java.util.Objects;

/**
 *
 * @author Ryan Cabanas
 */
public class Chapter05 {
  public static void main(String[] args) {
//    B[] bs = new B[2];
//    bs[0] = new B(1, 2);
//    bs[1] = new B(3, 4);
//    A[] as = bs;
//    
//    A a = as[0];
//    B b = (B) as[1];
//    
//    System.out.println(a.a);
//    System.out.println(b.a + ", " + b.b);
//    
//    B b2 = (B) a;
//    
//    System.out.println(b2.a + ", " + b2.b);
    
//    A a = new A(1);
//    A a2 = new A(1);
//
//    System.out.println(a.equals(a2));
//
//    B b = new B(1, 2);
//    B b2 = new B(1, 3);
//    
//    System.out.println(b.equals(b2));
    
//    System.getProperties().list(System.out);
//      
//    EnumTest one = EnumTest.ONE;
//    EnumTest three = EnumTest.THREE;
    
//    System.out.println(one.compareTo(three));
    
    

  }
}

enum EnumTest {
  ONE, TWO, THREE, FOUR
}


class A {
  int a;
  
  public A(int a) {
    this.a = a;
  }

  @Override
  public boolean equals(Object that) {
    if (this == that) {
      return true;
    }

    if (that == null) {
     return false;
    }

    if (this.getClass() != that.getClass()) {
      return false;
    }

    A thatA = (A) that;

    return this.a == thatA.a;
  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 29 * hash + this.a;
    return hash;
  }
  
}

class B extends A {
  public int b;
  
  public B(int a, int b) {
    super(a);
    this.b = b;
  }

  @Override
  public boolean equals(Object that) {
    // This call to the super.equals method re-uses the code so that here in the subclass you only
    // have to test for instance fields that are specific to the subclass.  Re-use!  Don't write
    // double code!
    if (!super.equals(that)) {
     return false;
    }

    B thatB = (B) that;

    return this.b == thatB.b;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 71 * hash + this.b;
    return hash;
  }
}