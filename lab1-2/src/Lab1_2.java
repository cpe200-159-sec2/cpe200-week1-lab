/**
 * Implement isEquals method which returns true when the given numbers are same, false otherwise.
 */
public class Lab1_2 {

    public boolean isEquals(int input_a, int input_b)
    {
        if(input_a == input_b){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Lab1_2 l = new Lab1_2();
        System.out.printf("ฺAre they equal?: %s\n", l.isEquals(1, 2)?"True":"False");
    }
}
