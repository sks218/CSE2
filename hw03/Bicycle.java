/*Sahib Singh
sks218
2/8/15
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Bicycle{
    
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#.##"); // allows me to return a double with 2 placeholds to the right of the decimal
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter number of counts on cyclometer: ");
        int nCounts = myScanner.nextInt();
        System.out.println("Enter number of seconds during which the counts occured: ");
        int nSeconds = myScanner.nextInt();
        
        double wheelDiameter = 27.0;  // diameter of wheel
        double PI = 3.14159; //constant PI
        double feetPerMile = 5280;  // # of ft per mil
        double inchesPerFoot = 12;  // # of inches per food
        double secondsPerMinute = 60;  // # of secs per min
        double minutesPerHour = 60;
        
        double minsTrip = nSeconds/secondsPerMinute; //convert secs to minutes for trip 1
        double hourTrip = minsTrip/minutesPerHour;
        double distanceTrip = nCounts * wheelDiameter * PI / inchesPerFoot / feetPerMile; //distance of trip in miles
        double averageMPH = distanceTrip/hourTrip;
        
        System.out.println("Trip distance: " + df.format(distanceTrip));
        System.out.println("Duration of trip: " + df.format(minsTrip));
        System.out.println("Average mph: " + df.format(averageMPH));

    }
}