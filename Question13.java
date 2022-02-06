import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list of 5 numbers");
        int[] num = new int[5];
        for (int i = 0; i<num.length; i++){
            System.out.print("Enter the value in index "+i+" :");
            num[i] = sc.nextInt();
        }
        sc.close();

        int max = 0;
        for (int i = 0; i<num.length; i++) {
            for (int j = i + 1; j<num.length; j++ ) {
                if (num[i]>num[j]) {
                    max = num[i];
                    num[i] = num[j];
                    num[j] = max;
                }
            }
        }

        System.out.println("Second largest number is: " + num[num.length-2]);
    }
}
