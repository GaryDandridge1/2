/**
 * Class: Speed of light
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: August 18, 2023
 * description: 1.15.9 This program will show how covert meter and second to Speed of light
 */
public class SpeedOfLight {
    public static void main(String[] args){
        double Seconds = 5;
        double Meters = 340;
        double speedoflight = Seconds * Meters;
        double KiloMetersPerSeconds= speedoflight/1000;
                System.out.println("Speed of light is equal to Meters per second equal M.P.S.");
                System.out.println("Speed Of Light is equal to Meter per second divide by a 1000 to covert Kilometers per second equal K.P.S.");
                System.out.println("Speed of light is: " + speedoflight + (" M.P.S."));
                System.out.println("Speed of light is: " + KiloMetersPerSeconds + (" K.P.S."));
    }
}