import java.util.*;
class Magic_No
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int c=n,s=0;
        while(n<9)
        {
            while(c!=0)
            {
                int d=c%10;
                s=s+d;
                c=c/10;
            }
        }
        if(n==1)
            System.out.println("Magic number");
        else 
            System.out.println("Not a Magic number");
    }
}