package com.plexus.second.project.repository;

import com.plexus.second.project.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {
    List<Student> students = new ArrayList<>();
    StudentRepo(){
        Student s=new Student(77, "Shravani Katkar");
        students.add(s);
        s=new Student(97,"Yogita Mohite");
        students.add(s);
        s=new Student(48, "Pragati Jadhav");
        students.add(s);
        s=new Student(60,"Vedika Jagtap");
        students.add(s);
    }

    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student s){
        students.add(s);
    }
    public Student getStudentByRollNo(Integer rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                return s;
            }
        }
            return null;

    }
}
