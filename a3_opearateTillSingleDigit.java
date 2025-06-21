public class a3_opearateTillSingleDigit {
    public static void main(String[] args) {
        int n = 25;
        int ans = operate(n);
        System.out.println(ans);
    }

    public static int operate(int n) {
        while(n >=10) {
            if (n % 2 == 1) {
                n = Math.floorDiv(n, 2);
            } else if (n % 2 == 0) {
                n = Math.floorDiv(n - 2, 2);
            }
        }
        return n;

    }
}
