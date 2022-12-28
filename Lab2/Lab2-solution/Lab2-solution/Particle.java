/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2.pkg6a;

import java.util.Random;

/**
 *
 * @author TungTh
 */
public class Particle {

  private int x;
  private int y;

  public Particle(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void ShowInfo() {
    System.out.println(
      String.format("%d %d", x, y)
    );
  }
  
  public void Move(int maxX, int maxY) {
    Random ran = new Random();
    // 4,4  -- NORTH --> 4, 3
    
    // NextInt(3) --> {0, 1, 2} --> {-1, 0, 1}
    
    int dx = ran.nextInt(3) - 1;
    while (x + dx < 0 || x + dx >= maxX) {
      dx = ran.nextInt(3) - 1;
    }    
    x += dx;
    
    int dy = ran.nextInt(3) - 1;
    while (y + dy <0 || y + dy >= maxY) {
      dy = ran.nextInt(3) - 1;
    }
    y += dy; 
    
  }
  
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
  
  
}
