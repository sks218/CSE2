/*Sahib Singh
sks218
2/8/15
*/

import java.util.Scanner;
import java.text.DecimalFormat;
public class FourDigits{
    
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("0000"); //replaces any nonexistent placeholder with 0
        Scanner myScanner = new Scanner(System.in); //create instance of scanner
        System.out.println("Enter a double: ");
        double num = myScanner.nextDouble();
        double num_1 = num - (int) num; //removes numbers to the left of the decimal point
        double num_2 = num_1*10000;
        System.out.println("The four digits to the right of the double: " +df.format(num_2));
    }
}