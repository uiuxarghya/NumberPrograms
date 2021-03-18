import java.util.*;
class Fibonacci_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit number");
        int n=sc.nextInt();
        int a=0,b=1,c=0,i;
        for(i=0;i<=n;i++)
        {
            c=a+b;
            System.out.println(a+" ,");
            a=b;
            b=c;
        }
    }
}