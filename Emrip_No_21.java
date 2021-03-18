import java.util.*;
class Emrip_No_21
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int i,c=0,e=0,copy=n,s=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        while(copy!=0)
        {
            int d=copy%10;
            s=((s*10)+d);
            copy=copy/10;
        }
        for(i=1;i<=s;i++)
        {
            if(s%i==0)
                e++;
        }
        if(c==2 && e==2)
            System.out.println("Emrip No");
        else 
            System.out.println("Not an Emrip No");
    }
}