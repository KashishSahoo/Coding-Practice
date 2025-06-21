import java.util.Arrays;

public class a18_chocolateDistribution {
    public static void main(String args[]){
        int arr[]={3,4,1,9,56,7,9,12};
        int n=arr.length;
        int m=5; //number of students
        //the difference between min and max coco must be min
        int ans=distributeChocolate(arr, n, m);
        System.out.println(ans);
    }
    public static int distributeChocolate(int arr[],int n,int m){
        if(m==0 || n==0) return 0;
        if(m>n) return -1; //not enough chocolates for students

        Arrays.sort(arr);
        int diff=Integer.MAX_VALUE; 

        for(int i=0;i<n;i++){
            int lastIdx=i+m-1; //last index of the current window
            if(lastIdx>=n) break; //if the last index exceeds the array length, break
            int currDiff=arr[lastIdx]-arr[i];
            if(currDiff<diff){
                diff=currDiff;
            }
        }
        return diff; //return the minimum difference found

    }
}
