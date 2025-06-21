import java.util.Arrays;

public class a43_diffLarSmall {
    public static void main(String[] args) {
        int num=12859;
        int n=(int)Math.log10(num)+1;

        //lar:98521
        //small:12589
        int arr[]=new int[n];
        for (int i = 0; i < arr.length; i++) {
            int rem=num%10;
            arr[i]=rem;
            num=num/10;
        }
        Arrays.sort(arr);
        int smallest=0;
        for (int i = 0; i < arr.length; i++) {
            smallest=smallest*10+arr[i];
        }
        int largest=0;
        for(int i=n-1;i>=0;i--){
             largest=largest*10+arr[i];
        }
        System.out.println(largest);
        System.out.println(smallest);
        System.out.println(largest-smallest);
    }
}
