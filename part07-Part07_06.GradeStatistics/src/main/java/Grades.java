
import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    Scanner scanner;
    ArrayList<Integer> grades;

    public Grades() {
        this.scanner = new Scanner(System.in);
        grades = new ArrayList<>();
        getPoints();
        pointAverages();
        percentagePassed();
        countStars();
        //gradeGraph();
    }

    public void getPoints() {
        while (true) {
            System.out.println("Enter in points (-1 to stop)");
            int point = scanner.nextInt();
            if (point == -1) {
                break;
            }

            if (point >= 0 && point <= 100) {
                grades.add(point);
            }
        }
    }

    public void pointAverages() {
        int totalPoints = 0;
        int numOfPoints = grades.size();
        int totalPointsPass = 0;
        int numOfPointsPass = 0;

        for (int points : grades) {
            totalPoints += points;
            //numOfPoints++;
            if (points >= 50) {
                totalPointsPass += points;
                numOfPointsPass++;
            }
        }
        double averageAll = (double) totalPoints / numOfPoints;
        double averagePass = (double) totalPointsPass / numOfPointsPass;
        System.out.println("Point average (all): " + averageAll);

        if (numOfPointsPass == 0) {
            System.out.println("Point average (pass): - ");
        } else {
            System.out.println("Point average (passing): " + averagePass);
        }
    }

    public void percentagePassed() {
        int numOfPoints = grades.size();
        int numOfPointsPass = 0;

        for (int points : grades) {
            if (points >= 50) {

                numOfPointsPass++;
            }
        }
        double percentagePassed = ((double) numOfPointsPass / numOfPoints) * 100;

        System.out.println("Pass percentage: " + percentagePassed);
    }

    public void gradeGraph() {
          System.out.println("Grade distribution:");

    

    for (int i = 5; i >= 0; i--) {
        System.out.print(i + ": ");
        for (int grade : grades) {
            if (grade >= gradeCutoffs[i]) {
                System.out.print("*");
            }
        }
        System.out.println();
    }
    }
    public void countStars(){
        //int[] gradeCutoffs = {50, 60, 70, 80, 90, 100};
     // try and arraylist
    }
}
/* public void pointAverages() {
        int totalPoints = 0;
        int numOfPoints = 0;
        int totalPointsPass=0;
        int numOfPointsPass=0;
        
        while (true) {
            System.out.println("Enter in points (-1 to stop)");
            int point = scanner.nextInt();
            if (point == -1) {
                break;
            }

            if (point >= 0 && point <= 100) {
                totalPoints += point;
                numOfPoints++;
                if(point>=50){
                    totalPointsPass +=point;
                    numOfPointsPass++;
                }
            }
        }
        double averageAll = (double) totalPoints / numOfPoints;
       double averagePass = (double) totalPointsPass/ numOfPointsPass;
       double percentagePassed = ((double)numOfPointsPass/numOfPoints)*100;
       
        System.out.println("Point average (all): "+ averageAll);
        
        if(numOfPointsPass ==0){
            System.out.println("Point average (pass): - ");
        }else{
        System.out.println("Point average (pass): "+ averagePass);
        }
        
        System.out.println("Pass percentage: " + percentagePassed );
    }
 */
