
import java.text.SimpleDateFormat;
import java.util.*;

public class ProjectTime {
    private String startTime;
    private String endTime;
    private long diffMs;
    private long diffMins;
    private int diffMos;
    private int diffYrs;

    public ProjectTime(String start, String end){
        this.startTime=start;
        this.endTime= end;
        updateHourLogged();
    }

    public void setStartTime(String start){
        this.startTime= start;
    }
    public void setEndTime(String end){
        this.endTime= end;
    }

    public void updateHourLogged(){
        try{
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Date parseStart = formatter.parse(this.startTime);
        Date parseEnd = formatter.parse(this.endTime);

        this.diffMs = parseEnd.getTime() - parseStart.getTime();
        this.diffMins = this.diffMs / (1000L*60L);


        Calendar calStart = Calendar.getInstance();
        calStart.setTime(parseStart);


        Calendar calEnd = Calendar.getInstance();
        calEnd.setTime(parseEnd);

        this.diffYrs= (calEnd.get(Calendar.YEAR)- calStart.get(Calendar.YEAR));
        this.diffMos = this.diffYrs *12 + (calEnd.get(Calendar.MONTH) - calStart.get(Calendar.MONTH));


        } catch (Exception e){
            this.diffMs = -1L ;
            this.diffMins = -1L ;
            this.diffMos = -1 ;
            this.diffYrs = -1 ;
        }



    }
    public String getStartTime(){
        return this.startTime;
    }
    public String getEndTime(){
        return this.endTime;
    }

    public String getHoursLogged(){
        if (this.diffMs < 0) return "-1";

        if (this.diffMins < 120) return this.diffMins + " m";

        if (this.diffMins >= 120 && this.diffMins < 7200){
            return (this.diffMins/60) + " h";
        }

        if (this.diffMos >= 4) return diffMos + " mo";

        if (this.diffMins>=7200 && this.diffMins < 172800) return ((this.diffMins/60)/24) + " d";

        return "-1";
    }
}