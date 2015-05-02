package Task9;
import java.util.Random;
import java.util.Scanner;

public class Task {
    Scanner scanner= new Scanner(System.in);
    public int priority = 0;
    public int time = 0;
    String description;
    int res = 0;

    public Task(int priority, int time) {

      
        Random rd = new Random();
        System.out.println("Describe your task!");
        description= scanner.nextLine();
        System.out.println(description);
        this.priority = priority;
        if (this.priority == 0) {
            this.priority = rd.nextInt(7);
        }
        this.time = time;
    }

    public Task() {
        System.out.println("Describe your task!");
        description= scanner.nextLine();
        System.out.println(description);
        Random rd = new Random();
        this.priority = rd.nextInt(7);
    }

    public Task(int time) {
        System.out.println("Describe your task!");
        description= scanner.nextLine();
        System.out.println(description);
        this.time = time;
        Random rd = new Random();
        this.priority = rd.nextInt(7);
    }

    public int getPriority() {
        return priority;
    }
  
}
