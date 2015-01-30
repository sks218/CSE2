/*
Sahib Singh sks218
1/30/15
lab02
*/


/*
Objective:
print the number of minutes for each trip
print the number of counts for each tirp
print the distance of each trip in miles
print the distance for the two trips combined
*/


public class Cyclometer{
    
    public static void main(String args[]){
        int secsTrip1 = 480;  // seconds it took for first trip
        int secsTrip2 = 3220;  // seconds it took for second trip
        int countsTrip1 = 1561;  // count for first trip
        int countsTrip2 = 9037; //count for second trip
        
        double wheelDiameter = 27.0,  // diameter of wheel
        PI = 3.14159, //constant PI
        feetPerMile = 5280,  // # of ft per mil
        inchesPerFoot = 12,   // # of inches per food
        secondsPerMinute = 60;  // # of secs per min
        double distanceTrip1, distanceTrip2, totalDistance; //
        
        double minsTrip1 = secsTrip1/secondsPerMinute; //convert secs to minutes for trip 1
        double minsTrip2 = secsTrip2/secondsPerMinute; //convert secs to min for trip 2
        
        System.out.println("Trip 1 took " + minsTrip1 + " minutes and had " + countsTrip1 + " counts");  //print min and count of trip 1
        System.out.println("Trip 2 took " + minsTrip2 + " minutes and had " + countsTrip2 + " counts"); //print min and count of trip 2
        
        distanceTrip1 = countsTrip1 * wheelDiameter * PI / inchesPerFoot / feetPerMile; //distance of trip 1 in miles (converted from inches)
        distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile; //distance of trip 2 in miles (converted from inches)
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 distance: " + distanceTrip1); //prints distance of trip 1
        System.out.println("Trip 2 distance " + distanceTrip2); //prints distance of trip 2
        System.out.println("The total distance in miles: " + totalDistance); //prints total distance of trips

        

        
        
    }
}