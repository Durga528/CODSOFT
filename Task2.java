import java.util.*;


public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total number of subjects : ");
        int n=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            System.out.print("Enter the " + i +" subject marks (Between 1 to 100) : ");
            a[i-1]=sc.nextInt();
            if(a[i-1]>100)
            {
                System.out.println("Please Enter number between 1 to 100");
                i-=1;
            }
        }
        System.out.println();
        int total=0;
        float avg=0;
        for(int i=0;i<n;i++)
        {
            total+=a[i];
        }
        System.out.println("Total Marks Obtained : "+total +" Out of " + (n*100));
        avg=(float)total / (float)n;
        System.out.println("Average percentage : "+avg +"%");
        String grad="F";
        int grade=(int)avg;
        if(grade>=90)
        {
            grad="O";
        }
        else if(grade>=80)
        {
            grad= "A+" ;
        }
        else if(grade>=70)
        {
            grad= "A" ;
        }
        else if(grade>=60)
        {
            grad= "B+" ;
        }
        else if(grade>=50)
        {
            grad="B";
        }
        else if(grade>=40)
        {
            grad="C";
        }
        System.out.println("Overall Grade : "+grad);
    }
}