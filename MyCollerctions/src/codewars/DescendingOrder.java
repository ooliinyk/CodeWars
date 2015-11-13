package codewars;

/**
 * Created by user on 09.10.2015.
 */
public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(123456789));
    }

    public static int sortDesc(final int num) {


            int result = 0;
            int numm=num;
            while(numm > 0) {
                result = result * 10 + numm % 10;
                numm /= 10;
            }



        return  result;

    }
}