
public class Numbers {

    public static void main(String[] args) {
        Numbers numbers=new Numbers();

        System.out.println(numbers.isEven(-4));
    }

    public boolean isEven(double n) {
        double k=Math.round(n);
       if (n==k){
           return true;
       }
        return false;
    }
}