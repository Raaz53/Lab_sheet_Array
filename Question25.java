public class Question25 {
    public static void main(String[] args) {
        int[] list = {20, 20, 30, 40, 50, 50, 50};
        System.out.println("Given list is ");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        int newList = list[0];
        boolean check = false;
        System.out.println("After removing duplicate values: ");
        for (int i = 0; i < list.length; i++) {
            if (newList == list[i] && !check) {
                check = true;
            }
            else if (newList != list[i]) {
                System.out.println(""+newList);
                newList = list[i];
                check = false;
            }
        }
        System.out.println(""+newList);
    }
}
