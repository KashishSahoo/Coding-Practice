import java.util.Arrays;

public class a35_transpose {
    public static void main(String[] args) {
           int arr[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };
         int r=arr.length;
         int c=arr[0].length;
        int ans[][]=new int[c][r];

        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
