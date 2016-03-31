package student.lab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Carson Schultz
 */
public class DateUtilities {

    private LocalDateTime dateTime;
    private DateTimeFormatter formatter;
    

    /**
     *
     * @return the current date as a String
     * @throws IllegalArgumentException
     */
    public String currentDateToString() throws IllegalArgumentException {
        LocalDate locDate = LocalDate.now();
        formatter = DateTimeFormatter.ofPattern("mm-dd-yy hh:mm");
        String currentDate = locDate.format(formatter);
        return currentDate;

    }

    /**
     * This returns the local date and time as a string with a specified format.
     *
     * @param cD- the string to be formatted as a date
     * @return- dateTime
     * @throws IllegalArgumentException
     */
    public LocalDateTime getCustomDateString(String cD) throws IllegalArgumentException {
        if (cD == null || cD.isEmpty()) {
            throw new IllegalArgumentException("Warning: The date Input is empty.");
        } else {
            formatter = DateTimeFormatter.ofPattern("MM-dd-yy HH:mm");
            dateTime = LocalDateTime.parse(cD, formatter);
        }

        return dateTime;
    }

    /**
     * This returns the local date as a string with a basic format
     *
     * @param lD- the string to be formatted as a date
     * @return- date
     * @throws IllegalArgumentException
     */
    public LocalDate getDateString(String lD) throws IllegalArgumentException {
        if (lD == null || lD.isEmpty()) {
            throw new IllegalArgumentException("Warning: The local date could not be read.");
        } else {
            LocalDate date = LocalDate.parse(lD, DateTimeFormatter.BASIC_ISO_DATE);
            return date;
        }
    }
    /**
     * This returns the current date plus however many weeks you want
     *
     * @param weeks- the weeks you want to add to the current date
     * @return- laterDate
     * @throws IllegalArgumentException
     */
    public LocalDate addWeeksToDate(int weeks) throws IllegalArgumentException{
        if (weeks == 0) {
            throw new IllegalArgumentException("Warning: Weeks to be added must be greater than 0.");
        } else {
        LocalDate today = LocalDate.now();
        LocalDate laterDate = today.plusWeeks(weeks);
        return laterDate;
    }

}






}


