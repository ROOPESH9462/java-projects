import java.util.Scanner;
import java.util.ArrayList;
class task {
    String field;
    boolean b;
    public task(String field){
        this.field=field;
        this.b=false;
    }
    String getter(){
        return this.field;
    } 
    boolean isdone(){
        return this.b;
    }
    public void markasdone(){
        this.b=true;
    }
    @Override
    public String toString(){
        String gg;
        if(b){
            gg= "x";
        }
        else{
            gg= " ";
        }
        return "[ "+gg+" ]"+this.field;
    }
}

public class todolist{
    private static ArrayList<task> hh=new ArrayList<>();
    static Scanner  sc=new Scanner(System.in);
    public static void main(String args[]){
        while(true){
            printMenu();
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    // System.out.println("add task feature coming soon.....");
                    addTask();
                    break;
                case 2:
                    // System.out.println("view task feature coming soon....");
                    viewTask();
                    break;
                case 3:
                    // System.out.println("mark as don feature coming soon....");
                    markTaskAsDone();
                    break;
                case 4:
                    // System.out.println("remove task feature coming soon....");
                    removeTask();
                    break;
                case 5:
                    System.out.println("thanks for using the app. goodbye!");
                    return;
                default:
                    System.out.println("invalid choice. please enter the number from 1 to 5.");
            }
        }
    }
    static void printMenu(){
        System.out.println("\n--- To-Do List Menu ---");
        System.out.println("1. Add a new task");
        System.out.println("2. View all tasks");
        System.out.println("3. Mark a task as done");
        System.out.println("4. Remove a task");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
    private static void addTask(){
        System.out.println("enter the task description: ");
        String hj=sc.nextLine();
        task t=new task(hj);
        hh.add(t);
        System.out.println("task added succesfully...");
    }
    private static void viewTask(){
        System.out.println("\n-----Your task's is-----");
        if(hh.isEmpty()){
            System.out.println("your to-do list is empty");
        }
        else{
            for(int i=0;i<hh.size();i++){
                System.out.println((i+1)+". "+hh.get(i));
            }
        }
    }
    private static void markTaskAsDone(){
        viewTask();
        if(hh.isEmpty()){
            return;
        }
        System.out.println("tell me the number of the task to make it as mark as done");
        int a=sc.nextInt();
        sc.nextLine();
        if(a>0 && a<=hh.size()){
            task chosenTask = hh.get(a - 1);
            chosenTask.markasdone();
            System.out.println("Task marked as complete.");
        }
        else{
            System.out.println("Invalid task number. Please try again.");
        }
    }
    private static void removeTask(){
        viewTask();
        if(hh.isEmpty()){
            return;
        }
        System.out.println(" enter the number of the task they want to remove.");
        int s=sc.nextInt();
        sc.nextLine();
        if(s>0 && s<=hh.size()){
            hh.remove(s - 1);
            System.out.println("Task removed successfully.");
        }
        else{
            System.out.println("Invalid task number. Please try again.");
        }
    }

}
