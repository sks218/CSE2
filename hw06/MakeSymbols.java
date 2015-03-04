/*Sahib Singh
sks218
3/3/15
*/

public class MakeSymbols{
    public static void main(String[] args){
        int random = (int)(Math.random()*100 + 1); //random int generated between 0-100
        String output = "";
        boolean check;
        System.out.println("Random number generated: " + random);
        if(random%2==0){ //if even
            check =true;
        }
        else{ //if odd
            check =false;
        }
        for(int i=random; i>0; i--){
            if(check = true){ //if even, print "*"
                output+="*"; //keep adding "*" until i=0 (so it prints "*" a generated random amount of times)
            }
            else{ //if odd, print &
                output+="&";
            }
        }
        System.out.print("The output pattern: " + output); //final statement
    }
}