package Task9;

public class TaskMain {

    public static void main(String[] args) throws NoSuchFieldException, SecurityException {
       ToDoList to=new ToDoList(24);
       Task t= new Task();
       Task ta= new Task(10,10);
       Task k= new Task(5); 
      to.add(ta);
      to.add(t);
      to.add(k);
      System.out.println(to.getRemainigTime());
      to.markCancelled(t);
      to.markFinished(ta);
      
      for(int i=0;i<to.task.size();i++)
      {
          System.out.println(to.task.get(i).description);
      }

    }

}
