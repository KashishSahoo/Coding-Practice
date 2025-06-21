import java.util.ArrayList;

public class a11_divBy11 {
    public static void main(String[] args) {
        long arr[]={5,5,5,5,5,5,5,5,5,5,5,5,0,0};
        int n=arr.length;
        long ans=solve(arr,n);
        System.out.println(ans);
    }
    public static int solve(long arr[],int n){
        int zero_cnt=0;
        int five_cnt=0;

        for (int i = 0; i < arr.length; i++) { 
            if(arr[i]==0){
                zero_cnt++;
            }
            else if(arr[i]==5){
                five_cnt++;
            }
        }
        if(zero_cnt==0) return -1;
        if(five_cnt==0) return 0;

        int req_five=((five_cnt)/9)*9;
        ArrayList<Integer> ans=new ArrayList<>();
        while (req_five!=0) {
            ans.add(5);
            req_five--;
        }
          while (zero_cnt!=0) {
            ans.add(0);
            zero_cnt--;
        }
        int res=0;
        for(int el:ans){
           res=res*10+el;
        }
        System.out.println(ans);

        return res;
        

    }

}
