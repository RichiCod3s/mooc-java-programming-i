
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            // print containers
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

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
                if (firstContainer + amount > 100) {
                    firstContainer = 100;
                } else {
                    // if amount isn't less than 0 add to firstC
                    if (!(amount < 0)) {
                        firstContainer += amount;
                    }
                }
            }
            // move
            if (command.equals("move")) {
                // continue here
                // if the firstC is more or equal than amount take from firstC
                if (firstContainer >= amount && amount > 0) {
                    firstContainer -= amount;

                    // if the amount is less than 100 add to secondC
                    if (amount + secondContainer <= 100) {
                        secondContainer += amount;}
                        // if the amount overflows just make it 100
                    else if (amount + secondContainer > 100) {
                            secondContainer = 100;
                        }
                    
                }
                // if firstC is less than the amount add whatever is in the container
               else if (firstContainer < amount && amount > 0) {
                    // if the amount does not overflow the second pour all in
                    if (firstContainer + secondContainer <= 100) {
                        secondContainer += firstContainer;
                        firstContainer -= amount;
                        if (firstContainer + secondContainer > 100) {
                            secondContainer = 100;
                            firstContainer = 0;
                        }
                    }
                    // if there is an overflow make secondC 100 and firstC 0

                }// move
            }

                 if(command.equals("remove")) {
                    if (secondContainer - amount > 0 && amount > 0) {
                        secondContainer -= amount;
                    } else if (secondContainer - amount < 0) {
                        secondContainer = 0;
                    }

                }


        } // while true
    }
}
