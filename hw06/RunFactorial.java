/*Sahib Singh
sks218
3/3/15
*/

import java.util.Scanner;
public class RunFactorial{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter an integer between 9 and 16");
        int factorial = 0;;
        int x = 0;
        boolean check = true;
        boolean isInt = true;
        
        while(check){
            isInt = myScanner.hasNextInt();
            if(isInt){ //if statement satisfied only if input was integer
                x = myScanner.nextInt();
                factorial = x;
                if(x>=9 && x<=16){ //if integer is between 9-16
                    for(int j=(x-1); j>0; j--){
                        factorial*=j; //multiply and decrement until 0
                    }
                    check = false; //false after factorial is calculated to break out of while loop
                }
            }
            else{ //if input wasn't integer, this will happen
                System.out.println("Invalid input, enter again!"); 
                myScanner.next();  //need this if it was a string input (not integer input), otherwise it would not record
            }
            if(isInt && check==true){ //if input was invalid but was an integer still
                System.out.println("Invalid input, enter again!");
            }
        }
        
        System.out.println("Input accepted: \n" + x + "! = " + factorial); //the final statement when factorial is calculated
    }
}