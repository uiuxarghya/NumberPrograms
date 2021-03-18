import java.util.*;
class Prime_Palindrome_5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int r=0,copy=n,i,c=0,e=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        while(n!=0)
        {
            int d=n%10;
            r=d+r*10;
            n=n/10;
        }
        for(i=1;i<=r;i++)
        {
            if(r%i==0)
                e++;
        }
        if(c==2 && e==2)
            System.out.println("Prime Palindrome");
        else
            System.out.println("Not Prime Palindrome");
    }
}