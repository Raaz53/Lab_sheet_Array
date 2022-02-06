import java.util.Arrays;

public class Question30 {
    static void rotateClockwise(int[] arr) {
        int tempLastVal = arr[arr.length-1];
        for (int i = arr.length -1 ; i>0; i--) {
            arr[i] = arr [i-1];
        }
        arr[0] = tempLastVal;

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotateClockwise(arr);
    }
}
