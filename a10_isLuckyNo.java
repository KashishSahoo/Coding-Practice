public class a10_isLuckyNo {
    public static void main(String[] args) {
        int n=88;
        boolean ans=lucky(n);
        System.out.println(ans);
    }
    public static boolean lucky(int n){
        int[] luckynos={4,7,44,77,47,74,444,447,474,477,744,747,774,777};
        for(int l:luckynos){
            if(n%l==0){
                return true;
            }
        }
        return false;
    }
}
