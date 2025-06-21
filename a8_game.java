public class a8_game {
    public static void main(String[] args) {
        int e=9;
        int f=1;
        //in team 4 members with min of 1 exp and 1 fresher;
        int ans=(e+f)/4;
        if(ans<=Math.min(e, f)){
           System.out.println(ans);
        }
        else if(ans>Math.min(e, f)){
            ans=Math.min(e, f);
            System.out.println(ans);
        }
    }
}
