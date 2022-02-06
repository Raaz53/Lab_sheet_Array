import java.util.Arrays;

public class Question17 {
    public static void main(String[] args) {
        int[][] matrix = {
        { 1 },
        { 2 },
        { 3 } };
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] result = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                System.out.println(i + " " + j + "=>" + matrix[i][j]);
        
                result[j][i] = matrix[i][j]; 
        
            }
        }
        
        for (int[] i : result) {
            System.out.println(Arrays.toString(i));
        }
    }
}
