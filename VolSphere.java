/*

Create a (console) program that will:
Ask the user to enter the radius of a sphere (allowing decimal input)
Calculate and display the volume a the sphere with the given radius
Note: Do NOT use 3.14! Instead use Math.PI
Round the answer to 3 decimal places
Make sure to include units!
If the user enters a negative number, tell the user and end the program.
Don’t worry about handling non-decimal input for now.

*/

import java.util.*;

public class VolSphere {
    public static void main(String[] args) {
        double Volume, Radius, pi = StrictMath.PI;
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("This program will help you calculate the volume of a sphere.");
            Radius = sc.nextDouble();
            if (Radius >= 0d) {
                Volume = (4d / 3d) * (pi) * (StrictMath.pow(Radius, 3));
                double VolumeRounded = Math.round(Volume*1000)/1000;
                System.out.println("Your Volume is: " + VolumeRounded);
            }
            else {
                System.out.println("No Negative Numbers");
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }


    }
}
