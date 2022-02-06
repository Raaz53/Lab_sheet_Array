public class Question8 {
    public static void main(String[] args) {
        int[] items = { 11, 12, 13, 14, 55, 6, 87, 18, 29, 10};
        int max = items[0];
        int min = items[0];
        for (int i = 0; i < items.length; i++) {
            if (items[i] > max) {
                max = items[i];
            }
            if (items[i] < min) {
                min = items[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
