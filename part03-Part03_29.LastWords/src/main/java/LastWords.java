
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   while(scanner.hasNextLine()){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }else{
                String arr[] = input.split(" ");
                System.out.println(arr[arr.length-1]);
            }
        }
    }
}
