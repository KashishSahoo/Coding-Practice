public class a12_noOfWaysToClimbStairs {
    public static void main(String[] args) {
        //1 or 2 steps at a time ,no of ways to climb;
        int n=4;
        int ans=countWays(n);
        System.out.println(ans);
    }
    public static int countWays(int n){
        if(n==1 || n==2){
            return n;
        }
        return countWays(n-1)+countWays(n-2);
    }
}
