import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the number of array");
        int n = ab.nextInt();
        int[] x = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the element in index "+i+" :");
            x[i] = ab.nextInt();
        }
        System.out.println("");
        System.out.println("Duplicate values in given array are:");
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (x[i] == x[j])
                {
                    System.out.println(x[j]);
                }
            }
        }
        ab.close();
    }
}