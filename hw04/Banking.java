

import java.util.Scanner;
import java.text.DecimalFormat;

public class Banking{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("##.##");
        Scanner myScanner = new Scanner(System.in);
        double balance = (double)(Math.random()*4000)+1000;
        System.out.println("This is your bank account.\nEnter B to view your balance.\nEnter D to deposit money.\nEnter W to withdraw money. \nEnter E to exit");
        
        while(true){
            System.out.println("B-Balance, D-Deposit, W-Withdraw, E-Exit");
            String str = myScanner.next();
            str = str.toLowerCase();
            char input = str.charAt(0);
        
            if(input == 'b'){
                System.out.println("Your Balance is: " + df.format(balance));
            }
            else if (input == 'd'){
                System.out.println("Amount to Deposit: ");
                double deposit = myScanner.nextDouble();
                if(deposit>=0){
                    balance = balance + deposit;
                }
                else{
                    System.out.println("You must enter some number >0");
                }
            }
            else if(input == 'w'){
                System.out.println("Amount to Withdraw: ");
                double withdraw = myScanner.nextDouble();
                if(withdraw<=balance){
                    balance = balance - withdraw;
                }
                else{
                    System.out.println("You must enter some number less than your current balance");
                }
                
            }
            else if(input == 'e'){
                break;
            }
            
            else{
                System.out.println("You did not enter a valid command");
            }
        }
    }
}