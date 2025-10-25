import java.time.LocalDate;
import java.time.Period;

public class MonthlyPeriod {
    public String calculatePeriod(String startDate, String endDate) {
        try {
          LocalDate start = LocalDate.parse(startDate);
          LocalDate end = LocalDate.parse (endDate);

          Period between = Period.between(start,end);

          if (between.isNegative()){
            between = Period.between(end, start);
          }
          int years = between.getYears();
          int months = between.getMonths();

          if (years > 0 && months > 0){
            return years + " years and " + months + " months";
          }else if (years> 0){ 
            return years + " years";
          }else if (months > 0){
            return months + "months";
          }else{
            return "";
          }
        }catch(Exception e){
            return "Error";
        }
    }
}