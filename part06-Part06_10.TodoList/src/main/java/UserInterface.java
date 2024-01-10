import java.util.Scanner;
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list=list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            String command="";
            System.out.println("Command: ");
            command = scanner.nextLine();
            //stops the execution of the loop
            if(command.equals("stop")){
                break;
            }
            
            //asks the user for the next task to be added.
            else if(command.equals("add")){
                System.out.println("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            }
            
            //prints all the tasks on the to-do list.
            else if(command.equals("list")){
                list.print();
            }
            
            //asks the user to enter the id of the task to be removed.
            else if(command.equals("remove")){
                System.out.println("Which one is removed?");
                int index = scanner.nextInt();
                list.remove(index);
            }
            
        }
    }
    
}
