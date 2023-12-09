package com.example.SB_Hibernate_Project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
    @Id
    private int Roll_No;
    private String Stud_Name;
    private String Stud_Address;
    private String City;

    public Student() {
    }

    public Student(String stud_Name, String stud_Address, String city) {
        Stud_Name = stud_Name;
        Stud_Address = stud_Address;
        City = city;
    }

    public int getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(int roll_No) {
        Roll_No = roll_No;
    }

    public String getStud_Name() {
        return Stud_Name;
    }

    public void setStud_Name(String stud_Name) {
        Stud_Name = stud_Name;
    }

    public String getStud_Address() {
        return Stud_Address;
    }

    public void setStud_Address(String stud_Address) {
        Stud_Address = stud_Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Roll_No=" + Roll_No +
                ", Stud_Name='" + Stud_Name + '\'' +
                ", Stud_Address='" + Stud_Address + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}