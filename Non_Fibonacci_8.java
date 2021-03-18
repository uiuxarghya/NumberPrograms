import java.util.*;
public class Non_Fibonacci_8
{
    public static int fib(int n)
    {
        int a=0, b=1, c=0;
        while(c<n){
            c=a+b;
            a=b;
            b=c;
        }
        return(c);
    }

    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter range");
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            int g=fib(i);
            if(g!=i)
                System.out.print(i+" ");
        }
    }
}