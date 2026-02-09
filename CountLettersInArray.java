import java.util.Random;    // use random class for random ascii values
public class CountLettersInArray {
    public static void main(String[] args) {
        char[] character = chars();

        displayChar(character);
        System.out.println("Now count their occurrences");
        int[] times = count(character);
        printOccurrences(character, times);
    }
    public static char[] chars() {
        char[] arr = new char[100];
        int count = 0;
        Random random = new Random(); // declare Random class object in this method
        for(int i = 0; i <arr.length; i++) {
            arr[i] = (char)('a' + random.nextInt(26)); // convert to char from 0 to 25 indices
            System.out.println(arr[i]);
            count++;
            System.out.println(count);
        }
        return arr;
    }

    public static void displayChar(char[] arr) {
        for (char i : arr) {
            System.out.print(i+ " "); // i is here only as element , not position
        }
        System.out.println();
    }

    public static int[] count(char[] array) {
        int[] count = new int[26];
        for (int i=0; i < array.length; i++) {
            count[array[i] - 'a']++;
        }
        return count;

    }

    public static void printOccurrences(char[] chars, int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if ((i+1)%10 == 0){ // formating to see clear all 26 chars with counts seperately
                System.out.println(counts[i] + " " + (char) (i +'a')+ " ");
            } else {
                System.out.print(counts[i] + " " + (char) (i +'a') + " ");
                
            }
        }
        
    }
}

// crate an char array
// display chars
// count each of them occurrences
// print count + letter