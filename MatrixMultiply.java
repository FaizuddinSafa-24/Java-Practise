import java.util.Scanner;
import java.util.Arrays;
public class MatrixMultiply {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter mat1 row, col size:");
        int row1 = scan.nextInt();
        scan.nextLine();
        int col1 = scan.nextInt();
        System.out.println("Enter mat2 row, col size:");
        int row2 = scan.nextInt();
        scan.nextLine();
        int col2 = scan.nextInt();
        int[][] mat1 = new int[row1][col1];
        int[][] mat2 = new int[row2][col2];
        int[][] mat3 = new int[row1][col2];

        if(col1 != row2) {
            System.out.println("The product not defined");
            System.exit(0);
        } else {
            for(int i = 0; i < mat1.length;i++) {
                for(int j = 0; j < mat2[i].length; j++) {
                    for(int k =0; k <mat1[i].length; k++) {
                        mat3[i][j] = mat1[i][k] * mat2[k][j];
                    }
                }
            }
        }
        for(int i= 0; i < mat3.length; i++) {
            for (int j= 0; j < mat3[i].length; j++) {
                System.out.print(mat3[i][j]+" ");
            }
            System.out.println();
        }

        //System.out.println(Arrays.toString(mat3));
    }
}