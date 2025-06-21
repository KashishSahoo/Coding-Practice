public class a13_armstrongNo {
    public static void main(String[] args) {
        int n=370;
        boolean ans=armstrong(n);
        System.out.println(ans);
    }
    public static boolean armstrong(int n){
        int num=n;
        int len=(int)Math.log10(n)+1;
        int sum=0;
        while (n!=0) {
            int rem=n%10;
            sum+=Math.pow(rem, len);
            n=n/10;
        }
        if (num==sum) {
            return true;
        }
        return false;
    }
}
