import java.util.Scanner;

public class Question5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] items = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int[] newItems = new int[items.length - 1];
       int index = 0;
       System.out.println("Which of the element needs to eliminated");
       int itemtoRemove = sc.nextInt();
       System.out.println("");
       for (int i = 0; i < items.length; i++){
           if (items[i] != itemtoRemove){
               newItems[index] = items[i];
               index++;
            }
        }
        for (int i = 0; i<newItems.length; i++) {
           System.out.println(newItems[i]);
        }
       sc.close();
   }
}
