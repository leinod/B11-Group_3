
import java.util.Arrays;public class AverageElementsByDoniel {
    public static void main(String[] args){

        int[] data1 = {10, 15, 20, 25, 30};
        System.out.println("Test Data 1:");
        System.out.println("Array:" + Arrays.toString(data1));

        int data1Average = 0;
        for(int count = 0; count < data1.length; count++){
            data1Average += data1[count];
        }
        data1Average /= data1.length;
        System.out.println("Expected Output: ");
        System.out.println("Test Data 1: Average = " + data1Average );


        System.out.println("---------------------------\n");


        int[] data2 = {5,5,5};
        System.out.println("Test Data 2:");
        System.out.println("Array:" + Arrays.toString(data2));

        int data2Average = 0;
        for(int count = 0; count < data2.length; count++){
            data2Average += data2[count];
        }
        data2Average /= data2.length;
        System.out.println("Expected Output: ");
        System.out.println("Test Data 1: Average = " + data2Average );
    }
}
