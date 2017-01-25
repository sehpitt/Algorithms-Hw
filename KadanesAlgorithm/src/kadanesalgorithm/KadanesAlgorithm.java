package kadanesalgorithm;

/**
 *
 * @author Eliezer Hashimi
 */
public class KadanesAlgorithm {

    public static void main(String[] args) {
        int[] array = {3, -5, 7, -3, 8, -3, 6, -7, -3, -3, 6, 4, -5};
        findMaxSubArray(array);
    }
    public static void findMaxSubArray(int[] array) {

        int maxSum = Integer.MIN_VALUE;
        int cumulativeSum = 0;

        for (int i = 0; i < array.length; i++) {

            cumulativeSum += array[i];

            if (cumulativeSum > maxSum) {
                System.out.println(cumulativeSum);
                maxSum = cumulativeSum;
            } else if (cumulativeSum < 0) {
                cumulativeSum = 0;
            }
        }

        System.out.println("Max sum: " + maxSum);

    }

}
