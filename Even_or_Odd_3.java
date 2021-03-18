import java.util.*;
// A simple Java program 
// to check for even or odd 
class Even_or_Odd_3
{ 	
    // Returns true if n 
    // is even, else odd 
    static boolean isEven(int n) 
    { 
        // Return true if 
        // n/2 does not result 
        // in a float value. 
        return ((n / 2) * 2 == n); 
    } 
    // Driver code 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n =sc.nextInt(); 
        if(isEven(n) != false) 
            System.out.print( "Even" ); 
        else
            System.out.print( "Odd" ); 
    } 
} 