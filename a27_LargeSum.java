public class a27_LargeSum {
    public static void main(String[] args) {
        // second largest even pos
        // second smallest odd pos
        // [3 2 1 7 5 4]
        // [0 1 2 3 4 5]

        int arr[] = { 3, 2, 1, 7, 5, 4 };
        int n = arr.length;

        int l = Integer.MIN_VALUE; // largest from even indices
        int sl = Integer.MIN_VALUE; // second largest from even indices
        int s = Integer.MAX_VALUE; // smallest from odd indices
        int ss = Integer.MAX_VALUE; // second smallest from odd indices

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                if (arr[i] > l) {
                    sl = l;
                    l = arr[i];
                } else if (arr[i] > sl && arr[i] != l) {
                    sl = arr[i];
                }
            } else {
                if (arr[i] < s) {
                    ss = s;
                    s = arr[i];
                } else if (arr[i] < ss && arr[i] != s) {
                    ss = arr[i];
                }
            }
        }
        System.out.println(sl);
        System.out.println(ss);
        int ans = sl + ss;
        System.out.println(ans);

    }
}
