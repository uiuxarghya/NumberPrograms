import java.io.*;
class LuckyNumber_22
{
    static int gap = 2;
    public static void main(String args[])
    throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.print("N = ");
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            if(isLucky(i))
                System.out.print(i + "\t");
            gap = 2;
        }
    }
    public static boolean isLucky(int n){
        if(gap > n)
            return true;
        else if(n % gap == 0)
            return false;
        n = n - n / gap;
        gap++;
        return isLucky(n);
    }
}