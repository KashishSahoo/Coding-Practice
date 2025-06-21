public class a19_buyingSqPlots {
    public static void main(String[] args) {
        int arr[]={16,89,100,76,36,77,9};
        int n=arr.length;
        //find sq plots
        //find perfect sqs
        int ans=buyingSqPlots(arr,n);
        System.out.println();
        System.out.println(ans);
    }
    public static int buyingSqPlots(int arr[],int n){
        int cnt=0;
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            if(Math.floor(Math.sqrt(num))==Math.ceil(Math.sqrt(num))){
                System.out.print(num+" ");
                cnt++;
            }
        }
        return cnt;
    }
}
