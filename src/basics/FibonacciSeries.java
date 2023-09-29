package basics;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of terms (maximum 20) for the Fibonacci sequence: ");
        n=myObj.nextInt();
        int [] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        int count = 2;


        while (count < n){
            fib[count] = fib[count-1] + fib[count -2];
            count++;
        }

        for (int elemnt:
             fib) {
            System.out.println(elemnt);

        }
    }
}
