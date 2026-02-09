import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,9};
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        System.out.println("The copied arrays :"+Arrays.toString(copy));
        // Use Arrays with java.util.Arrays package
        // Use "Sytem.arraycopy" instead of "arraycopy"
        // Use "Arrays.toString(Object a)"
    }
}