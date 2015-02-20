/*
Sahib Singh
sks218
lab05
*/
public class SpaceExploration{
    
    public static void main(String[] args){
        int year = (int)(Math.random()*11)+2000; //random integer generated between 2000-2010 inclusive
        System.out.println("Here is a timeline of space exploration events from " +year + " to 2000:");
        
        switch(year){ //switch crafted such that will print all space explorations before the randomly chosen year
        
        case 2010:
            System.out.println("2010: SpaceX sucessfully se 0nds spacecraft to orbit and back");
        case 2009:
            System.out.println("2009: N/A");
        case 2008:
            System.out.println("2008: Kepler launched to study deep space");
        case 2007:
            System.out.println("2007: N/A");
        case 2006:
            System.out.println("2006: Spacecraft returns with collections from a comet");
        case 2005:
            System.out.println("2005: Spacecraft collides with comet");
        case 2004:
            System.out.println("2004: N/A");
        case 2003:
            System.out.println("2003: Largest infrared telescope released");
        case 2002:
            System.out.println("2002: N/A");
        case 2001:
            System.out.println("2001: First spacecraft lands on asteroid");
        case 2000:
            System.out.println("2000: First spacecraft orbits an asteroid");
        //no default because a integer between 2000-2010 will always be chosen.
        //a case will always be "hit"
        }
    }
}