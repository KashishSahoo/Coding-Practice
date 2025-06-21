// Convert a decimal number to a number in base N
// Example: Convert 718 to base 12
public class a29_decToNbased {
    public static void main(String[] args) {
        int n = 718;
        int base = 12;
        StringBuilder result = new StringBuilder();
        int arr[] = new int[100];
        int idx = 0;
        while (n > 0) {
            arr[idx] = n % base;
            n = n / base;
            idx++;
        }
        for (int i = idx - 1; i >= 0; i--) {
            if (arr[i] < 10) {
                result.append(arr[i]);
            } else {
                result.append((char) (arr[i] - 10 + 'A'));
            }

        }
        System.out.println(result.toString());
    }
}
