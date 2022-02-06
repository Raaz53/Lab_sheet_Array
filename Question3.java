import java.util.Scanner;

public class Question3 {
    public static void findVAlue(int[] items, int value){
        for(int i = 0; i<items.length;i++){
            if(items[i] == value){
                System.out.println("value found at index "+i);
                return;
            }
        }
        System.out.println("value not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] items = new int[n];
        System.out.println("Enter the elements");
        for(int i=0; i < n; i++){
            System.out.println("Number" + (i+1)+":");
            items[i] = sc.nextInt();
        }
        System.out.println("Enter the value to search");
        int value = sc.nextInt();
        findVAlue(items, value);
        sc.close();
    }
}
