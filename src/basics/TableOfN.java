package basics;
import java.util.Scanner;

//takes an integer input by the user and prints a multiplication table for the first 10 multiples
class TableOfN
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1 ; i <=10 ; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
