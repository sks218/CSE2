import java.util.Scanner;

public class HW8 {
	public static void main(String[] args) {
		char option;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
		String input = getInput(scan, "Cc");
		System.out.println("You are in a dead valley.");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
		input = getInput(scan, "Cc");
		System.out.println("You walked and walked and walked and you saw a cave!");
		cave();
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
		input = getInput(scan, "Cc");
		System.out.println("You entered a cave!");
		System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
		input = getInput(scan, "Cc");
		System.out.println("Unfortunately, you ran into a GIANT!");
		giant();
		System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
		input = getInput(scan, "AaEe", 10);
		System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
		System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
		box();
		input = getInput(scan);
		System.out.println("Hero! Have a good day!");
	}
	
	public static void giant(){
		System.out.println("                                 ---------                    ");
		System.out.println("                                |  /    \\|                   ");
		System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
		System.out.println("                           H     -----------   H              ");
		System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
		System.out.println("                           H    HHHHHHHHHHH    H                      ");
		System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
		System.out.println("                                HHHHHHHHHHH                   ");
		System.out.println("                                HHH     HHH                   ");
		System.out.println("                               HHH       HHH                   ");
	}
	
	public static void cave(){
		System.out.println("                              *****   * * * * * * * *        ");
		System.out.println("                         ***         ***                      ");
		System.out.println("                      ***               ***                   ");
		System.out.println("                 |    ***               ***                   ");
		System.out.println("                 |    ***               ***                   ");
		System.out.println("             O __|__  ***               ***                   ");
		System.out.println("           ******l    ***               ***                   ");
		System.out.println("            * *       ***               ***                   ");
		System.out.println("           *   *      ********************* * * * * * *       ");
	}
	
	public static void box(){
		System.out.println("                      *********************     *********************    *********************             ");
		System.out.println("                     ***               ***     ***               ***    ***               ***              ");
		System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
		System.out.println("                     ***               ***     ***               ***    ***               ***              ");
		System.out.println("                     *********************     *********************    *********************               "); 
	}
	
	public static String getInput(Scanner scan, String string){
		String answer = scan.next();
		if(answer.equals("C") || answer.equals("c")){
			return answer;
		}
		else{
			System.out.println("Yeah right LOSER!");
			System.exit(0);
		}
		return answer;
	}
	
	public static String getInput(Scanner scan, String string, int trial){
		String answer = "";
		boolean check = true;
		int rand=0;
		while(check){
			answer = scan.next();
			if(answer.equals("A") || answer.equals("a")){
				rand = (int)(Math.random()*10 + 1);
				if(rand%2 ==0){
					System.out.println("Critical Hit!");
					trial--;
				}
				else{
					System.out.println("Gosh! How can you miss it!");
				}
				System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
			}
			
			else if(answer.equals("E") || answer.equals("e")){
				rand = (int)(Math.random()*10 + 1);
				if(rand == 10){
					System.out.println("You've escaped the giant!");
					check = false;
				}
				else{
					System.out.println("Failed to escape the giant");
				}
				System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
			}
			
			else{
				System.out.println("Executed by giant! GAME OVER!");
				System.exit(0);
			}
			if(trial==0){
				System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
				check = false;
			}
		}
		return answer;
	}
	
	public static String getInput(Scanner scan){
		String reward = "";
		if(scan.hasNextInt()){
			int answer = scan.nextInt();
			switch (answer){
				case 1: reward = "BEST PRIZE: Diamond Sword";
						break;
				case 2: reward = "3rd Best prize: Bronze Sword";
						break;
				case 3: reward = "2nd best prize: Silver sword";
						break;
				default: reward = "A Wrong Number! You get nothing! Better restart the game LOL";
						break;
			}
			System.out.println(reward);
		}
		else{
			System.out.println("A Wrong Input! You get nothing! Better restart the game LOL");
		}
		return reward;
	}
}
