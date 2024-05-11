package UTS;
public class Soal7 {
    public static void main(String[] args) {
        // Array nama-nama orang
        String[] names = {"Beny", "Defia", "Eka", "Gio", "Clayton", "Kiko", "Zifa"};

        // Cetak array sebelum diurutkan
        System.out.println("Array sebelum diurutkan:");
        printArray(names);

        // Urutkan array menggunakan Insertion Sort
        insertionSort(names);
        System.out.println("\nArray setelah diurutkan menggunakan Insertion Sort:");
        printArray(names);

        // Urutkan array menggunakan Selection Sort
        selectionSort(names);
        System.out.println("\nArray setelah diurutkan menggunakan Selection Sort:");
        printArray(names);

        // Urutkan array menggunakan Bubble Sort
        bubbleSort(names);
        System.out.println("\nArray setelah diurutkan menggunakan Bubble Sort:");
        printArray(names);
    }

    // Algoritma Insertion Sort
    public static void insertionSort(String[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Algoritma Selection Sort
    public static void selectionSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Algoritma Bubble Sort
    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Fungsi untuk mencetak array
    public static void printArray(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}