/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg6a;

/**
 *
 * @author TungTh
 */
public class Simulation {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws InterruptedException {
    System.out.println("HELLO OOP Friday Afternoon");

    Box b = new Box(20, 3);
    b.display();

    for (int i = 0; i < 100; i++) {
      System.out.println("MOVE PARTICLES");
      b.moveParticles();
      b.display();
      
      Thread.sleep(100);
    }

  }

}
