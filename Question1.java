import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ");
        int a = sc.nextInt();
        int[] num = new int[a];
        for (int i = 0; i<a; i++){
            System.out.println("Enter the number " + (i+1));
            num[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("");
        for (int i=0; i<num.length; i++) {
            System.out.println(num[i]);
        }
    }
    
}