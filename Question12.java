import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        boolean check = false;
        System.out.println(" Enter 5 values in array 'A' ");
        for (int i = 0; i<arr1.length; i++) {
            System.out.println("Enter the value in index " + i + " :");
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[5];
        System.out.println("Enter 5 values in array ' B ' ");
        for (int j = 0; j<arr1.length; j++) {
            System.out.println("Enter the value in index " + j + " :");
            arr1[j] = sc.nextInt();
        }
        for (int i = 0; i<arr1.length-1 ; i++) {
            for(int j = 0; i < arr2.length-1 ; j++) {
                if (arr1[i] == arr2[j]){
                    check = true;
                }
            }
            if(!check){
                for (int j = 0; j < arr2.length-1 ; j++){
                    if(arr1[i] == arr2[j]) {
                        System.out.println(arr1[i] + " ");
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}
