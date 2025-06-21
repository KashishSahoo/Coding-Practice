public class a41_reverseString {
    public static void main(String[] args) {
        String str = "hello";
        String reversed = revString(str);
        System.out.println(reversed); // Output: "olleh"
    }
    public static String revString(String str){
        int n=str.length();
        int l=0;
        int r=n-1;
        char[] arr=str.toCharArray();
        while (l<=r) {
            char t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        return new String(arr);
    }
}
