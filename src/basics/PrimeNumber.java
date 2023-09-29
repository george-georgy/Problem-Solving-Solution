package basics;


import java.util.Scanner;
class PrimeNumber
{
    public static void main( String args[] )
    {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int counter = 0;

        for(int i = 1 ; i <= num ; i++){

            if(num % i == 0){
                counter++;
            }
        }
        if (counter == 2)
        {
            System.out.println(num + " is a prime number");
        }
        else
        {
            System.out.println(num + " is not a prime number");
        }
    }
}
