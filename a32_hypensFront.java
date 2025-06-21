public class a32_hypensFront {
    public static void main(String[] args) {
        String str="Move--all-hyphens--to-front";
        StringBuilder ans= new StringBuilder();
        int n=str.length();
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)=='-'){
                ans.append('-');
            }
        }
        for (int i = 0; i < n; i++) {
            if(str.charAt(i)!='-'){
                ans.append(str.charAt(i));
            }
        }
        System.out.println(ans.toString());
    }
}
