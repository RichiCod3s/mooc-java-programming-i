
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            // print containers
            System.out.println("");
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            System.out.println("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            //break input by "," into array 
            String[] parts = input.split(" ");

            //make the command and amount variables
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // add
            if (command.equals("add")) {
                // if adding the liquid is more than 100 then the firstC is 100
                firstContainer.add(amount);
            }
            // move command
            if (command.equals("move")) {
                //  if the amount is not negative go ahead
                if (firstContainer.contains() - amount >= 0) {
                    firstContainer.remove(amount);
                    secondContainer.add(amount);
                   
                }
                 // if it is negative, empty the first container and add the contents to second
               else if(firstContainer.contains() - amount < 0){
                   secondContainer.add(firstContainer.contains());
                   firstContainer.remove(firstContainer.contains());
                  
                }

            }// end of move

        

        if (command.equals("remove")) {
          secondContainer.remove(amount);

        }

    } // while true

}// main

}//class
