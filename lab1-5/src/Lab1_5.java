/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        /**
         * Your code here
         */
        int sum=0,sumofSquares=0,squareofSum=0;

        for(int j=1;j<=i;j++){
            sumofSquares += j*j;
            sum += j;
        }

        squareofSum = sum*sum;

        if(squareofSum-sumofSquares>0){
            return squareofSum-sumofSquares;
        }
        else{
            return sumofSquares-squareofSum;
        }
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

