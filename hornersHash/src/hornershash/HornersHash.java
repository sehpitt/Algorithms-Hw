package hornershash;

import java.util.Arrays;

/**
 *
 * @author Eliezer Hashimi
 */
public class HornersHash {

    public static int calculate_hash(String s, int xValue) {
        char[] array = s.toCharArray();
        Arrays.sort(array);
        String newS = new String(array);
        int hashValue = 0;
        for (int i = 0; i < newS.length(); i++) {
            hashValue = xValue * hashValue + newS.charAt(i);
        }
        return hashValue;
    }

    public static void main(String[] args) {
        String s = "eei";
        int xValue = 3;

        System.out.println(calculate_hash(s , xValue));

    }
}
