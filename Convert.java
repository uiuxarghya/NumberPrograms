import java.util.*;
class Convert
{
    static int n,b,oct;
    static int a[],a2[];
    Convert(int nn)
    {
        n=nn;
        a=new int[n];
        a2=new int[n];
        b=0;
        oct=0;
    }
    void bin()
    {
        int x=n;
        while(x>0)
        {
            a[b++]=x%2;
            x=x/2;
        }
    }
    void oct()
    {
        int x=n;
        while(x>0)
        {
            a2[oct++]=x%8;
            x=x/8;
        }
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number ");
        int num=sc.nextInt();
        
        Convert ob=new Convert(num);
        ob.bin();
        ob.oct();
        System.out.print("Binary Number : ");
        for(int i=b-1;i>=0;i--)
         System.out.print(a[i]);
        System.out.print("\nOctal Number : ");
        for(int i=oct-1;i>=0;i--)
         System.out.print(a2[i]);
        
    }
        
}