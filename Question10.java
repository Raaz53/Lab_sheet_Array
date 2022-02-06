import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the length of an array");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the numbers you want to reverse");
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Number in reverse");
        for (int i = arr.length-1; i>=0; i--) {
            System.out.print(arr[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        sc.close();
    }
}
