package basics;

import java.util.Scanner;
class FactorOFNumber
{
    public static void main(String args[])
    {
        Scanner myObj = new Scanner(System.in);
        int number = myObj.nextInt();

        for(int i = 1 ; i <= number ; i++){

            if(number % i == 0){
                System.out.println(i);
            }
        }


    }
}