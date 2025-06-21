import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        while(true){
            sum=0;
            while(n>0){
                sum+=Math.pow(n%10,2);
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            if(set.contains(sum)) return false;
            set.add(sum);
            n=sum;
        }
        
    }
}