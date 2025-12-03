import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekFinder {
    public String findNextDayOfWeek(String startDate, String dayOfWeek) {

      try {
          LocalDate currenDate = LocalDate.parse(startDate);
          DayOfWeek targetDayOfWeek = DayOfWeek.valueOf(dayOfWeek.toUpperCase());

          DayOfWeek currentDay = currenDate.getDayOfWeek();

          int daysToAdd = (((targetDayOfWeek.getValue() - currentDay.getValue())+7)%7);

          if (daysToAdd == 0) {
             daysToAdd = 7;
          }

          LocalDate resultDay = currenDate.plusDays(daysToAdd);
          return resultDay.toString();
      } catch (Exception e) {
        return "Error";
      }
    }
}