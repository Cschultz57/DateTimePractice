
package student.lab;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Carson Schultz
 */
public class Challenges {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        LocalDateTime nextDay = LocalDateTime.now();
        nextDay = current.plusHours(24);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM d yy  h:mm a");
        String strDate = current.format(format);        
        String strDdate2 = nextDay.format(format);
        System.out.println(strDate);
    }
}
