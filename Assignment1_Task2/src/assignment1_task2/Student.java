/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_task2;

/**
 *
 * @author wrk2544
 */
public class Student {
    //Create a Student class with Student ID, First Name, Surname, Uni-Year and Program. (Uni-Year: refers to the no. year 1, 2 or 3 of student’s degree in university).
    public String firstName;
    public String surName;
    public String program;
    public int studentID;
    public int uniYear;
    
    //initialise student object without studentID
    public Student(String firstName, String surName, String program, int uniYear, int studentID) {
        this.firstName = firstName;
        this.surName = surName;
        this.program = program;
        this.uniYear = uniYear;
        this.studentID=studentID;
    }
    
    //swap 2 Student
    public static void swapStudent(Student aStudent, Student anotherStudent)
    {
        String tempFirstName= anotherStudent.getFirstName();
        String tempSurName=anotherStudent.getSurName();
        String tempProgram= anotherStudent.getProgram();
        int tempUniYear= anotherStudent.getUniYear();
        int tempStudentID= anotherStudent.getStudentID();
        //set all attributes of anotherStudent to aStudent attributes
        //reSetStudentAttribute(anotherStudent,aStudent.getFirstName(),aStudent.getSurName(),aStudent.getProgram(),aStudent.getUniYear(),aStudent.getStudentID());
        //set all attributes of aStudent to old values atrributes of anotherStudent
        reSetStudentAttribute(aStudent,tempFirstName, tempSurName,tempProgram,tempUniYear,tempStudentID);
    }
    
    //set attributes of a Student object
    public static void reSetStudentAttribute(Student aStudent, String firstName, String surName, String program, int uniYear, int studentID) {
        aStudent.setFirstName(firstName);
        aStudent.setSurName(surName);
        aStudent.setProgram(program);
        aStudent.setUniYear(uniYear);
        aStudent.setStudentID(studentID);
    }
    //toString
    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", surName=" + surName +  ", uniYear=" + uniYear+ ", program=" + program  + ", studentID=" + studentID +'}';
    }
    
    //getter and setter

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getUniYear() {
        return uniYear;
    }

    public void setUniYear(int uniYear) {
        this.uniYear = uniYear;
    }
    
}
