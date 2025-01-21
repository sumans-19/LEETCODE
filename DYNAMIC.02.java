// A simple recursive CPP program
// first n Tribonacci numbers.
import java.io.*;

class GFG {
    
    // Recursion Function
    static int printTribRec(int n)
    {
        
        if (n == 0 || n == 1 || n == 2)
            return 0;
            
        if (n == 3)
            return 1;
        else
            return printTribRec(n - 1) + 
                   printTribRec(n - 2) +
                   printTribRec(n - 3);
    }
    
    static void printTrib(int n)
    {
        for (int i = 1; i < n; i++)
            System.out.print(printTribRec(i)
                             +" ");
    }
     
    // Driver code
    public static void main(String args[])
    {
        int n = 10;

        printTrib(n);
    }
}



// DYNAMIC PROGRAMINNG CAN BE USED TO REDUCE THE SAME CODES TIME COMPLEXITY AND SPACE COMPLEXITY 

// A space optimized
// based Java program
// to print first n 
// Tribinocci numbers.
import java.io.*;

class GFG {
    
    static void printTrib(int n)
    {
        if (n < 1)
            return;
    
        // Initialize first
        // three numbers
        int first = 0, second = 0;
        int third = 1;
    
        System.out.print(first + " ");
        if (n > 1)
            System.out.print(second + " ");
        
        if (n > 2)
            System.out.print(second + " ");
    
        // Loop to add previous
        // three numbers for
        // each number starting
        // from 3 and then assign
        // first, second, third
        // to second, third, and curr
        // to third respectively
        for (int i = 3; i < n; i++) 
        {
            int curr = first + second + third;
            first = second;
            second = third;
            third = curr;
    
            System.out.print(curr +" ");
        }
    }
    
    // Driver code
    public static void main(String args[])
    {
        int n = 10;
        printTrib(n);
    }
}


