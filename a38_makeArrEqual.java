import java.util.*;
public class a38_makeArrEqual {
    public static void main(String[] args) {
        int target[]={1,2,3,4,2};
        int arr[]={2,4,1,3,2};

        boolean ans=makeEqual2(target,arr);
        System.out.println(ans);
    }
    public static boolean makeEqual(int target[],int arr[]){
        if(target.length!=arr.length){
            return false;
        }
        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
           if(arr[i]!=target[i]){
            return false;
           } 
        }
        return true;
    }
      public static boolean makeEqual2(int target[],int arr[]){
        if(target.length!=arr.length){
            return false;
        }
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }
       for(int num:target){
        if(!map.containsKey(num)){
            return false;
        }
        map.put(num,map.get(num)-1);
        if(map.get(num)==0){
            map.remove(num);
        }
       }
       return map.isEmpty();
       
    }
}
