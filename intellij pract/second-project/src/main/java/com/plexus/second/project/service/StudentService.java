package com.plexus.second.project.service;

import com.plexus.second.project.model.Student;
import com.plexus.second.project.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;

    public List<Student> getStudents(){
        return repo.getStudents();
    }
    public void addStudent(Student s){
        repo.addStudent(s);
    }
    public Student getStudentsByRollNo(Integer rollNo){
        return repo.getStudentByRollNo(rollNo);
    }

    public Student getStudentByRollNo(Integer rollNo) {
        return repo.getStudentByRollNo(rollNo);
    }
}
