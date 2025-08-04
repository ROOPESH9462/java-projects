import java.util.Scanner;
public class numberguess {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nwellcome to number guess game we are happy to you are here.....");
        int d=(int)(Math.random()*100)+1;
        System.out.println("iam thinking of a number let me know your guess");
        System.out.println("you must remember that number should be in range of 1 to 100");

        while(true){
            System.out.println("enter your guess");
            int a=sc.nextInt();
            if(a<d){
                System.out.println("you entered number is to low");
            }
            else if(a>d){
                System.out.println("you entered number is to high");
            }
            else{
                System.out.println("you get it: "+d+" is what i guessed");
                break;
            }
        }
    }
}
