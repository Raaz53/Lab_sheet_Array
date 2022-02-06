import java.util.Arrays;

public class Question34 {
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

    public static void mergeArray(int[] firstArray, int[] secondArray) {
        int[] mergedArray = new int[firstArray.length + secondArray.length];
        for(int i = 0; i < mergedArray.length; i++) {
            if (i < firstArray.length) {
                mergedArray[i] = firstArray[i];
            }
            else {
                mergedArray[i] = secondArray[i % secondArray.length];
            }
        }
        System.out.println("After merging both arrays: " + Arrays.toString(mergedArray));

        sortArray(mergedArray);

        for (int i = 0; i < mergedArray.length; i++) {
            if (i < firstArray.length) {
                firstArray[i] = mergedArray[i];
            }
            else {
                secondArray[i % secondArray.length] = mergedArray[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] firstArr = {1, 5, 6, 7, 8, 10}, secondArr = {2, 4, 9};

        System.out.println("First Array: ");
        System.out.println(Arrays.toString(firstArr));

        System.out.println("Second Array: ");
        System.out.println(Arrays.toString(secondArr));

        mergeArray(firstArr, secondArr);

        System.out.println("After Merging and Rearranging: ");

        System.out.println("First Array: ");
        System.out.println(Arrays.toString(firstArr));

        System.out.println("Second Array: ");
        System.out.println(Arrays.toString(secondArr));
    }
}
