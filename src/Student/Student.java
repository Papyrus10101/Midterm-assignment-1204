package Student;

import java.util.UUID;

public class Student {
    
    private String name;
    private String email;
    private String age;
    private String studentID;

    
    public Student() {
        this.name = "Noah Nunez";
        this.email = "noah.nunez@gmail.com";
        this.age = "19";
        
        this.studentID = UUID.randomUUID().toString();
    }
    
    public Student(String name, String email, String age){
        this.name = name;
        this.email = email;
        this.age = age;

        this.studentID = UUID.randomUUID().toString();
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }



    public void getStudentInfo() {
        System.out.println("Student Name : " + this.getName());
        System.out.println("Student Email : " + this.getEmail());
        System.out.println("Student Age : " + this.getAge());
        System.out.println("Student ID : " + this.getStudentID());
    }
}


