import java.util.Scanner;
 
public class Question14 {
    public static void displayMatrix(int[][] data) {
        int rows = data.length;
        int cols = data[0].length;
 
        System.out.println("------------------");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%-5d", data[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------");
    }
 
    public static int[][] sumEachRowAndCols(int[][] a, int rows, int cols) {
        int sumRow = 0;
        int sumCol = 0;
        int totalSum = 0;
        int result[][] = new int[rows + 1][cols + 1];
    
        for (int i = 0; i < rows; i++) {
            sumRow = 0; // Update value
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + a[i][j];
                result[i][j] = a[i][j];
            }
            result[i][cols] = sumRow;
            totalSum = totalSum + sumRow;
        }
        
        for (int i = 0; i < cols; i++) {
            sumCol = 0;
            for (int j = 0; j < rows; j++) {
                sumCol = sumCol + a[j][i];
            }
            result[rows][i] = sumCol;
        }
       
        result[rows][cols] = totalSum;
        
        return result;
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows, cols;
      
        System.out.print("Rows: ");
        rows = sc.nextInt();
        System.out.print("Columns: ");
        cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];
        
        System.out.println("Enter values for matrix: ");
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        
       
        System.out.println("The matrix is: ");
        displayMatrix(matrix);

        rows = matrix.length;
        cols = matrix[0].length;
        
     
        int[][] result = sumEachRowAndCols(matrix, rows, cols);
        
        System.out.println("The resultant matrix is: ");
        displayMatrix(result);
        sc.close();
    }
}
 
