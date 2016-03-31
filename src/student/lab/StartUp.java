
package student.lab;

/**
 *
 * @author Carson Schultz
 */
public class StartUp {
    public static void main(String[] args) {
        DateUtilities du = new DateUtilities();
        String input = "02-01-16 00:00";
        String outputs;
        //System.out.println(du.getCustomDateString(input));
        //System.out.println("Current date to string: "+outputs);
        System.out.println("Today plus 2 weeks: "+du.addWeeksToDate(2));
    }
}
