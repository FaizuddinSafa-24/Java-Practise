public class Arr2DIEqualJ {
    public static void main(String[] ags) {
        int[][] matrix = new int[4][4];
        
        // arrays in java auto initialized
       
        // i == j
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    
                    matrix[i][j] = 1;
                }
            }
        }
        // print changed array
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}