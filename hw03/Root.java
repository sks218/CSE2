/*Sahib Singh
sks218
2/8/15
*/

import java.util.Scanner;
public class Root{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = myScanner.nextDouble();
        double guess_1 = num/3;
        double guess_2 = (2*guess_1*guess_1*guess_1 + num)/(3*guess_1*guess_1);
        double guess_3 = (2*guess_2*guess_2*guess_2 + num)/(3*guess_2*guess_2);
        double guess_4 = (2*guess_3*guess_3*guess_3 + num)/(3*guess_3*guess_3);
        double guess_5 = (2*guess_4*guess_4*guess_4 + num)/(3*guess_4*guess_4);
        double guess_6 = (2*guess_5*guess_5*guess_5 + num)/(3*guess_5*guess_5); //gets closer and closer to cube root
        System.out.println("Cube root of " + num + " is: " + guess_6);
    }
        
}