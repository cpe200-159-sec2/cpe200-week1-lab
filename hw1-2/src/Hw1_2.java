/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        /**
         * your code here
         */
        float sumgrade =0, sumcredit=0 ;

        for(int i =0;i<grade.length;i++){
            sumgrade+=grade[i];
            sumcredit+=credit[i];
        }
        float GPA = (sumgrade / sumcredit);
        return GPA;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
