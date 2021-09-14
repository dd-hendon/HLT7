package io.HLT7;

public class Student {
    //static field common across all instances of Student
    static String university = "Harvard";

    //instance fields
    int studentId;
    String studentName;

    //empty constructor
    public Student() {
    }

    //overloaded constructor
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //combined setter
    void setData(int id, String name){
        this.studentId = id;
        this.studentName = name;
    }

    //generated setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //generated getters
    public int getStudentId() {
        return studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public static String getUniversity() {
        return university;
    }

    //print student data method
    public void printData(){
        System.out.println("Student ID: " +  this.getStudentId()+
                       "\nStudent Name: " +  this.getStudentName()+
                       "\nUniversity: "   + university +
                       "\n");
    }



}

