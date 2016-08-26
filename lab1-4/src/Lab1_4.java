/**
 * Implement findAverage method which receives an array of integer and return the average of the numbers in the array.
 */
public class Lab1_4 {

    public float findAverage(int[] inputs)
    {
        /*
          Implement your code here
        */
        float average =0;
        for(int i =0;i<inputs.length;i++){
            average += inputs[i];
        }
        average /= inputs.length;
        return average;
    }

    public static void main(String[] args) {
        Lab1_4 l = new Lab1_4();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Average value is %f\n", l.findAverage(inputs));
    }
}
