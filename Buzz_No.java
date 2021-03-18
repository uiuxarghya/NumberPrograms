import java.util.*;
class Buzz_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n%10==7 || n%7==0)
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");
    }
}