import java.util.Arrays;

public class DoubleElementsByJared {

    public static void main(String [] args){
        
        //TEST DATA 1
        int[] numbers = {1,2,3};
        System.out.println("Test Data 1: ");
        System.out.println("Input: "+ Arrays.toString(numbers));

        System.out.print("Expected Output: [");
        for (int i = 0; i < numbers.length; i++) {
            if(i == numbers.length - 1){
                System.out.print((numbers[i] * 2));
            } else {
                System.out.print((numbers[i] * 2) +", ");
            }
        }    
        System.out.print("]\n\n--------------------------------------------------\n\n");

        //TEST DATA 2 
        int[] numbers2 = {5, 10, 15, 20};
        System.out.println("Test Data 2: ");
        System.out.println("Input: "+ Arrays.toString(numbers2));

        System.out.print("Expected Output:[");
        for (int i = 0; i < numbers2.length; i++) {
            if(i == numbers2.length - 1){
                System.out.print((numbers2[i] * 2));
            } else {
                System.out.print((numbers2[i] * 2) +", ");
            }
        }    
        System.out.print("]");
    }
}
