import java.util.ArrayList;

public class TodoList {
    
    private ArrayList<String> list;
    
    public TodoList(){
        list = new ArrayList();
    }
    
    //add the task passed as a parameter to the todo list
    public void add(String task){
        list.add(task);
    }
    
    //prints the exercises. Each task has a number associated with it on the print statement 
    public void print(){
        for(int i =0; i<list.size();i++){
            System.out.println(i+1 +": "+ list.get(i));
        }
    }
    
    
    //removes the task associated with the given number; the number is the one seen associated with the task in the print.
    public void remove(int number){
        list.remove(number-1); // for now I'll assume they wont select 0;
    }
}
