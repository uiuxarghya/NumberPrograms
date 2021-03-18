import java.util.*;
class Perfect_No_9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,s=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
                s=s+i;
        }
        if(n==s)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}