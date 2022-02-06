import java.util.Arrays;

public class Question15 {
    public static void main(String[] args) {
        
        int[][] matrix1 = {
            {1, 2, 3 },
            {4, 5, 6 }
        };

        int[][] matrix2 = {
            { 2, 4, 6 },
            { 3, 2, 1 }
        };

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }
    }
}