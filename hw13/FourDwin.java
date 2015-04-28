/*Sahib Singh
cse-2
hw13
4/28/15
*/

//i did not complete the 4-d sort. i just filled the 4-d array in and print out the count, sum, and mean.


import java.util.Scanner;
public class FourDwin{
    public static void statArray(double[][][][] array){
        int count = 0;
        double sum =0;
        for(int i=0;i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                for(int k=0; k<array[0][0].length;k++){
                    for(int l=0;l<array[0][0][0].length;l++){
                        sum+= array[i][j][k][l];
                        count++;
                    }
                }
            }
        }
        System.out.println("Members: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + (sum/count));
    }
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        boolean check = true;
        while(check){
            System.out.println("Enter an integer X: ");
            if(myScanner.hasNextInt()){
                x = myScanner.nextInt();
                System.out.println("Enter an integer Y>X: ");
                if(myScanner.hasNextInt()){
                    y = myScanner.nextInt();
                    if(y>x){
                        check = false;
                    }
                    else{
                        System.out.println("Invalid input. Y must be greater than X.");
                        myScanner.next();
                    }
                }
                else{
                    System.out.println("Invalid input");
                    myScanner.next();
                }
            }
        }
        int random1 = (int)(Math.random()*(y-x) + x);
        int random2 = (int)(Math.random()*(y-x) + x);
        int random3 = (int)(Math.random()*(y-x) + x);
        double[][][][] array = new double[3][random1][random2][random3];
        double rand = 0;
        for(int i=0;i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                for(int k=0; k<array[0][0].length;k++){
                    for(int l=0;l<array[0][0][0].length;l++){
                        rand = Math.random()*30;
                        array[i][j][k][l] = rand;
                    }
                }
            }
        }
        statArray(array);
    }
}