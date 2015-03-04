/*sahib Singh
sks218
lab06
*/

public class SmileGenerator {
	public static void main(String[] args){
		//step 1
		System.out.println("Step 1");
		for(int i=0; i<5; i++){
			System.out.print(":)");
		}
		
		System.out.println("\nStep 2");
		int random = (int)(Math.random()*100 + 1);k
		for(int j=0; j<random; j++){
			System.out.print(":)");
		}
		
		System.out.println("\nStep 3");
		for(int k=0; k<random; k++){
			if(k%30==0){
				System.out.println("");
				System.out.print(":)");
			}
			else{
				System.out.print(":)");
			}
		}
		
		System.out.println("\nStep 4");
		int x = 1;
		while(x<random){
			for(int k=0; k<x; k++){
				System.out.print(":)");
			}
			System.out.println("");
			x++;
		}
		
		
	}

}