
import java.util.Scanner;


public class WhichNumber{
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int i=0;
        int[] divisor = {2,3,4,5,7,8,10};
        int[] guessArray = {2,3,4,5,6,7,8,9,10};

        System.out.println("Think of a number between 1 and 10 inclusive.");
        
        while(true){
            int count = 0;
            int found = 0;
            System.out.print("is this number divisible by " + divisor[i] + " ");
            String str = myScanner.next();
            str = str.toLowerCase();
            char input = str.charAt(0);
            
            if(input == 'y'){
                for(int j=0;j<9;j++){
                    if(guessArray[j]%divisor[i]!=0){
                        guessArray[j] = 0;
                    }
                }
            }
            else if(input == 'n'){
                for(int j=0;j<9;j++){
                    if(guessArray[j]%divisor[i]==0){
                        guessArray[j] = 0;
                    }
                }
            }
            else{
                System.out.println("Sorry, that is not a valid input");
                break;
            }
            
            for(int x=0;x<9;x++){
                if(guessArray[x]==0){
                    count++;
                }
                else{
                    found = count;
                }
            }
            if(count==8){
                System.out.print("Is your number " + guessArray[found] + " ");
                String newStr = myScanner.next();
                newStr = newStr.toLowerCase();
                char newInput = newStr.charAt(0);
                if(newInput == 'y'){
                    System.out.println("Yay!");
                }
                else if(newInput == 'n'){
                    System.out.println("That answer is not consistent, you lied.");
                }
                else{
                    System.out.println("That is not a valid input");
                }
                break;
            }
            i++;
        }
    }
}