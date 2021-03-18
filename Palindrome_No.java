import java.util.*;
class Palindrome_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente a number");
        int n=sc.nextInt();
        int r=0,copy=n;
        while(n!=0)
        {
            int d=n%10;
            r=(d)+r*10;
            n=n/10;
        }
        if(r==copy)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");

    }
}