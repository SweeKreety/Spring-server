package com.example.demo.model.students;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentsDao {
    @Autowired
    private StudentsRepository repository;

    public void save(Students students){
        repository.save(students);
    }
    public void delete(Students students){
        repository.delete(students);
    }
    public List<Students> getAllStudents(){
        List<Students> students= new ArrayList<>();
        Streamable.of(repository.findAll())
        .forEach(students:: add);
        return students;
        }
    }

