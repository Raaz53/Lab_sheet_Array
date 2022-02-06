import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] num = {1, 4, 5, 6, 7, 8};
        System.out.println("Enter the index you want to print but the limit is " + (num.length));
        int b= sc.nextInt();
        if(b<=6){
            int c = b-1;
            System.out.println(num[c]);
        }
        else{
            System.out.println("Only up to 6 index available");
        }
        sc.close();
    }
}
