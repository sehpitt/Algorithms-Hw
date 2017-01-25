package linearhashing;

/**
 *
 * @author Eliezer Hashimi
 */
public class LinearHashing {

    int[] array;

    public LinearHashing(int... numbers) {
        array = new int[numbers.length];
        int index;

        for (int i = 0; i < numbers.length; i++) {

            index = getHashIndex(numbers[i]);

            array[index] = numbers[i];

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private int getHashIndex(int number) {
        int index;
        for (int i = 0; i < array.length; i++) {
            index = ((number % array.length) + i) % array.length;
            if (array[index] == 0) {
                return index;
            }
        }
        return -1;
    }

}
