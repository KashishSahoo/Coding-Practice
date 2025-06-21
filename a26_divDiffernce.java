public class a26_divDiffernce {
    public static void main(String[] args) {
        int n=4;
        int m=20;
        int d=0;
        int nd=0;


        for (int i = 1; i <=m; i++) {
            if(i%n==0){
                d=d+i;
            }
            else{
                nd=nd+i;
            }
        }
        System.out.println(nd);
        System.out.println(d);
        int diff=nd-d;
        System.out.println(diff);
    }
}