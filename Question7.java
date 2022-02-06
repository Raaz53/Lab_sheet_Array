import java.util.Arrays;
import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newItems = new int[items.length + 1];
        int index = 0;
        System.out.println("Enter the index where element will be placed");
        int insertIndex = sc.nextInt();
        System.out.println("Enter what value should be placed");
        int itemToInsert = sc.nextInt();
        for (int i = 0; i<items.length; i++){
            if (i == insertIndex) {
                newItems[index] = itemToInsert;
                index++;
            }
            newItems[index] = items[i];
            index++;
        }
        System.out.println(Arrays.toString(newItems));
        sc.close();
    }
}
