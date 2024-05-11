package UTS;
public class Soal2 {
    public static void main(String[] args) {
        // Array pertama
        int[] array1 = {1, 2, 3, 4, 5};
        
        // Array kedua
        int[] array2 = {6, 7, 8, 9, 10};
        
        // Menggabungkan dua array
        int[] mergedArray = mergeArrays(array1, array2);
        
        // Mencetak hasil penggabungan
        System.out.print("Array hasil penggabungan: ");
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        
        // Menyalin elemen dari array1 ke mergedArray
        for (int i = 0; i < arr1.length; i++) {
            mergedArray[i] = arr1[i];
        }
        
        // Menyalin elemen dari array2 ke mergedArray
        for (int i = 0; i < arr2.length; i++) {
            mergedArray[i + arr1.length] = arr2[i];
        }
        
        return mergedArray;
    }
}