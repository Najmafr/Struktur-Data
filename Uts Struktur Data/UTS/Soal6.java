package UTS;
public class Soal6 {
    public static void main(String[] args) {
        // Matriks input
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Lakukan transposisi matriks
        int[][] transposedMatrix = transposeMatrix(matrix);
        
        // Cetak hasil transposisi
        System.out.println("Matriks awal:");
        printMatrix(matrix);
        
        System.out.println("\nMatriks hasil transposisi:");
        printMatrix(transposedMatrix);
    }
    
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Buat matriks hasil transposisi
        int[][] transposedMatrix = new int[cols][rows];
        
        // Lakukan transposisi
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        
        return transposedMatrix;
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}