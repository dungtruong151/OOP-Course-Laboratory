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
public class Box {

  private int w;
  private int h;

  private Particle[] particles;
  private int nP;

  public Box(int w, int h) {
    this.w = w;
    this.h = h;

    nP = 0;
    particles = new Particle[500];

    AddParticle();
    AddParticle();
    AddParticle();
  }

  private void AddParticle() {
    if (nP < 500) {
      Random ran = new Random();
      int px = ran.nextInt(w);
      int py = ran.nextInt(h);

      Particle p = new Particle(px, py);
      particles[nP] = p;
      nP++;
    }
    else {
      System.out.println("TOO MANY PARTICLES");
    }
  }

  private int CountCollision() {
    int nCollision = 0;

    // o o o o x o
    // o x o o o o
    // o o o o o o
    boolean[][] occupied = new boolean[h][w];

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        occupied[i][j] = false;
      }
    }

    for (int i = 0; i < nP; i++) {
      int pX = particles[i].getX();
      int pY = particles[i].getY();

      if (occupied[pY][pX]) {
        nCollision++;
      }

      occupied[pY][pX] = true;
    }

    return nCollision;
  }

  public void moveParticles() {
    for (int i = 0; i < nP; i++) {
      particles[i].Move(w, h);
    }

    int nCollision = CountCollision();

    for (int i = 0; i < nCollision; i++) {
      AddParticle();
    }

  }

  public void display() {
    // o o x o o o
    // o x o o x o
    // o o o o o o

    boolean[][] occupied = new boolean[h][w];

    for (int i = 0; i < h; i++) {
      for (int j = 0; j < w; j++) {
        occupied[i][j] = false;
      }
    }

    for (int i = 0; i < nP; i++) {
      int pX = particles[i].getX();
      int pY = particles[i].getY();
      occupied[pY][pX] = true;
    }

    System.out.print(" ");
    for (int j = 0; j < w; j++) {
      System.out.print("-");
    }
    System.out.println();

    for (int i = 0; i < h; i++) {
      System.out.print("|");
      for (int j = 0; j < w; j++) {
        if (occupied[i][j]) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println("|");
    }

    System.out.print(" ");
    for (int j = 0; j < w; j++) {
      System.out.print("-");
    }
    System.out.println();

//    System.out.println(
//            String.format("Box of %d x %d with %d", w, h, nP));
//
//    for (int i = 0; i < nP; i++) {
//      particles[i].ShowInfo();
//    }
  }

  public int getW() {
    return w;
  }

  public int getH() {
    return h;
  }
}
