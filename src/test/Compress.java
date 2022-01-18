package test;
import java.util.Scanner;

public class Compress {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        int n = Integer.valueOf(input1);

        String input2 = scanner.nextLine();
        String[] array = input2.split(" ");
        int[] line = new int[array.length];
        int variable;
        int counter =0;
        for(int a = 0; a<array.length; a++){
            variable = Integer.valueOf(array[a]);
            if(variable!=0) {
                line[counter] = variable;
                counter++;
            }
        }
        for(int i =counter; i<array.length-line.length-1; i++){
            line[i+1]=0;
        }
        for(int j = 0; j<line.length; j++){
            System.out.print(line[j] + " ");
        }
    }
}