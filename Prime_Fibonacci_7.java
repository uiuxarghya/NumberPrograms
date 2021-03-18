import java.util.*;
class Prime_Fibonacci_7
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
            for(int j=1;j<=a;j++)
            {
                int d=0;
                if(a%j==0)
                {
                    d++;
                    if(d==2)
                    {
                        System.out.println(a+" ,");
                    }
                }
            }
            a=b;
            b=c;
        }
    }
}