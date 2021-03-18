import java.util.*;
class Niven_No
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0,copy=n;
        while(n!=0)
        {
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        if(copy%s==0)
        System.out.println("Niven number");
        else
                System.out.println("Not a Niven number");
    }
}