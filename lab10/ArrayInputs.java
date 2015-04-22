import java.util.Scanner;

public class ArrayInputs{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int length = 0;
        System.out.println("Enter an integer for the size of an array: ");
        length = myScanner.nextInt();
        int[] array = new int[length];
        int i = 0;
        int x = 0;
        while(i<length){
            System.out.println("Please enter a positive integer:");
            if(myScanner.hasNextInt()){
                x = myScanner.nextInt();
                if(isPos(x)){
                    array[i] = x;
                    i++;
                }
            }
            else{
                System.out.println("You did not enter an integer");
                myScanner.next();
            }
        }
        System.out.println("The array is:");
        for(int j = 0; j<length; j++){
            System.out.println(array[j]);
        }
    }
    
    public static Boolean isPos(int num){
        if (num>=0){
            return true;
        }
        else{
            System.out.println("The number you entered was negative");
            return false;
        }
    }
}