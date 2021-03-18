import java.util.*;
class Special_No_10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,s=0,copy=n;
        while(n!=0)
        {
            int d=n%10;
            int f=1;
            for(i=1;i<=d;i++)

                f=f*i;
            s=s+f;
            n=n/10;
        }
        if(copy==s)
            System.out.println("Special Number");
        else
            System.out.println("Not a Special Number");
    }
}