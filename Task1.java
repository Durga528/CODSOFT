import java.util.Scanner;
import java.util.Random;
public class Task1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int rounds = 3;
        int round=1;
        int total_score=0;
        while(rounds-->0)
        {
        System.out.println("Round " + (round++));
        Random r=new Random();
        int number=r.nextInt(100);
        // System.out.println(number);
        boolean flag=true;
        int c=10;
        while(c!=0)
        {
            System.out.println("\nYou have " + c + " attempts to guess the number");
            System.out.print("\nGuess the number (Between 1 to 100) : ");
            int user_number=sc.nextInt();
            if(user_number == number)
            {
                System.out.println("\nCongratulations ! you have guessed the correct number");
                total_score += (2*c);
                flag=false;
                System.out.println("---------------------------------------\n");
                break;
            }
            else if(user_number > number)
            {
                System.out.println("The number is too large");
            }
            else
            {
                System.out.println("The number in too small");
            }
            c--;
        }
        if(flag)
        {
            System.out.println("\nYou have failed to guess the number");
            System.out.println("---------------------------------------\n");
        }
        }
        System.out.println("After Three rounds the score is "+ total_score);
    }
}