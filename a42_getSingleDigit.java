public class a42_getSingleDigit {
    public static void main(String[] args) {
        int num = 123456;
        int singleDigit = getSingleDigit2(num);
        System.out.println(singleDigit); // Output: 3
    }
    public static int getSingleDigit(int num){
        if(num<10){
            return num;
        }
         int sum=0;
        while (num>=10) {
             num=digitSum(num);
            }
        return num;
    }
    public static int digitSum(int num){
        int sum=0;
         // Calculate the sum of digits
        while (num!=0) {
            int digit=num%10;
            sum+=digit;
            num=num/10;
            
        }
        return sum;
        
    }
    public static int getSingleDigit2(int num){
        if(num<10){
            return num;
        }
        return (num%9==0)?9:num%9;
    }

}
