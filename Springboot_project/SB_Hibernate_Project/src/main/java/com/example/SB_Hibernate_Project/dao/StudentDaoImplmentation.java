package com.example.SB_Hibernate_Project.dao;

import com.example.SB_Hibernate_Project.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDaoImplmentation implements StudenDao{
    private EntityManager entityManager;

    @Autowired
    public StudentDaoImplmentation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }

    @Override
    public Student findByRollno(Integer rollNo) {
        return entityManager.find(Student.class,rollNo);
    }

    @Override
    @Transactional
    public void deleteRecord(Integer rollNo) {
        Student student = entityManager.find(Student.class,rollNo);
        entityManager.remove(student);
        System.out.println("Record deleted successfully");
    }

    @Override
    @Transactional
    public Student updateRecord(Student student) {
        return entityManager.merge(student);
    }
}