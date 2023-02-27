import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Student.Student;

public class App {
    public static void main(String[] args) throws Exception {
       

        System.out.println("======================================");
        System.out.println("Welcome to VCC!");
        System.out.println("======================================");

        showOptions();
    }

    public static void showOptions() {
        Scanner sc = new Scanner(System.in);
        String option = "0";
        List<Student> studentList = new ArrayList<>();

        do {
            System.out.println("======================================");
            System.out.println("1. Show Students");
            System.out.println("2. Add your Student ID");
            System.out.println("3. LEAVE");
            System.out.println("======================================");

            System.out.println("please choose an option : ");

            option = sc.next();

            System.out.println();

            System.out.println(option + "OPTION");
            switch(option) {
                case "1":
                System.out.println("Here is the student list");
                showAllStudentDetails(studentList);
                break;

                case"2":
                System.out.println("You chose to add your student ID");
                System.out.println("======================================");

                System.out.println("======================================");
                Student newStudent = new Student();
                newStudent = enterStudentDetails();

                studentList.add(newStudent);

                break;

                case "3": 
                System.out.println("Good bye");
                sc.close();
                break;
                default:
                System.out.println("Error ");
                break;

            }


        } while (option != "3");


        System.out.println("Thank you");
    }


    public static Student enterStudentDetails() {
        try (Scanner sc2 = new Scanner(System.in)) {
            String name = "";
            String age = "";
            String email = "";

            name = sc2.next();

            System.out.println("Enter Employee Email : ");
            email = sc2.next();

            System.out.println("Enter Employee Age : ");
            age = sc2.next();

            Student newStudent = new Student(name, email, age);

            return newStudent;
        }
    }
    public static void showAllStudentDetails(List<Student> studentList) {
        for (Student student: studentList) {

            System.out.println("***************************");

            student.getStudentInfo();

            System.out.println("***************************");
        }

    }

}
