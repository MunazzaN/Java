public class sorting {
    public static void main(String[] args) {
        int[] myArray = {64, 34, 25, 12, 22, 11, 90};

        // Bubble Sort
        int n = myArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.print("Sorted array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
