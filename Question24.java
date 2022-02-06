import java.util.Scanner;

public class Question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        boolean check=false;
        for(int i = 0; i<list.length ; i++) {
            if(65 == list[i] || 77 == list[i]) {
                check = true;
                break;
            }
            System.out.println(list[i]);
        }
        if(check) {
            System.out.println("It contains 65 or 77");
        }
        else{
            System.out.println("It doesnot contains 65 or 77");
        }

        sc.close();
    }
}
