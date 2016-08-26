/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        int sum_1=0;
        int sum_2=0;
        for(int a=1; a<=i; a++){
            sum_1 += a*a;
            sum_2 += a;
        }
        sum_2 *= sum_2;
        return sum_2 - sum_1;
    }


    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

