import java.util.Scanner;
public class RemoveElements{
    public static void main(String [] arg){
        
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
        String answer="";
        do{
            System.out.print("Random input 10 ints [0-9]");
            num = randomInput();
            String out = "The original array is:";
            out += listArray(num);
            System.out.println(out);
            
            System.out.print("Enter the index ");
            index = scan.nextInt();
            newArray1 = delete(num,index);
            if(newArray1.length == num.length){  //if length is equal, no element was removed
                System.out.println("The index is not valid");
            }
            else{
                System.out.print("Index " + index + " element is removed");
            }
            
            String out1="The output array is ";
            out1+=listArray(newArray1); 
            System.out.println(out1);
            
            System.out.print("Enter the target value ");
            target = scan.nextInt();
            newArray2 = remove(num,target);
            if(newArray2.length == num.length){ //if length is equal, no element was removed
                System.out.println("Element "+ target + " was not found");
            }
            else{
                System.out.println("Element "+ target + " has been found");
            }
            
            String out2="The output array is ";
            out2+=listArray(newArray2);
            System.out.println(out2);
            
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
            answer=scan.next();
        }while(answer.equals("Y") || answer.equals("y"));
        int[] list = {1,2,2,4,5,6};
        int[] newList = remove(list, 2);
        for(int i=0; i<newList.length; i++){
            System.out.print("" + newList[i]);
        }
    }
    
    public static String listArray(int num[]){
        String out="{";
        for(int j=0;j<num.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=num[j];
        }
        out+="} ";
        return out;
    }
    
    public static int[] randomInput(){
        int[] num = new int[10];  //array size 10
        int x = 0;
        for(int i=0; i<10; i++){ // for loop incrimenting to store 10 random ints into array
            x = (int)(Math.random()*10 + 1); //random int from 0-10
            num[i] = x;
        }
        return num;
    }
    
    public static int[] delete(int[] list, int pos){
        int[] newList = new int[list.length -1]; //length of original list-1 because we are removing 1 element
        if(pos>=0 && pos<newList.length){ // checking bounds of position
            int a=0;  //index counter for original list
            for(int i=0; i<newList.length; i++){
                if(a == pos){ //if a==pos, then continue on with the original list but remain on same element of new list
                    a++;
                    i--;
                }
                else{
                    newList[i] = list[a]; 
                    a++;
                    
                }
                
            }
            return newList;
        }
        else{
            return list;  //if pos is not in bounds, just return original list
        }
    }
    
    public static int[] remove(int[] list, int target){
        int count =0;
        for(int j=0; j<list.length; j++){ //counts how many elements are equal to the target
            if(list[j] ==target){
                count++;
            }
        }
        
        int[] newList= new int[list.length - count]; //newList = list.length - number of targets found
        int a =0;
        for(int i=0; i<list.length; i++){
            if(list[i] == target){ //just let i increment without storing element into newlist
            }
            else{
                newList[a] = list[i];
                a++;
            }
        }
        return newList;
    }
}