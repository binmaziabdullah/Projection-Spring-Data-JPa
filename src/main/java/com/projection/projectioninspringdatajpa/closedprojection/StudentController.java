package com.projection.projectioninspringdatajpa.closedprojection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping()
    public Iterable<Student> getALlStudents(){
        return studentService.getAll();
    }

    @GetMapping("{firstName}")
    public StudentProjection getStudents(@PathVariable String firstName){
        return studentService.getByName(firstName);
    }

    @GetMapping("lastname/{lastName}")
    public StudentProjection getStudentByLastName(@PathVariable String lastName){
        return studentService.getByLastName(lastName);
    }
}
