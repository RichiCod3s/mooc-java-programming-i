
import java.util.ArrayList;
import java.util.Scanner;

public class Grades {

    Scanner scanner;
    ArrayList<Integer> grades;

    public Grades() {
        this.scanner = new Scanner(System.in);
        grades = new ArrayList<>();
       ui();
    }
    
    public void ui(){
         getPoints();
        pointAverages();
        percentagePassed();
        countStars();
        gradeGraph(countStars());
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

    public void gradeGraph(int[] countStars) {
        System.out.println("Grade distribution:");
        
       for (int i = 5; i >= 0; i--) {
        System.out.print(i + ": ");
        for (int j = 0; j < countStars[i]; j++) {
            System.out.print("*");
        }
        System.out.println(); // Move to the next line after printing stars for the current category
    }
     
    }

    public int[] countStars() {
        int[] stars = {0, 0, 0, 0, 0, 0};
        int[] gradeLimit = {50, 60, 70, 80, 90, 100};

        for (int grade : grades) {
            if (grade < gradeLimit[0]) {
                stars[0]++;
            } else if (grade < gradeLimit[1]) {
                stars[1]++;
            } else if (grade < gradeLimit[2]) {
                stars[2]++;
            } else if (grade < gradeLimit[3]) {
                stars[3]++;
            } else if (grade < gradeLimit[4]) {
                stars[4]++;
            } else {
                stars[5]++;
            }
        }
        return stars;
    
     
    }

}
