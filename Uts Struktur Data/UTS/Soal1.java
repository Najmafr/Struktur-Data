package UTS;
public class Soal1 {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        printReversedArray(inputArray);
    }

    public static void printReversedArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}