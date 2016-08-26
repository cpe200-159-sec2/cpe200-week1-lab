/**
 * Implement findAverage method which receives an array of integer and return the average of the numbers in the array.
 */
public class Lab1_4 {

    public float findAverage(int[] inputs)
    {
        int i=0,sum=0;
        float av=0;
        while (inputs[i]!= 0){
            sum+=inputs[i];
            i++;
        }
        av = sum/i;
        return av;
    }

    public static void main(String[] args) {
        Lab1_4 l = new Lab1_4();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Average value is %f\n", l.findAverage(inputs));
    }
}
