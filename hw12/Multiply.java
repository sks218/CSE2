

import java.util.Scanner;

public class Multiply{
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        boolean multiplyCheck = true; // boolean to check if matrices are mulitpliable
        boolean intCheck = true; //boolean to check if inputs are integers>0
        int firstWidth = 0;
        int firstHeight = 0;
        int secondWidth = 0;
        int secondHeight = 0;
        while(intCheck && multiplyCheck){ //will break out only if integers inputed are >0 and matrices are multipliable
            System.out.println("Enter width of first matrix: ");
            if(myScanner.hasNextInt()){
                firstWidth = myScanner.nextInt();
                System.out.println("Enter height of first matrix");
                if(myScanner.hasNextInt()){
                    firstHeight = myScanner.nextInt();
                    System.out.println("Enter width of second matrix");
                    if(myScanner.hasNextInt()){
                        secondWidth = myScanner.nextInt();
                        System.out.println("Enter height of second matrix");
                        if(myScanner.hasNextInt()){
                            secondHeight = myScanner.nextInt();
                            if(firstWidth>0 && firstHeight>0 && secondWidth>0 && secondHeight>0){
                                intCheck = false; // inputs satisfy the requirements
                                if(firstWidth != secondHeight){
                                    System.out.println("These matrices are not multiplicable");
                                }
                                else{
                                    System.out.println("These matrices ARE multiplicable");
                                    multiplyCheck = false; // matrices are multipliable 
                                }
                            }
                        }
                    }
                }
            }
            if(intCheck ==true){ //inputs were not correct
                System.out.println("Please enter an integer that is greater than 0");
            }
        }
        int[][] firstRandom = randomMatrix(firstWidth, firstHeight); //random matrix
        int[][] secondRandom = randomMatrix(secondWidth, secondHeight); //random matrix
        System.out.println("First random matrix with inputed dimensions: ");
        printMatrix(firstRandom);
        System.out.println("Second random matrix with inputed dimensions: ");
        printMatrix(secondRandom);
        
        int[][] mult = matrixMultiply(firstRandom, secondRandom); 
        System.out.println("Product of two random matrices: ");
        printMatrix(mult);
        
    }
    
    public static int[][] randomMatrix(int width, int height){
        int[][] matrix = new int[height][width];
        int random = 0;
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                random = (int)(((Math.random()*21)) - 10.5); //generates random int between -10 and 10 inclusive
                matrix[i][j] = random;
            }
        }
        return matrix;
    }
    
    public static int[][] matrixMultiply(int[][] a, int[][] b){
        int heightA = a.length;
        int widthA = a[0].length;
        int heightB = b.length;
        int widthB = b[0].length;
        if(widthA == heightB){
            int[][] multiply = new int[heightA][widthB];
            for(int i=0; i < heightA; i++){ 
                for(int j=0; j<widthB; j++){ 
                    for(int k=0; k < widthA; k++){ 
                        multiply[i][j] += a[i][k] * b[k][j]; //linear combination
                    }
                }
            }
            return multiply;
        }
        else{
            System.out.println("These matrices are not multipliable"); //not multiplicable
            return null; //returns null if matrices are not multiplicable
        }
    }
    
    public static void printMatrix(int[][] array){ //used same printMatrix method from lab12 (assumed it was row major)
        int height = array.length;
        int width = array[0].length;
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}