import java.util.Arrays;

public class a28_productSmallestPair {
    public static void main(String[] args) {
        int num = 9;
        int arr[] = { 5, 2, 4, 3, 9, 7, 1 };
        Arrays.sort(arr);
        int sum = arr[0] + arr[1];
        if (sum <= num) {
            System.out.println(arr[0] * arr[1]);
        }
        else {
            System.out.println("No such pair exists");
        }
    }
}
