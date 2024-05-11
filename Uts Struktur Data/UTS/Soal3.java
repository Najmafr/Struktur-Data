package UTS;
import java.util.HashMap;
import java.util.Map;
public class Soal3 {
    public static void main(String[] args) {
        // Array input
        int[] inputArray = {1, 2, 1, 3, 4, 2, 1};
        
        // Menghitung jumlah kemunculan setiap elemen
        Map<Integer, Integer> elementCount = countElements(inputArray);
        
        // Mencetak hasil
        System.out.println("Jumlah kemunculan setiap elemen:");
        for (Map.Entry<Integer, Integer> entry : elementCount.entrySet()) {
            System.out.println("Elemen " + entry.getKey() + ": " + entry.getValue());
        }
    }
    
    public static Map<Integer, Integer> countElements(int[] arr) {
        Map<Integer, Integer> elementCount = new HashMap<>();
        
        // Menghitung jumlah kemunculan setiap elemen
        for (int element : arr) {
            if (elementCount.containsKey(element)) {
                elementCount.put(element, elementCount.get(element) + 1);
            } else {
                elementCount.put(element, 1);
            }
        }
        
        return elementCount;
    }
}