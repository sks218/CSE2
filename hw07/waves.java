
import java.util.Scanner;
public class waves{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 30, inclusive: ");
        int x = 0;
        //for loop
        int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,e1=0,f1=0, g1=0,h1=0,i1=0,j1=0,k1=0,l1=0;
        
        if(myScanner.hasNextInt()){  // if input is int
            x = myScanner.nextInt();
            if(x>=1 && x<=30){    //in between 1 and 30 inclusive
                //for loop
                System.out.println("For Loop:");
                //i=a
                for(a=1;a<=x;a++){
                    if(a%2==1){ //if odd
                        for(b=a;b>0;b--){   //for loops are conditioned to slope downward when odd
                            for(c=b;c>0;c--){
                                System.out.print("" +a);
                            }
                            System.out.println("");
                        }
                    }
                    else{    //if even
                       for(d=0;d<a;d++){   //for loops conditioned to slope upward when even
                            for(e=d;e>=0;e--){
                                System.out.print("" +a);
                            }
                            System.out.println("");
                        }
                    }
                }
                System.out.println("");
                
                //while loop
                System.out.println("While Loop:");
                e = 0;
                while(e<=x){
                	if(e%2==1){  //if odd
                		f=e;
                		while(f>0){   //under this while, the decrementing of f and g help with the sloping downward when odd
                			g=f;
                			while(g>0){
                				System.out.print("" +e);
                				g--;
                			}
                			System.out.println("");
                			f--;
                		}
                		e++;
                	}
                	else{
                		h=0;
                    	while(h<e){   //under this while, the decrementing of i and increment of h help with the sloping upward when even
                    		i=h;
                    		while(i>=0){
                    			System.out.print("" +e);
                    			i--;
                    		}
                    		System.out.println("");
                    		h++;
                    	}
                    	e++;
                    }
                }
                
                System.out.println("");
                //do while loop
                System.out.println("Do-While Loop");

                do{
                	i1=1;
                	do{
                		j1 = i1;
                		do{
                			if(i1%2 ==1){
                				k1 = 0;
                				do{
                					System.out.print(i1);
                					k1++;
                				}while(k1<j1);
                			}
                			else{
                				l1 = 0;
                				do{
                					System.out.print(i1);
                					l1++;
                				}while(l1<=(i1-j1));
                			}
                			System.out.println("");
                			j1--;
                		}while(j1>0);
                		i1++;
                	}while(i1<=x);
                	break;
                }while(true);
            }
            
            else{
                System.out.println("Please enter a valid input");
            }
        }
        else{
            System.out.println("please enter a valid input");
        }
    }
}