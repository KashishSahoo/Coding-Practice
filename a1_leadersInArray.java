import java.util.ArrayList;
public class a1_leadersInArray {
    public static void main(String[] args) {
        int arr[]={8,10,6,2,9,7};
        int n=arr.length;
        int ans=leaders(arr,n);
        System.out.println(ans);
    }
    public static int leaders(int arr[],int n){
        ArrayList<Integer> ans=new ArrayList<>();
        int max=arr[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
        if(arr[i]>max){
            max=arr[i];
            ans.add(max);
        }
        }
        System.out.println(ans);
        return ans.size();
    }
     
}