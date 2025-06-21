public class a14_noOfBlubsOn {
    public static void main(String[] args) {
        int n=30;
        int ans=onBlubs(n);
        System.out.println(ans);//1 4 9 16 25
    }
    public static int onBlubs(int n){
        //find no of perfect squares
        int ans=(int)Math.sqrt(n);
        return ans;
    }
}
