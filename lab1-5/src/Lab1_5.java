/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        int  sum1=0,sum2=0,sum3=0,diff;
        for(int j=1;j<i+1;j++)
        {
            sum1+=(j*j);
            sum2+=j;
        }
        sum3=(sum2*sum2);
        if(sum3>sum1) diff=sum3-sum1;
        else diff=sum1-sum3;
        return diff;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

