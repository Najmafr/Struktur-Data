package UTS;
public class Soal4 {
    public static void main(String[] args) {
        // Array input
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5};
        
        // Menghapus duplikat
        int[] uniqueArray = removeDuplicates(inputArray);
        
        // Mencetak hasil
        System.out.print("Array hasil: ");
        for (int i = 0; i < uniqueArray.length; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
    
    public static int[] removeDuplicates(int[] arr) {
        int uniqueCount = 0;
        
        // Menghitung jumlah elemen unik
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueCount++;
            }
        }
        
        // Menyalin elemen unik ke array baru
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = arr[i];
            }
        }
        
        return uniqueArray;
    }
}