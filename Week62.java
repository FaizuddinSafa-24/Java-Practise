import java.util.Arrays;
import java.util.Arrays;
public class Week62 {
    public static void main(String[] args) {
        double[] myArray = new double[] {1,2,3};
        int[] anotherArray = {4,5};
        System.out.println(myArray[1]+anotherArray[1]);
        String[] str = {"Life","is","beautiful"};
        String str1 = "Life is beautiful";
        System.out.println(str.length);
        System.out.println(str[1].length());

        System.out.println(str1.length());
        int[] arr = new int[] {1,2,3,4,5};
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));
    }
}
