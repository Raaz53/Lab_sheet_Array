import java.util.Arrays;
import java.util.Scanner;

public class Question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any six number:");
        int[] num = new int[6];
        for (int i = 0; i<num.length; i++ ) {
            num[i] = sc.nextInt();
        }

        sortArray(num);
        int min = num[num.length-1];
        int secondMin = num[num.length-2];
        System.out.println("Among given array "+Arrays.toString(num)+" in order");
        System.out.println("Minimum value is: " + min);
        System.out.println("Second minimum value is: " + secondMin);

        sc.close();
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
