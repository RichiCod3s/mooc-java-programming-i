
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    //return the average of the grades. If the register contains no grades, the method should return -1
    public double averageOfGrades() {

        int sumOfGrades = 0;
        int noOfGrades = grades.size();
        double average = 0;
        
        if (grades.isEmpty()) {
            return -1;
        }

        for (Integer grade : grades) {
            sumOfGrades += grade;
        }

        average = (double)sumOfGrades / noOfGrades;
        return average;
    }
    
    public double averageOfPoints(){
        int sumOfPoints =0;
        int noOfPoints = points.size();
        double average =0;
        
        
        if(points.isEmpty()){
            return -1;
        }
        
        for(int point: points){
            sumOfPoints += point;
        }
        
        average = (double)sumOfPoints / noOfPoints;
        
        return average;
        
    }
}
