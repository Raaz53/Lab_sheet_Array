import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[5];
        System.out.println("Enter any five number ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextInt();
        }
        boolean check = false;
        int sumlist = 0;     
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j<list.length; j++){
                for(int k=0; k < list.length; k++){
                    if(list[i]+list[j] == list[k]) {
                        sumlist =list[k];
                        check = true;
                    }
                }
            }
        }
        if (check) {
            System.out.println("Targeted value: "+sumlist);
        }
        else {
            System.out.println("No such value found");
        }
        sc.close();
    }
}
