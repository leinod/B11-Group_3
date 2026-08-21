import java.util.Arrays;
import java.util.Scanner;

public class DoubleElementsByDoniel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] data1 = {1,2,3};
        int[] data1NewValues = new int [data1.length];
        System.out.println("Test data 1:");
        for(int index = 0; index < data1.length; index++){
            data1NewValues[index] = data1[index] * 2;
        }

        System.out.println("input: " + Arrays.toString(data1));
        System.out.println("expected output: " + Arrays.toString(data1NewValues));


        System.out.println("\n_______________________________________");
        System.out.println("Test data 2:");

        int[] data2 = {5,10,15,20};
        int[] data2NewValues = new int [data2.length];

        int index = 0;
        while(index < data2.length){
            data2NewValues[index] = data2[index] * 2;
            index++;
        }

        System.out.println("input: " + Arrays.toString(data2));
        System.out.println("expected output: " + Arrays.toString(data2NewValues));


    }
}
