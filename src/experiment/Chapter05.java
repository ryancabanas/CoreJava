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
    
    
    
    
  }
}

class A {
  public int a;
  
  public A(int a) {
    this.a = a;
  }
}

class B extends A {
  public int b;
  
  public B(int a, int b) {
    super(a);
    this.b = b;
  }
}