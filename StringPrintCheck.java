public class StringPrintCheck {
    public static void main (String[] args) {
        System.out.println("1"+1); //11
        System.out.println('1'+1);  // ans=50 '1' = ASCII value(0 = 48, 1 = 49)
        System.out.println("1"+1+1);    // 111
        System.out.println("1"+(1+1)); // 12
        System.out.println('1'+1+1); // 51 (ASCII value of 1 + 1 )
    }
}