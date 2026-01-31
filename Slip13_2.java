import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Slip13_2 {
    public static void main(String[] args) {
        // Get current date and time
        Date currentDate = new Date();

        // Format 1: Current date is : 31/08/2021
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");

        // Format 2: Current date is : 08-31-2021
        SimpleDateFormat format2 = new SimpleDateFormat("MM-dd-yyyy");

        // Format 3: Current date is : Tuesday August 31 2021
        SimpleDateFormat format3 = new SimpleDateFormat("EEEE MMMM dd yyyy");

        // Format 4: Current date and time is : Fri August 31 15:25:59 IST 2021
        SimpleDateFormat format4 = new SimpleDateFormat("EEE MMMM dd HH:mm:ss z yyyy");

        // Format 5: Current date and time is : 31/08/21 15:25:59 PM +0530
        SimpleDateFormat format5 = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");

        // Output the formatted date/time
        System.out.println("Current date is : " + format1.format(currentDate));
        System.out.println("Current date is : " + format2.format(currentDate));
        System.out.println("Current date is : " + format3.format(currentDate));
        System.out.println("Current date and time is : " + format4.format(currentDate));
        System.out.println("Current date and time is : " + format5.format(currentDate));
    }
}

