import java.util.*;
class Composite_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if (c>2)

            System.out.println("Composite Number");
        else
            System.out.println("Not a Composite Number");
    }
}

