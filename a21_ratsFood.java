public class a21_ratsFood {
    public static void main(String[] args) {
        int houses[]={2,8,3,5,7,4,1,2};
        // min houses
        int n=houses.length;
        int r=7;
        int unit=2;
        //op 4
        int ans=noOfHouses(houses,n,r,unit);
        System.out.println(ans);
    }
    public static int noOfHouses(int arr[],int n,int r,int unit){
        int foodReq=r*unit;
        int cnt=0;
        int sum=0;
        // Arrays.sort(arr);
        for(int i=0;i<n;i++){
         if(sum>=foodReq){
            return cnt;
         }
         sum=sum+arr[i];
         cnt++;
        }
        return -1;
    }
}
