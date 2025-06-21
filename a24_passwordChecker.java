public class a24_passwordChecker {
    public static void main(String[] args) {
        //at least 4 char
        //at least one numeric
        //at least one capital
        //no spaces or slash
        //starting chat cannot be numeric
        String password = "aA1_67";
        boolean ans=check(password);
        System.out.println(ans);
    }
    public static boolean check(String password){
        int n=password.length();
        if(n<4){
            return false;
        }
         if(password.charAt(0)>=48 && password.charAt(0)<=57){
                return false;
            }
        int num=0;
        int cap=0;
        for(int i=0;i<n;i++){
            if(password.charAt(i)==' ' || password.charAt(i)=='/'){
                return false;
            }
            else if(password.charAt(i)>=65 && password.charAt(i)<=90){
                cap++;
            }
             else if(password.charAt(i)>=48 && password.charAt(i)<=57){
                num++;
            }
        }
        if(num<1){
            return false;
        }
        if(cap<1){
            return false;
        }
        return true;
    }
}
