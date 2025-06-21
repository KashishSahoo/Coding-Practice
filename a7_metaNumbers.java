public class a7_metaNumbers {
    public static void main(String[] args) {
        int n=20;
        int ans=meta(n);
        System.out.println(ans);
    }
    public static int meta(int n){
        int cnt=0;
        for (int i = 1; i <=n; i++) {
            if(i%1==0 && i%2==0 && i%4==0 && i%8==0 && i%10!=0){
                System.out.println(i);
                cnt++;
            }
        }
        return cnt;
    }
}
