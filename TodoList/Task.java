public class Task {
    private String description;
    private TaskStatus status;

    public Task(String description){
        this.description = description;
        this.status = TaskStatus.NEW;

    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setStatus(TaskStatus status){
        this.status = status;
    }

    public String getDescription(){
        return this.description;
    }

    public TaskStatus getStatus(){
        return this.status;
    }
   
    
}