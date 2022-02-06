import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list 1 ");
        int[] list1 = new int[5];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = sc.nextInt();
        }
        System.out.println("Enter the list 2 ");
        int[] list2 = new int[5];
        for (int j = 0; j < list2.length; j++) {
            list2[j] = sc.nextInt();
        }
        boolean check= true;
        if (list1.length == list2.length) {
            for (int i = 0; i < list1.length; i++){
                if(list1[i] != list2[i]) {
                    check = false;
                }
            }
        }
        else{
            check = false;
        }
        if(check) {
            System.out.println("Two list are equal");
        }
        else {
            System.out.println("Two list are not equal");
        }
        sc.close();
    }
}
