import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any six number");
        int[] num = new int[6];
        for (int i = 0; i<num.length; i++ ) {
            num[i] = sc.nextInt();
        }
        for(int i = 0; i<num.length; i++) {
            for(int j =i+1; j<num.length; j++) {
                if(num[i] < num[j]){
                    break;
                }
                if(j==num.length-1){
                    System.out.println(num[i] + " are the leader");
                }
            }
        }

        sc.close();
    }    
}
