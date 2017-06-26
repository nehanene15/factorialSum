package sideProjects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Neha Nene.
 * Calculates the factorial digit sum of a number, which is the sum of the digits of the factorial of a number.
 * For example, 10! = 3628800. The sum would be 3+6+2+8+8+0+0 = 27.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        int factorial = factorial(in);
        String factString= String.valueOf(factorial);
        String[] indNums = factString.split("");
        int sum = 0;
        for(int i=0;i<factString.length()-1;i++){
            sum += Integer.parseInt(indNums[i]);
        }
        System.out.println(sum);
    }

    private static int factorial(int in){
        if(in ==0){
            return 1;
        }
        return in*factorial(in-1);
    }
}
