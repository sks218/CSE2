import java.util.Scanner;

public class Factorials{
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        boolean check = true;
        int x = 0;
        int sum = 0;
        while(check){ //continues to prompt user if there is invalid input
            System.out.println("Enter an integer: ");
            if(myScanner.hasNextInt()){
                x = myScanner.nextInt();
                check = false;
            }
            else{
                System.out.println("Invalid Input!");
                myScanner.next();
            }
        }
        for(int i=x; i>0; i--){

            sum += factorial(i);
        }
        System.out.println("");
        print(sum);
    }
    
    public static void print(int num){ //method that prints factorial once computed
        System.out.println("The super factorial of the input is: " + num);
    }
    
    public static int factorial(int input){ //method calculates factorial of num;
        int num = 1;
        for(int i= input; i>0; i--){
            num *=i;
        }
        System.out.print(num + " ");
        return num;
    }
    
}