/* Sahib Singh
sks218 
2/6/15
Lab03

*/
import java.util.Scanner; //Scanner package

public class BigMac{
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); //create instance of scanner
        System.out.println("Enter the number of Big Macs (interger >0): ");
        int nBigMacs = myScanner.nextInt(); //records number of bigmacs
        System.out.println("Enter the price for a Big Mac (as a double in for xx.xx): ");
        double BigMacPrice = myScanner.nextDouble(); //records price per bigmac
        System.out.println("Enter percent tax as a whole number(xx): ");
        double taxRate = myScanner.nextDouble(); //records percent as whole number
        taxRate /= 100; //convert percentage to proportion
        double cost = nBigMacs*BigMacPrice*(1+taxRate);
        int dollars = (int)cost;
        int dimes = (int)(cost*10)%10;
        int pennies = (int)(cost*100)%10;
        System.out.println("The total cost of " + nBigMacs +  " BigMacs when a BigMac costs " + BigMacPrice + " with a sales tax of "
        + (int)(taxRate*100) + "% is $" + dollars + "." + dimes + pennies);
        
        }
}