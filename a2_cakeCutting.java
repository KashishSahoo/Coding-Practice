public class a2_cakeCutting {
    public static void main(String[] args) {
        //0-1
        //1-2
        //2-4
        //3-7
        //4-11
        int n=3;
        int ans=cakePieces(n);
        System.out.println(ans);
    }
    public static int cakePieces(int N){
        long mod=1000000007;
        long n=N;
        long pieces=(n*(n+1))/2+1;
        return (int) (pieces%mod);
    }
}
