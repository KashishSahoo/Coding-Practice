import java.util.ArrayList;
import java.util.HashMap;

public class a15_twoSum {
    public static void main(String[] args) {
        int arr[]={1,5,7,-1,5};
        int sum=6;
        //1 5,7 -1,1 5
        ArrayList<ArrayList<Integer>> ans=twoSum(arr, sum);
        System.out.println(ans);

    }
    public static ArrayList<ArrayList<Integer>> twoSum(int arr[],int sum)
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int req=sum-arr[i];
            ArrayList<Integer> ans=new ArrayList<>();
            if(map.containsKey(req)){
              ans.add(arr[i]);
              ans.add(req);
              res.add(ans);
            }
            map.put(arr[i],i);
        }
        return res;
    }
}
