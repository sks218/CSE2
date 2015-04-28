public class lab13{
    public static void main(String[] args){
        int rand = (int)(Math.random()*39 + 1);
        int[][] array = {{(int)(Math.random()*39 + 1), (int)(Math.random()*39 + 1), (int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1)},
                        {(int)(Math.random()*39 + 1), (int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1)},
                        {(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1)},
                        {(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1)},
                        {(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1),(int)(Math.random()*39 + 1)}
        };
        
        System.out.println("Array before sorting");
        for(int i=0; i<array.length;i++){
            System.out.print("Row " + (i+1) + ": ");
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        
        boolean check = true;
        int blah;
        int blah1;
        for(int i=0;i<5;i++){
            check = true;
            while(check){
                check = false;
                for(int j =0;j<(array[i].length-1);j++){
                    if(array[i][j] >array[i][j+1]){
                        blah = array[i][j];
                        blah1 = array[i][j+1];
                        array[i][j] = blah1;
                        array[i][j+1] = blah;
                        check = true;
                    }
                }
            }
        }
        
        System.out.println("\nArray after sorting");
        for(int i=0; i<array.length;i++){
            System.out.print("Row " + (i+1) + ": ");
            for(int j=0; j<array[i].length;j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        int[][] newArray = new int[array.length][array[array.length-1].length];
        for(int i=0; i<newArray.length; i++){
            for(int j=0; j<newArray[0].length; j++){
                if(j>array[i].length-1){
                    newArray[i][j] = 0;
                }
                else{
                    newArray[i][j] = array[i][j];
                }
            }
        }
        
        for(int i=0; i<newArray.length;i++){
            for(int j=0; j<newArray[0].length;j++){
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    
}