import java.util.Scanner;
public class CSE2Linear{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        int i=0;
        int num =0;
        int prev = 0; //placeholder for previous value of inputs
        int[] scores = new int[15];
        System.out.println("You must enter 15 integers from 0-100 inclusive and in asceding order");
        while(i<scores.length){ //keeps running until 15 integers are entered
            System.out.println("Enter Int #" + (i+1) +":");
            if(myScanner.hasNextInt()){ //checks if input is integer
                num = myScanner.nextInt();
                if(num>=0 && num<=100){ //checks if input is between 0-100
                    if(num>=prev){ //checks if input is greater than previous input
                        prev = num;
                        scores[i] = num;
                        i++;
                    }
                    else{ //error if input is not greater than previous input
                        System.out.println("The number you entered was not larger than the previous entry");
                    }
                }
                else{ //error if input was not between 0-100
                    System.out.println("The number you entered was not between 0-100");
                }
            }
            else{ //error if input is not a valid integer
                System.out.println("Please enter a valid integer");
                myScanner.next();
            }
        }
        System.out.print("Enter a grade to search for: ");
        int search = myScanner.nextInt();
        binary(scores, search);  //calls upon binary method
        
        int[] scramble = Scramble(scores);  //scramble array is scrambled of inputted array
        System.out.println("Scrambled:");
        for(int j =0; j<scramble.length; j++){  //print scrambled array
            System.out.print(scramble[j] + " ");
        }
        System.out.print("\nEnter a grade to search for: ");
        int newSearch = myScanner.nextInt();
        scrambleSearch(scramble, newSearch);  //calls upon scrambleSearch method
    }
    
    
    public static int[] Scramble(int[] nums){
        for (int i = nums.length - 1; i > 0; i--){ //randomly replaces indexes with another
            int random = (int)(Math.random()*10 + 1); 
            int a = nums[random]; //a = some random element of array
            nums[random] = nums[i]; //that random element is assigned to another element
            nums[i] = a;  //the element replaced is swapped
        }
        
        return nums; //return scrambled array
    }
    
    public static void scrambleSearch(int[] nums, int search){
        int iterations = 0; //counter for interations
        boolean check = false;
        for(int i=0; i<nums.length; i++){ //linear search of array
            if(nums[i]==search){ //breaks out of for loop when target is found
                iterations++;
                check = true;
                break;
            }
            else{
                iterations++;
            }
        }
        if(check == true){ //if target was found
            System.out.println(search + " was found in the list with " + iterations + " iterations");
        }
        else{ //if target wasn't found
            System.out.println(search + " was not found in the lsit with " + iterations + " iterations");
        }
    }
    
    public static void binary(int[] nums, int search){ //binary search method 
        int low = 0; //low starts off at 0
        int high = nums.length -1; //high is length of array-1
        int mid = (high + low)/2;  //mid is average of high and low
        int iterations = 0;  //counter for iteration
        
        while(low <= high && nums[mid] != search){ 
            if(nums[mid] < search){ //if element at middle of array is less than search 
                low = mid + 1; //the new low is mid+1
            }
            else{ //if element at middle of array is greater than search
                high = mid -1;  //the new high is mid-1
            } 
            mid = (high + low)/2;  //mid is average of the new high and low
            iterations++;
        }
        
        if(high < low){ //if target was not found using binary search
            System.out.println(search + " was not found in the list with " + iterations + " iterations");
        }
        else{ //if target was found
            System.out.println(search + " was found in the list with " + iterations + " iterations");
        }
    }
}