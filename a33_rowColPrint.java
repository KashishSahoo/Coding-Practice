public class a33_rowColPrint {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 } };

        int row=arr.length;
        int col=arr[0].length;

        //row wise
        for(int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         //col wise
        for(int i=0;i<col;i++){
            for (int j = 0; j < row; j++) {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
