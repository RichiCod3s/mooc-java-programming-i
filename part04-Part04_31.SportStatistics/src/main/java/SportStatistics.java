
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int noOfGames =0;
        int wins=0;
        int losses=0;
               
        System.out.println("File:");
        String file = scan.nextLine(); // data.csv
        
        try(Scanner scanner = new Scanner(Paths.get(file))){
            System.out.println("Team:");
            String team = scan.nextLine();
            
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] arr = line.split(",");
                // number of games
                if(arr[0].equals(team) | arr[1].equals(team)){
                    noOfGames++;
                }
                
                // wins and losses
                if(arr[0].equals(team)){
                if(Integer.valueOf(arr[2]) > Integer.valueOf(arr[3])){
                    wins++;
                }else if(Integer.valueOf(arr[2]) < Integer.valueOf(arr[3])){
                    losses++;
                }
            }
                
                if(arr[1].equals(team)){
                if(Integer.valueOf(arr[2]) < Integer.valueOf(arr[3])){
                    wins++;
                }else if(Integer.valueOf(arr[2]) > Integer.valueOf(arr[3])){
                    losses++;
                }
            }
               
                
            }
            System.out.println("Games: " + noOfGames);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }   

}
