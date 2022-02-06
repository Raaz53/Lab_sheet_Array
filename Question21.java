import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        for (int i = 0; i<list.length; i++) {
            if (list[i]%2 == 0) {
                System.out.print(list[i] + " ");
            }
        }
        System.out.print("are even numbers in list.");
        System.out.println("");
        for (int i = 0; i<list.length; i++) {
            if (list[i]%2 != 0) {
                System.out.print(list[i] + " ");
            }
        }
        System.out.print("are odd numbers in the list.");
        sc.close();
    }    
}
