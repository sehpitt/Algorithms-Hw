package quadradichashing;

/**
 *
 * @author Eliezer Hashimi
 */
public class QuadradicHashing {

    int[] array;

    public QuadradicHashing(int... numbers) {
        array = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int index = getHashIndex(numbers[i]);

            array[index] = numbers[i];

        }
          for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private int getHashIndex(int number) {
        int index;
        int a1 = 1, a2 = 2;

        for (int i = 0; i < array.length; i++) {
            index = ((number + a1 * i + a2 * ((int) Math.pow(i, 2)))) % (array.length);
            if (array[index] == 0) {
                return index;
            }
        }

        return -1;
    }
    
}
