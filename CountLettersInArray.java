
public class CountLettersInArray {
    public static void main(String[] args) {
        char[] character = chars();

        displayChar(character);
        System.out.println("Now count their occurrences");
        int[] times = count(character);
    }
    public static char[] chars() {
        char[] arr = new char[100];
        for(int i = 0; i <arr.length; i++) {
            arr[i] = RandomCharacter.getRandomLowerCaseLetter();
        }
        return arr;
    }

    public static void displayChar(char[] arr) {
        for (char i : arr) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static int[] count(char[] array) {
        int[] count = new int[26];
        for (char i : array) {
            count[array[i] - 'a']++;
        }
        return count;

    }

    public static void printOccurrences(char[] chars, int[] counts) {
        for (int i = 0; i < chars.length; i++) {
            if ((i+1)%10 == 0){
                System.out.println(counts[i] + " " + (char) (i +'a'));
            } else {
                System.out.println(counts[i] + " " + (char) (i +'a'));
                
            }
        }
        
    }
}

// crate an char array
// display chars
// count each of them occurrences
// print count + letter