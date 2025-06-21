public class a44_upperCase {
    public static void main(String[] args) {
        String str="aBccDEfffGGG";
        int n=str.length();
        char arr[]=str.toCharArray();
        String st="";

        for(char ch:arr){
            if(Character.isUpperCase(ch)){
                st+=ch;
            }
        }
        System.out.println(st);
    }
}
