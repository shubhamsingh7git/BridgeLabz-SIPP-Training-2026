public class WarehouseManagement {

    public static void main(String[] args) {

        int[] stock = {50, 30, 20, 50, 10, 40, 30};

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int quantity : stock) {
            if (quantity > max) max = quantity;
            if (quantity < min) min = quantity;
            total += quantity;
        }

        System.out.println("Maximum Stock: " + max);
        System.out.println("Minimum Stock: " + min);
        System.out.println("Total Stock: " + total);

        System.out.println("Duplicate Quantities:");
        findDuplicates(stock);

        int k = 2;
        rotateArray(stock, k);

        System.out.println("\nArray after rotating by " + k + " positions:");
        for (int value : stock) {
            System.out.print(value + " ");
        }

        int[][] shelfGrid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("\n\nOriginal Shelf Grid:");
        printMatrix(shelfGrid);

        int[][] transposedGrid = transposeMatrix(shelfGrid);

        System.out.println("\nTransposed Shelf Grid:");
        printMatrix(transposedGrid);
    }

    public static void findDuplicates(int[] arr) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            boolean duplicatePrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    duplicatePrinted = true;
                    break;
                }
            }

            if (duplicatePrinted) continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("No duplicates found");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
