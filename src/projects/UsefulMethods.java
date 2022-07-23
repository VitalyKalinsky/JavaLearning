package projects;
import java.util.*;

public class UsefulMethods {
    // logarythm
    int log(int base, int arg) {
        if (base != arg)
            return log(base, arg, 1);
        return 1;
    }

    private int log(int base, int arg, int s) {
        if ((int) Math.pow(base, s) != arg)
            return log(base, arg, s + 1);
        else
            return s;
    }

    // factorial
    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++)
            result = result * i;
        return result;
    }

    public static ArrayList<Integer> parseIntInString(String str) {
		char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
		ArrayList<Integer> marks = new ArrayList<Integer>();
		
		for(char num : nums) {
			for(int i = 0; i < str.length();i++) {
				if(num == str.charAt(i)) {
					marks.add(Character.getNumericValue(num));
				}
			}
		}
		return marks;		
	}
}