import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, sum = 0;
        System.out.println("Enter the size");
        a = sc.nextInt();
        int[] num = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter the values in " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        for (int j = 1; j < a; j++) {
            sum += num[j];
        }
        System.out.println("the sum is: " + sum);
        Double avg = (double) sum / a;
        System.out.println("The average is: " + avg);
        sc.close();
    }
}