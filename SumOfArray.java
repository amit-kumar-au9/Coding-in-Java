import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        byte i;
        for (i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int sum = 0;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        in.close();
    }
}