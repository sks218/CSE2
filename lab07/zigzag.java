
import java.util.Scanner;
public class zigzag{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        boolean check = true;
        int nStars = 0;
        while(check){
            System.out.print("Enter an int between 3 and 37: ");
            if(myScanner.hasNextInt()){
                nStars = myScanner.nextInt();
                if(nStars>=3 && nStars<=37){
                    for(int i=0; i<nStars; i++){
                        System.out.print("*");
                    }
                    for(int i=0; i<nStars; i++){
                        System.out.println("");
                        for(int j=i; j>0; j--){
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                    System.out.println("");
                    for(int i=0; i<nStars; i++){
                        System.out.print("*");
                    }
                    check = false;
                }
                else{
                    System.out.println("The number is out of range [3,33]");
                }
            }
            else{
                System.out.println("Enter an integer [3,33]");
                myScanner.next();
            }
        }
        System.out.println("");
    }
}