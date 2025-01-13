package Q2;
import java.util.Scanner;

public class Q2_GradesAverage {
    int numStudents, i=0;
    int[] grades;

    public void checkGrade(int numStudents){
        Scanner input=new Scanner(System.in);
        this.numStudents=numStudents;
        this.grades = new int[numStudents];
        while(i<numStudents){
            System.out.println("Enter the grade for student "+i +":");
            int gradeValue = input.nextInt();
            if(gradeValue>=1 &&  gradeValue<=100) {
                grades[i] = gradeValue;
                i++;
            }else{
                System.out.println("Invalid grade, try again...");
            }
        }
    }

    public void getAverage(){
        int sum=0,length;
        long average;
        length=grades.length;
        for(int i=0;i<length;i++){
            sum=sum+grades[i];
        }
        average=sum/length;
        System.out.println("The average is "+average);
    }

    public static void main(String[] args) {
        int studentCount;
        Scanner in=new Scanner(System.in);
        Q2_GradesAverage grade=new Q2_GradesAverage();
        System.out.print("Enter the number of students: ");
        studentCount=in.nextInt();
        grade.checkGrade(studentCount);
        grade.getAverage();
    }
}
