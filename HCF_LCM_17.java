import java.util.*; 
class HCF_LCM_17
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int min=Math.min(a,b);
        int h=0;
        for(int i=1;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
                h=i;
        }
        double l=(a*b)/h;
        System.out.println("HCF= "+h);
        System.out.println("LCM= "+l);
    }
}
