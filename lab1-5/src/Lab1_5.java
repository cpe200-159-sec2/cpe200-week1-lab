/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        /*
         * sum of squares = 1^2 + 2^2 + 3^2 + ... + n^2 = n(n+1)(2n+1)/6;
         * square of sum = (1 + 2 + 3 + ... + n)^2 = (n(n+1)/2)^2 = n^2(n+1)^2/4
         * find
         *  square of sum - sum of squares
         *  = n^2(n+1)^2/4 - n(n+1)(2n+1)/6
         *  = n(n+1) (n(n+1)/4 - (2n+1)/6)
         *  = n(n+1) (3n(n+1)-2(2n+1))/12
         *  = n(n+1) (3n^2+3n-4n-2)/12
         *  = n(n+1) (3n^2-n-2)/12
         *  = n(n+1) (3n+2)(n-1)/12
         *  = (n-1)n(n+1)(3n+2)/12
         */
        return (i-1) * i * (i+1) * (3*i + 2) / 12;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

