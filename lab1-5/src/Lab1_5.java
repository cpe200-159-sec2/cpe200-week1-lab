/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {   int sumsquare=0,squaresum=0,difference=0;
        for(int n=1;n<=i;n++){
            sumsquare+=Math.pow(n,2);
            squaresum+=n;
        }
        Math.pow(squaresum,2);
        difference=squaresum-sumsquare;
        return difference;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

