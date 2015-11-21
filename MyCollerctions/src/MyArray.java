import java.util.Arrays;
import java.util.Random;

/**
 * Created by user on 22.09.2015.
 */
public class MyArray {
    public static void main(String[] args) {


        final int ARRAY_SIZE=5;

        int[] array = new int[ARRAY_SIZE];
        Random random = new Random();


        for (int i : array ) {

            array[i]= random.nextInt(10);
            System.out.println(array[i]);

        }


        System.out.println("min=" + arrayMin(array));
    }

    public static int arrayMin(int [] arr){
        int min=arr[0];
        for(int i=0;i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];

            }
        }
        return min;
    }

}

