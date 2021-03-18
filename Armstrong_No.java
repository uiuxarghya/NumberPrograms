import java.util.*;
class Armstrong_No
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int copy=n,s=0;
        while(n!=0)
        {
            int d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(copy==s)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}