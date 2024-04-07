import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainTask {
    public static void main(String[] args) {
        Queue<Task> tasksQueue=new PriorityQueue<>(Comparator.comparing(Task::importance));

        tasksQueue.add(new Task(Importance.MEDIUM,"Do the dishes"));
        tasksQueue.add(new Task(Importance.MEDIUM,"Tidy my bedroom"));
        tasksQueue.add(new Task(Importance.HIGHEST,"Create java tutorial"));
        tasksQueue.add(new Task(Importance.LOW,"Do the laundry"));
        tasksQueue.add(new Task(Importance.HIGH,"Brush my teeth"));

        while(!tasksQueue.isEmpty()){
            System.out.println(tasksQueue.poll());
        }

        Direction direction=Direction.NORTH_WEST;
        System.out.println(direction.getnextDirection().getDegrees());
        System.out.println(direction.getDegrees());
     }




}
