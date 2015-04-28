

import java.util.Scanner;

public class lab11{
    public static void main(String args[]){
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        for(int i = 0; i<50; i++){
            array1[i] = (int)(Math.random() * 100);
        }
        int min = array1[0];
        for(int i = 1; i<50; i++){
            if(min < array1[i]){
            }
            else{
                min = array1[i];
            }
        }
        System.out.println("The minimum value of array 1 is " +min);
        int max = array1[0];
        for(int i = 1; i<50; i++){
            if(max > array1[i]){
            }
            else{
                max = array1[i];
            }
        }
        System.out.println("The maximum value of array 1 is " +max);

        array2[0] = (int)(Math.random() * 100);
        for(int i = 1; i< 50; i++){
            array2[i] = array2[i- 1] + (int)(Math.random() * 50);
        }
        int min2 = array2[0];
        for(int i = 1; i<50; i++){
            if(min2 < array2[i]){
            }
            else{
                min2 = array2[i];
            }
        }
        System.out.println("The minimum value of array 2 is " +min2);
        int max2 = array2[0];
        for(int i = 1; i<50; i++){
            if(max2 > array2[i]){
            }
            else{
                max2 = array2[i];
            }
        }
        System.out.println("The maximum value of array 2 is " +max2);
        
        for(int i = 0; i<50; i++){
            System.out.print(" "+ array2[i]);
        }
        System.out.println("\nEnter an int: ");
        Scanner scan = new Scanner(System.in);
        boolean check = true;
        int x;
        int above;
        int below;
        if(scan.hasNextInt()){
            x = scan.nextInt();
            if(x > 0){
                binary(array2 , x);
            }
            else{
                System.out.println("Input not > 0");
            }
        }
        else{
            System.out.println("Not an int");
        }
    }
    
    public static void binary(int[] a, int b){
        int low = 0;
        int high = 49;
        boolean check = true;
        while(low<=high){
            int middle = (low + high) / 2;
            if(a[middle] == b){
                System.out.println("Input was found");
                System.out.println("The number above the key was "+a[middle + 1]);
                check = false;
                break;
            }
            else if(a[middle] > b){
                high = middle - 1;
            }
            else{
                low = middle + 1;
            }
        }
        if(check){
            System.out.println("Input was not found");
            System.out.println("The number below the key is " + a[high]);
            System.out.println("The number above the key is " + a[low]);
        }
        return;
    }
}