import java.util.Arrays;

public class Question29 {
    public static void main(String[] args) {
        int[] num = {0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1};
        sortArray(num);
        System.out.println(Arrays.toString(num));
    }
    public static int[] sortArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for (int j=i; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
