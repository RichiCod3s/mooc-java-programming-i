import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter name and duration of shows");
        while(true){
            String show = scanner.nextLine();
            
            if(show.isEmpty()){
                break;
            }
            
            int duration = Integer.valueOf(scanner.nextLine());
           // scanner.nextLine(); put this after next int or use the above.
            
            programs.add(new TelevisionProgram(show, duration));
            
        }
        
        System.out.println("Program's maximum duration?");
        int maxDuration = scanner.nextInt();
        
        for(TelevisionProgram program: programs){
            if(program.getDuration() <= maxDuration){
                System.out.println(program.getName());
                System.out.println(program.getDuration());
            }
        }
    }
}
