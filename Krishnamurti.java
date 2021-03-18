class Krishnamurti
{//start of class
    public static void main(String args[])
    {//start of main()
        int n;//initialization
        System.out.println("All 3 digit Krishnamurti  Number ");
        for(n=100;n<=999;n++)
        {
            int copy=n;// copy the number
            int s=0;// initialization
            while(copy!=0)//looping
            {
                int d=copy%10;// digit extraction
                int f=1;// initialization
                for(int i=1;i<=d;i++)
                    f=f*i;// factorial
                s=s+f;
                copy=copy/10;
            }
            if(n==s)// checking
                System.out.println(n);
        }// end of loop
    }// end of main method
}// end of class
