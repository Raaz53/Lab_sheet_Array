import java.util.Scanner;

public class Question23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the list");
        int[] list = new int[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        boolean check=false;
        for(int i = 0; i<list.length ; i++) {
            if(list[i]<=0 && list[i]>=-1) {
                check = true;
            }
        }
        if(check) {
            System.out.println("It contains 0 or -1");
        }
        else{
            System.out.println("It doesnot contains 0 or -1");
        }

        sc.close();
    }
}
