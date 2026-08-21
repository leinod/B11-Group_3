import java.util.Arrays;
import java.util.Scanner;

public class DoubleElementsBySalcedo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;
        boolean uContinue = true;
        int testData = 0;



        while(uContinue) {
            System.out.print("Do you want make Array(1.yes or 2.no): ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter of size of array: ");
                    int num = input.nextInt();
                    int[] numbers = new int[num];
                    int[] doubles = new int[num];
                    testData++;



                    for (int i = 0; i < num; i++) {
                        System.out.print("Enter number index of " + i + " : " );
                        numbers[i] = input.nextInt();
                        doubles[i] = numbers[i] * 2;
                        ;
                    }
                    System.out.println("Test Data " + testData);
                    System.out.println("Input : " + Arrays.toString(numbers));
                    System.out.println("Result : " + Arrays.toString(doubles));
                }
                case 2 -> {
                    System.out.print("Okay, Bye Thankyou!! ");
                    uContinue = false;

                }
                default -> {
                    System.out.println("Sorry, Invalid Input. Try again.");
                }
            }


        }


    }
}
