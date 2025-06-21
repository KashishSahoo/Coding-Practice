public class a9_jump {
    public static void main(String[] args) {
        String s="RRRBGBRBBB";
        String t="BBBRR";

        int n=t.length();
        int idx=0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(idx)==t.charAt(i)){
                idx++;
            }
        }
        System.out.println(idx+1);
       }
}
