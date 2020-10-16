import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 1D Array
        int[] numbers = { 5, 4, 6, 7, 2, 1 };
        byte i;
        System.out.println(numbers[0]);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 2D Array
        int[][] matrix = new int[3][3]; // initially all the matrix value are 0
        int[][] matrix2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        byte val = 0;
        for (i = 0; i < matrix.length; i++) {
            for (byte j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = val++;
            }
        }
        // deepToString method is used for Matrix
        System.out.println(Arrays.deepToString(matrix2));
        System.out.println(Arrays.deepToString(matrix));
    }
}