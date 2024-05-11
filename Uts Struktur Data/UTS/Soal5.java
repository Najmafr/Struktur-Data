package UTS;
public class Soal5 {
    public static void main(String[] args) {
        // Matriks input
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        
        // Cek apakah matriks adalah matriks identitas
        boolean isIdentity = isIdentityMatrix(matrix);
        
        // Cetak hasil
        if (isIdentity) {
            System.out.println("Matriks adalah matriks identitas.");
        } else {
            System.out.println("Matriks bukan matriks identitas.");
        }
    }
    
    public static boolean isIdentityMatrix(int[][] matrix) {
        // Cek ukuran matriks
        if (matrix.length != 3 || matrix[0].length != 3) {
            return false;
        }
        
        // Cek elemen-elemen matriks
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false;
                } else if (i != j && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        
        return true;
    }
}