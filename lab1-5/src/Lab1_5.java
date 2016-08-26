/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {


    int sum1=0,sum2=0,ans=0;
    public int sumSquareDifference(int i)
    {
        for(int sumof=1 ;sumof<=i; sumof++  ){
            sum1 += (sumof*sumof);
        }
        for(int sqof=1 ;sqof<=i; sqof++  ){
            sum2 += sqof;

        }
        sum2 = (sum2*sum2);
        ans = sum2-sum1;
        return ans;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

