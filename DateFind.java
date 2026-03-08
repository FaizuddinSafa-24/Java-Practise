import java.util.Date;
// importing date class from utility package
public class DateFind {
    public static void main(String[] args) {
        Date date = new Date(); // declare date object
        long time = date.getTime(); // returning time in millisec
        System.out.println(time);
        // convert time (milisec) to Day/Date/Time/GMT+num/Year
        System.out.println(date.toString());
    }
}