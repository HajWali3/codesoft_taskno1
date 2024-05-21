import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Course {
    String courseCode;
    String title;
    String description;
    int capacity;
    String schedule;

    public Course(String courseCode, String title, String description, int capacity, String schedule) {
        this.courseCode = courseCode;
        this.title = title;
        this.description = description;
        this.capacity = capacity;
        this.schedule = schedule;

    }

    @Override
    public String toString() {
        return "\nCourse Code: " + courseCode + "\nCourse Title: " + title + "\nDescription: " + description
                + "\nCourse Schedule: " + schedule;
    }
}

class Student {
    int id;
    String name;
    String[] courses;
    ArrayList<String> regCourses = new ArrayList<>();

    public Student(int id, String name, String[] courses) {
        this.id = id;
        this.name = name;
        this.courses = new String[courses.length];
        for (int i = 0; i < courses.length; i++) {
            this.courses[i] = courses[i];
        }
    }

    public void courseRegistor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select the course you want to register");

        for (int i = 0; i < courses.length; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }

        int courseSelect = -1;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Enter the number of course");
            if (sc.hasNextInt()) {
                courseSelect = sc.nextInt();
                if (courseSelect >= 1 && courseSelect < courses.length) {
                    validInput = true;
                } else {
                    System.out.println("Select number between 1 and " + courses.length);
                }

            } else {
                sc.next();
                System.out.println("Enter a valid number");
            }
        }

        if (checkCourse(courses[courseSelect - 1])) {
            regCourses.add(courses[courseSelect - 1]);
            System.out.println(courses[courseSelect - 1] + " has succesfully been added to your profile");
        } else
            System.out.println("Selected Course already registered");

    }

    public boolean checkCourse(String str) {
        for (int i = 0; i < regCourses.size(); i++) {
            if (str == regCourses.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void courseRemoval() {
        if (regCourses.isEmpty()) {
            System.out.println("No Registered courses to remove");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Select course you want to remove \nYour registered courses are: ");
        for (int i = 0; i < regCourses.size(); i++) {
            System.out.println((i + 1) + ". " + regCourses.get(i));
        }

        int courseSelect = -1;
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Enter the number of course");
            if (sc.hasNextInt()) {
                courseSelect = sc.nextInt();
                if (courseSelect >= 1 && courseSelect <= regCourses.size()) {
                    validInput = true;
                } else
                    System.out.println("Enter number between 1 and " + regCourses.size());
            } else {
                sc.nextInt();
            }
            System.out.println("Enter a valid number.");
        }
        regCourses.remove(courseSelect - 1);
        System.out.println("Course has succesfully been removed from your profile");
    }

    public String toString() {
        return "Course Name: " + name + "Course ID:" + id + "Courses List:\n" + Arrays.toString(courses);
    }
}

public class Task5 {
    public static void main(String[] args) {
        Course calculus = new Course("CALM11", "Calculus",
                "This course will cover a brief introduction and expalanation to calculus.", 30,
                "Thursdays 10:00 AM - 11:00 AM");

        Course OOP = new Course("BSE11", "Object Oriented Programming",
                "This course delves into Object Oreinted Programming Coucepts", 25, "Friday 12:00 AM - 1:00 AM");

        Course SE = new Course("BSE13", "Software Concepts",
                "This course delves into Object Oreinted Programming Coucepts", 20, "Saturday 1:00 AM - 2:00 AM");

        Course reportWriting = new Course("RP11", "Report Wriitng  ", "This course delves into Report Wrtiting", 25,
                "Friday 2:00 PM - 3:00 PM");
        Course PPIT = new Course("PPIT13", "Profession Practices in IT",
                "This course delves into Profession Practices in IT", 20, "Saturday 3:00 PM - 4:00 PM");

        System.out.println(calculus);
        System.out.println(OOP);
        System.out.println(SE);
        System.out.println(reportWriting);
        System.out.println(PPIT);

        String[] courses = { "Object Oriented Programming", "Calculus", "Topics in Software 1",
                "Professional Practices", "Report Writing" };

        Scanner sc = new Scanner(System.in);
        Student s1 = new Student(063, "Ali", courses);
        int count = 0;
        while (true) {
            System.out.println("\n 1. Add a new course \n 2. Remove a cource \n 3. View registered Courses \n 4. Quit");

            boolean validInput = false;
            int opt = -1;
            while (!validInput) {
                if (sc.hasNextInt()) {
                    opt = sc.nextInt();
                    if (opt >= 1 && opt <= 4) {
                        validInput = true;
                    } else {
                        System.out.println("Enter number between 1 and 4");
                    }
                } else {
                    sc.next();
                    System.out.println("Enter a valid number");
                }
            }

            if (opt == 1) {
                if (count <= 5) {
                    s1.courseRegistor();
                    count++;
                } else
                    System.out.println("Maximum Courses Selected");
            } else if (opt == 2) {
                s1.courseRemoval();
            } else if (opt == 3) {
                System.out.println("Your Registered Courses are: " + s1.regCourses);
            } else if (opt == 4) {
                System.out.println("Quited");
                break;
            } else
                System.out.println("Enter a valid option between 1-4");
        }
    }
}