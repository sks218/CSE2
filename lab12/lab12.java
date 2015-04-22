public class lab12{
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int[][] matrix = new int[height][width];
        int count = 1;
        if(format == true){
            for(int i=0; i<height; i++){
                for(int j=0; j<width; j++){
                    matrix[i][j] = count;
                    count++;
                }
            }
        }
        else{
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    matrix[j][i] = count;
                    count++;
                }
            }
        }
        return matrix;
    }
    
    public static void printMatrix(int[][] array, boolean format){
        int height = array.length;
        int width = array[0].length;
        if(format == true){
            for(int i=0; i<height; i++){
                for(int j=0; j<width; j++){
                    System.out.print(array[i][j] + " ");
                }
                System.out.println("");
            }
        }
        else{
            for(int i=0; i<width; i++){
                for(int j=0; j<height; j++){
                    System.out.print(array[j][i] + " ");
                }
                System.out.println("");
            }
        }
    }
    
    public static int[][] translate(int[][] array){
        int height = array.length;
        int width = array[0].length;
        int[][] newArray = new int[height][width];
        for(int i=0; i<height; i++){
            for(int j=0; j<width; j++){
                newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }
    
    public static int[][] addMatrix(int[][] a, boolean formatA, int[][] b, boolean formatB){
        int heightA = a.length;
        int widthA = a[0].length;
        int heightB = b.length;
        int widthB = b[0].length;
        if(heightA == heightB && widthA == widthB){
            int[][] add = new int[heightA][widthA];
            if(formatA == false){
                a = translate(a);
            }
            if(formatB == false){
                b = translate(b);
            }
            for(int i=0; i<heightA; i++){
                for(int j=0; j<widthA; j++){
                    add[i][j] = a[i][j] + b[i][j];
                }
            }
            return add;
        }
        else{
            System.out.println("The arrays can't be added!");
            return null;
        }
    }
    
    
    public static void main(String[] args){
        int width = (int)(Math.random()*5 + 1);
        int height = (int)(Math.random()*5 + 1);
        System.out.println("Generating a matrix with width " + width + " and height " + height + ":");
        int[][] A = increasingMatrix(width,height,true);
        printMatrix(A, true);
        System.out.println("Generating a matrix with width " + width + " and height " + height + ":");
        int[][] B = increasingMatrix(width,height,false);
        printMatrix(B, false);
        
        int newWidth = (int)(Math.random()*5 + 1);
        int newHeight = (int)(Math.random()*5 + 1);
        
        int[][] C = increasingMatrix(newWidth, newHeight, true);
        System.out.println("Adding two matrices");
        printMatrix(A, true);
        System.out.println("plus");
        printMatrix(B, false);
        
        System.out.println("Translating column major to row major input. OUTPUT: ");
        int[][] add = addMatrix(A, true, B, false);
        printMatrix(add, true);
        
        int[][] newAdd = addMatrix(A, true, C, true);
        if(newAdd == null){
            System.out.println("Unable to add input matrices");
        }
        else{
            printMatrix(newAdd, true);
        }
    }
}