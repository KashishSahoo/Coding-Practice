import java.util.Arrays;

public class a20_maximumElement {
    public static void main(String[] args) {
        int arr[]={87,88,9,55,33,88,66,90,99};
        int n=arr.length;
        int ans[]=new int[2];
        ans=maxi(arr,n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] maxi(int arr[],int n){
        int ans[]=new int[2];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
                ans[0]=i;
                ans[1]=max;
            }
        }
        return ans;
    }
}
