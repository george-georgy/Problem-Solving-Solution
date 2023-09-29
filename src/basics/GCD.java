package basics;

import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        int result = 0;

        for (int i = 1 ; i <= firstNum ; i++){
            if(firstNum % i ==0 && secondNum%i ==0){
                result = i;
            }
        }

        System.out.println("GCD = "+result);
    }
}
