package com.example.SB_Hibernate_Project.dao;

import com.example.SB_Hibernate_Project.entity.Student;

public interface StudenDao {
    public void save(Student student);
    public Student findByRollno(Integer rollNo);
    public void deleteRecord(Integer rollNo);
    Student updateRecord(Student student);


}