public class Arr2DBoundarySum {
    public static void main (String[] args) {
        // array initialize
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                arr[i][j] = (int) (Math.random()*10);
            }
        }
        // test print
        for (int i = 0; i < 4; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int sum = 0;
        // sum
        for (int i = 0; i < 4; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                if (i == 0 && j == 0) {
                    sum += arr[i][j];
                } else if (i == 0 && j == 3) {
                    sum += arr[i][j];
                    
                } else if (i == 3 && j == 0) {
                    
                    sum += arr[i][j];
                }else if (i == 3 && j == 3) {
                    
                    sum += arr[i][j];
                } 
            }
        }
        // final print
        for (int i = 0; i < 4; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(sum);
    }
}
