public class Question32 {
    public static void main(String[] args) {
        int[] num = {11, 32, 43, 24, 58, 65};


        for(int i = 0; i<num.length; i++) {
            if(num[i]%2==0) {
                System.out.print(num[i]+" ");
            }
        }
        for(int i = 0; i < num.length; i++) {
            if(num[i]%2!=0)
            {
                System.out.print(num[i]+ " ");
            }
        }
    }
}
