public class Question22 {
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
       
        int sum=0;
        for(int i=0; i<items.length; i++) {
            if(items[i] != max && items[i] != min) {
                sum += items[i];
            }  
        }
        double avg = (double) sum/(items.length-2);
        System.out.println("The average after excluding largest and min is: " + avg);
    }
}