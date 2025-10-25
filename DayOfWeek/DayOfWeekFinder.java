import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekFinder {

    public String findNextDayOfWeek(String startDate, String dayOfWeek) {
        try {
            // Step 1: Turn the startDate string into a LocalDate object
            // Example: "2023-06-22" → LocalDate object for June 22, 2023
            LocalDate givenDate = LocalDate.parse(startDate);

            // Step 2: Convert the name of the day (like "Monday") into a DayOfWeek constant
            // The valueOf() method needs uppercase letters, so we use toUpperCase()
            DayOfWeek targetDay = DayOfWeek.valueOf(dayOfWeek.toUpperCase());

            // Step 3: Find out what day of the week the given date is
            DayOfWeek currentDay = givenDate.getDayOfWeek();

            // Step 4: Figure out how many days to add to reach the next target day
            // For example, from Thursday (4) to Monday (1):
            // (1 - 4 + 7) % 7 = 4 → 4 days later
            int daysToAdd = (targetDay.getValue() - currentDay.getValue() + 7) % 7;

            // Step 5: If daysToAdd is 0, that means today *is already* the target day.
            // We want the next one, so add 7 days.
            if (daysToAdd == 0) {
                daysToAdd = 7;
            }

            // Step 6: Add the number of days to the given date
            LocalDate nextDate = givenDate.plusDays(daysToAdd);

            // Step 7: Return the date as a string (in "yyyy-MM-dd" format)
            return nextDate.toString();

        } catch (Exception e) {
            // If something goes wrong (like wrong input format), return "Error"
            return "Error";
        }
    }

}