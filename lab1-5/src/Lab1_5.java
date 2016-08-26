/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        int Sqr1 = 0 ,Sqr2 = 0;
        for(int num=1; num <= i ; num++) {
            Sqr1 += num * num;
            Sqr2 += num;
        }
        return (Sqr2*Sqr2)-Sqr1;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

