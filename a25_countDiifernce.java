public class a25_countDiifernce {
    public static void main(String[] args) {
        int arr[]={12,3,14,56,77,13};
        int n=arr.length;
        int cnt=0;
        int num=13;
        int diff=2;

        for(int i=0;i<n;i++){
           int ans=Math.abs(num-arr[i]);
           System.out.print(ans+" ");
           if(ans<=diff){
            cnt++;
           }
        }
        System.out.println();
        System.out.println(cnt);

    }
}
