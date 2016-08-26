/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        int squares,sum = 0,sum2 = 0,result;
        for(int x = 0; x <= i;x++){
            sum = sum+(x*x);
            sum2 = sum2+x;
        }
            squares = sum2*sum2;
        return squares - sum;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

