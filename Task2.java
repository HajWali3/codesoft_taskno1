import java.util.Arrays;
import java.util.Scanner;

 class GradeCalculator{
    double[] marks;
    int noOfSubs;
    double ttlMarks = 0;
    double avgMarks = 0;
    String grade = "";
    
    public void inputMarks()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of subjects: ");

        boolean validInput  = false;
        while (!validInput) {
            if(sc.hasNextInt()){
                this.noOfSubs = sc.nextInt();
                if(noOfSubs > 0){
                    validInput = true;
                } else{
                    System.out.println("Enter valid number of subjects");
                }
            } else {
                sc.next();
                System.out.println("Enter valid number of subjects");
            }
        }
        this.marks = new double[noOfSubs];

        for(int i=0; i<noOfSubs; i++)
        {
            System.out.println("Enter your " + (i+1) + " Subject marks out of 100");
            boolean validMarks = false;
            while(!validMarks)
            {
                if(sc.hasNextInt()){
                    this.marks[i] = sc.nextDouble();
                    if(this.marks[i] <= 100 && this.marks[i] >= 0){
                        validMarks = true;
                    }
                        else{
                        System.out.println(" Enter valids marks between 0-100");
                    }
                } else {
                    sc.next();
                    System.out.println("Enter valid marks");
                }
            }
        }  
        sc.close();
    }

    public void ttlMarks(){
        for(int i=0; i<noOfSubs; i++)
        {
            this.ttlMarks += marks[i];
        }
    }

    public void avgMarks(){
        this.avgMarks = this.ttlMarks/this.noOfSubs;
    }

    public void grades(){
        for(int i=0; i<noOfSubs; i++)
        {
            if(this.avgMarks<=100 && this.avgMarks >=90)
                grade  = "A+";
            else if(this.avgMarks< 90 && this.avgMarks >=80)
                grade = "A";
            else if(this.avgMarks<80 && this.avgMarks >=70)
                grade = "B";
            else if(this.avgMarks<70 && this.avgMarks >=60)
                grade = "C";
            else if(this.avgMarks<60 && this.avgMarks >=50)
                grade = "C";
            else if(this.avgMarks<50 && this.avgMarks >=0)
                grade = "Fail";               
        }
    }

    public void show(){
        System.out.println("\nTotal Marks: " + this.ttlMarks + "\nAverage Marks: " + this.avgMarks + "\nGrade: " + this.grade);
    }
}

public class Task2{
    public static void main(String[] args) {
        gradeCalculator student1 = new gradeCalculator();

        student1.inputMarks();
        student1.ttlMarks();
        student1.avgMarks();
        student1.grades();
        student1.show();

    }
}
