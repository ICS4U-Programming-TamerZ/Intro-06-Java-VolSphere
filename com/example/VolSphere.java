package com.example;

/**
 * Prints Hello world with Style.
 *
 * @author Tamer
 * @version 1.0
 * @since 2024-02-16
 */
import java.util.Scanner;

// Class
public final class VolSphere {

  /** This is a private constructor used to prevent instantiation. */
  private VolSphere() {
    throw new UnsupportedOperationException("Cannot be instantiated.");
  }

  /**
   * This is the main method.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    double volume, radius, pi = StrictMath.PI;
    double decimalShift = 1000d;
    double fraction = (4d / 3d);
    try {
      Scanner sc = new Scanner(System.in);
      System.out.println("This program will help you calculate the volume of a sphere.");
      System.out.println("What is your radius? (U^1) (Units): ");
      radius = sc.nextDouble();
      if (radius > 0d) {
        volume = fraction * (pi) * (StrictMath.pow(radius, 3));
        double volumeRounded = (Math.round(volume * decimalShift)) / decimalShift;
        System.out.println("Your Volume is: " + volumeRounded + " (Units Cubed) (U^3)");
      } else {
        System.out.println("Must be positive");
      }
    } catch (Exception e) {
      System.out.println("Error " + e.getMessage());
    }
  }
}
