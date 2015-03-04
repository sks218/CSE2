/*Sahib Singh
sks218
3/3/15
*/

import java.util.Scanner;
public class GetIntegers{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int[] inputs = new int[5]; //array of size 5 that will store the CORRECT inputs
        int sum=0;
        System.out.println("Enter 5 non-negative integers");
        boolean check = true; //this serves as a check if the input was an integer and non-negative
        for(int i=0; i<5; i++){
          	if(myScanner.hasNextInt()){ //if input is an integer
				inputs[i] = myScanner.nextInt();
				if(inputs[i]<0){ //input is negative then check =false
					check = false;
				}
			}
			else{
				check = false; //makes check false if not integer
			}
			if(check==false){ //when the input is either negative or not an integer, then it hits this
			    if(inputs[i]<0){
			        System.out.println("Invalid input, enter a non-negative integers");
			    }
			    else{
			        System.out.println("Invalid input, enter a non-negative integers");
			        myScanner.next(); //need this to prevent from skippin next input if previous input was string
			    }
			    i--; //if check =false, then i must decrement so we still get 5 inputs
			    check = true;// reset check to true.
			}
        }

        
        for(int j=0;j<5;j++){
            System.out.print(inputs[j] +" ");
            sum+=inputs[j]; //adding each element of the array to sum
        }
        
        System.out.println("The sum of the integers you entered: " + sum);
        
    }
}