package maximalsubstring;

public class MaximalSubstring {

    public static void main(String[] args) {
        int length;
        int array[] = {1, 2, 3, 4, 5, -6, -77, 3, 14, -10};
        length = array.length;

        int absoluteMax = 0, localMax = 0, startPoint = 0, lastPoint = 0, tempStartpoint = 0;
        for (int index = 0; index < length; index++) {
            localMax = localMax + array[index];
            if (localMax < 0) {
                localMax = 0;
                tempStartpoint = index + 1;
            }
            if (absoluteMax < localMax) {
                absoluteMax = localMax;
                lastPoint = index;
                startPoint = tempStartpoint;
            }
        }

        System.out.println("startPoint  " + startPoint + "  lastPoint " + lastPoint);
        while (startPoint <= lastPoint) {
            System.out.println(" " + array[startPoint++]);
        }
    }
}
