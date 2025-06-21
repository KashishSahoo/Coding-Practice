import java.util.HashSet;

public class a23_stonesFromMars {
    public static void main(String[] args) {
        int mars_stones=14;
        int common_stones=4;
        int common_stones_arr[]={1,3,10,14};
        HashSet<Integer> set=new HashSet<>();

        for (int i = 0; i < common_stones_arr.length; i++) {
            set.add(common_stones_arr[i]);
        }
        //max can be choosen is 14
        //mars stone weight from 1 to mars_stone
        int sum=0;
        int cnt=0;
        int max=mars_stones;
        int ans[]=new int[mars_stones+1];
        for (int i = 1; i <=ans.length; i++) {
            if(!set.contains(i)){
                if(sum+i<=max){
                cnt++;
                System.out.print(i+" ");
                sum+=i;
                } 
            }
        }
        System.out.println();
        System.out.println(cnt);
    }
}
