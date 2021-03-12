import java.util.ArrayList;

public class ExerciseManagement {
    private ArrayList<Exercise> tasks;
    
    public ExerciseManagement() {
       this.tasks = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        
        for (Exercise task: tasks) {
            list.add(task.getName());        
        }
        
        return list;
    }
    
    public void add(String task) {
        this.tasks.add(new Exercise(task));
    }
    
    public void markAsCompleted(String task) {
        for (Exercise item: tasks) {
            if (item.getName().equals(task)) {
                item.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String task) {
        for (Exercise item: tasks) {
            if (item.getName().equals(task)) {
                return item.isCompleted();
            }
        }
        
        return false;
    }
}
