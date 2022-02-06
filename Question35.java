import java.util.Arrays;
import java.util.Random;

public class Question35 {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println("Before suffle: " + Arrays.toString(num));
        shuffleArray(num);
        System.out.println("After suffling: " + Arrays.toString(num));

    }
    public static int[] shuffleArray(int[] arr){
        Random rand = new Random();  
        for (int i=0; i<arr.length; i++) {
            int randomIdx = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIdx];
            arr[randomIdx] = temp;
        }
        return arr;
    }
}
