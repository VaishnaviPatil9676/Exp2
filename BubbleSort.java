public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 }; // Example array

        System.out.println("Before Sorting:");
        printArray(arr);

        bubbleSort(arr); // Sorting function

        System.out.println("After Sorting:");
        printArray(arr);
    }

    // Bubble Sort method
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
