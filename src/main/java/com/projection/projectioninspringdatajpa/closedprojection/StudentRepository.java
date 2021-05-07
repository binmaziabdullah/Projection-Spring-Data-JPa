package com.projection.projectioninspringdatajpa.closedprojection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    /*Here we are getting the specific recording from student projection
    * and setting the return type student projection interface*/
    StudentProjection findByFirstName(String firstName);

    StudentProjection findByLastName(String lastName);

}
