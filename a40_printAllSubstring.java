public class a40_printAllSubstring {
    public static void main(String[] args) {
        String str = "abc";
        printAllSubstrings(str);
    }
    public static void printAllSubstrings(String str){
        int n=str.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.println(str.substring(i,j)); 
            }
        }
    }
}
