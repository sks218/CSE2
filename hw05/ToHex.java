import java.util.Scanner;
public class ToHex {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		int[] rgb = new int[3];
		boolean check = true; //this is a check to see if input is integer AND 0-255 
		int first;
		int second;
		String[] conversion = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"}; //array of corresponding hex values
		String hexadecimal = "";
		System.out.println("Enter three integers representing RGB values (0-255):");
		
		for(int i=0; i<3; i++){
			if(myScanner.hasNextInt()){
				rgb[i] = myScanner.nextInt();
				if(!(rgb[i]>=0 && rgb[i]<=255)){
					check = false; //makes check false if not 0-255
				}
			}
			else{
				check = false; //makes check false if not integer
			}
		}
		
		if(check==true){ //if inputs are integers and 0-255, the math will be carried out to convert
			for(int j=0; j<3; j++){
				first = rgb[j]/16; //first val of hex
				second = rgb[j]%16; //second val of hex (remainder)
				hexadecimal = hexadecimal + conversion[first] + conversion[second]; //concatenate
			}
			System.out.printf("The decimal numbers R: %d, G: %d, B: %d, is represented in hexadecimal"
					+ " as: %s",rgb[0],rgb[1],rgb[2],hexadecimal);
		}
		else{ //if inputs were not integers or 0-255, math will NOT be carried out and this will print
			System.out.println("You must enter integers between 0-255");
		}
	}
}