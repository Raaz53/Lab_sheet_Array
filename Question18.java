import java.util.*;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[5];
        System.out.println("Enter the name");
        for(int i=0; i<name.length; i++) {
            name[i] = sc.nextLine();
        }
        sc.close();
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println(Arrays.toString(name));
    }
}

