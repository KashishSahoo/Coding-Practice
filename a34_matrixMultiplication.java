import java.util.Arrays;

public class a34_matrixMultiplication {
    public static void main(String[] args) {
        int arr1[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int arr2[][] = { { 7, 8 },
                { 9, 10 }, { 11, 12 } };

        int r1=arr1.length;
        int c1=arr1[0].length;
        int r2=arr2.length;
        int c2=arr2[0].length;
        
        if(c1==r2){
            System.out.println("Matrix Mulplication");
        }
        int ans[][]=new int[r1][c2];

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<c1;k++){
                    sum+=arr1[i][k]*arr2[k][j];
                }
                ans[i][j]=sum;
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
