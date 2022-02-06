import java.util.Arrays;

public class Question36 {
    static void getReplacedArray(int[] array) {
        int len = array.length;
        int[] temp = new int[len];

        for (int i = 0; i< len; i++) {
            int sum = 1;
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    sum *= array[j];
                }
            }
            temp[i] = sum;
        }

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {0, 1, 2, 3, 4, 5, 6, 7};

        getReplacedArray(arr1);
        getReplacedArray(arr2);
    }
}
