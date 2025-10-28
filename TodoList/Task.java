 public class Task {
    private String description;
    private TaskStatus status;

    public Task(String description){
        this.description = description;
        this.status =TaskStatus.NEW;
    }

    public void setDescription(String description){
    if(description.length() <=30){
        this.description= description;
    }else{
        this.description = description.substring(0,30);
    }
}
    

     public void setStatus(TaskStatus status){
        this.status = status;
    }

    public String getDescription(){
        return description;
    }

    public TaskStatus getStatus(){
        return status;
    }
} 
    

