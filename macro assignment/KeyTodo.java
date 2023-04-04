//Create a class called ToDoList that stores a collection of tasks in a LinkedList. The class should have methods to add, edit, and delete tasks, as well as to mark a task as complete and display all incomplete tasks.
import java.util.LinkedList;

public class ToDoList {
    private LinkedList<String> tasks;

    public ToDoList() {
        tasks = new LinkedList<String>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void editTask(int index, String newTask) {
        if (index < tasks.size()) {
            tasks.set(index, newTask);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void deleteTask(int index) {
        if (index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void markTaskComplete(int index) {
        if (index < tasks.size()) {
            String task = tasks.get(index);
            tasks.set(index, "[X] " + task);
        } else {
            System.out.println("Invalid task index");
        }
    }

    public void displayIncompleteTasks() {
        System.out.println("Incomplete tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            String task = tasks.get(i);
            if (!task.startsWith("[X] ")) {
                System.out.println(i + ": " + task);
            }
        }
    }

    public static void main(String[] args) {
        ToDoList list = new ToDoList();
        list.addTask("Buy milk");
        list.addTask("Call mom");
        list.addTask("Do laundry");
        list.editTask(0, "Buy eggs");
        list.deleteTask(1);
        list.markTaskComplete(0);
        list.displayIncompleteTasks();
    }
}
