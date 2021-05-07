package com.projection.projectioninspringdatajpa.closedprojection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student){
      return studentRepository.save(student);
    }

    public StudentProjection getByName(String firstName)
    {
        return studentRepository.findByFirstName(firstName);
    }

    public StudentProjection getByLastName(String lastName)
    {
        return studentRepository.findByLastName(lastName);
    }

    public Iterable<Student> getAll(){
        return studentRepository.findAll();
    }
}
