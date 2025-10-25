import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekFinder {

    public String findNextDayOfWeek(String startDate, String dayOfWeek) {
      try {
          LocalDate givenDate = LocalDate.parse(startDate);
          DayOfWeek targetDay = DayOfWeek.valueOf(dayOfWeek.toUpperCase());

          DayOfWeek currentDay = givenDate.getDayOfWeek();

          int daysToAdd = ((targetDay.getValue() - currentDay.getValue() +7)%7);

          if (daysToAdd == 0){
            daysToAdd = 7;
          }

          LocalDate targetDate = givenDate.plusDays(daysToAdd);

          return targetDate.toString();

      } catch (
       Exception  e) {
      return "Error";
      }
    }
}