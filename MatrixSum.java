import java.util.Scanner;
public class MatrixSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] arr1 = arrInput(row, col);
        int[][] arr2 = arrInput(row, col);
        scan.close();
        arrSum(arr1, arr2,row,col);
    }
    // input matrices
    // return sum of two matirce
    // return subt of two 
    // return multiply of two
    public static int[][] arrInput(int row, int col) {
        Scanner scan = new Scanner(System.in);
        int[][] arr =new int[row][col];
        for (int i = 0; i < arr.length; i++) 
        {
            for(int j = 0; j <arr[i].length; j++) {
                System.out.printf("arr[%d][%d]: ",i,j);
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public static void arrSum(int[][]arr1, int[][]arr2, int row, int col) {
        int[][] sumArr = new int[row][col];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col;j++) {
                sumArr[i][j]= arr1[i][j]+ arr2[i][j];
            }
        }

        for(int i = 0; i < sumArr.length; i++) {
            for (int j = 0; j <sumArr[i].length;j++) {
                System.out.print(sumArr[i][j]+" ");
            }
            System.out.println();
        }
        
    }

}
