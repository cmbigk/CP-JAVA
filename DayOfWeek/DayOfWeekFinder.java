import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekFinder {
    public String findNextDayOfWeek(String startDate, String dayOfWeek) {

      try {
        LocalDate startingDate = LocalDate.parse(startDate);
        DayOfWeek targetDOW = DayOfWeek.valueOf(dayOfWeek.toUpperCase());

        DayOfWeek startDay = startingDate.getDayOfWeek();

        int daysToAdd = (((targetDOW.getValue()-startDay.getValue())+7)%7);

        if (daysToAdd == 0){
          daysToAdd = 7;
        }

         LocalDate resultDay = startingDate.plusDays(daysToAdd);

         return resultDay.toString();
      } catch (Exception e) {
        return "Error";
      }

    }
}