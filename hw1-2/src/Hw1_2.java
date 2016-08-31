/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
      float sumcred=0, sumgrd=0;
        for (int j =0;j<credit.length;j++) {
            sumcred += credit[j];
            sumgrd += credit[j] * grade[j];
        }
        return sumgrd/sumcred;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
