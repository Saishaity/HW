package test;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.valueOf(input);
        if(n>=0){
            int factorial = 1;
            for(int i =1; i<n+1; i++){
                factorial = factorial*i;
            }
            System.out.println(factorial);
        }else{
            System.out.println("Print natural number");
        }
    }
}
