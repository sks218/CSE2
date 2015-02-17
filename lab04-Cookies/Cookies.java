

import java.util.Scanner;

public class Cookies{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the number of People: ");
        
        if (!myScanner.hasNextInt()){
            System.out.println("You did not enter an int");
        }

        else{
            int people = myScanner.nextInt();
            if(people<0){
                System.out.println("You did not enter an int >0");
            }
            
            else{
                System.out.println("Enter the number of cookies you want to buy: ");
                int cookies = myScanner.nextInt();
                System.out.println("How many do you want each person to get?");
                int each = myScanner.nextInt();
                int cookiesNeeded = people*each;
                
                
                if(cookiesNeeded>cookies){
                    int more = cookiesNeeded - cookies;
                    System.out.println("You do not have enough cookies. You need at least " + more + " cookies");
                }
                
                else{
                    int remainder = cookies%people;
                    if(remainder == 0){
                        System.out.println("You have enough cookies for everyone and the amount will divide evenly");
                    }
                    else{
                        System.out.println("You have enough cookies, but the amount will not divide evenly");
                    }
                }
            }
        }
    }
}