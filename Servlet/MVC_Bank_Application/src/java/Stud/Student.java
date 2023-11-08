/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stud;

/**
 *
 * @author Dell
 */
public class Student {
    private String rollno;
    private String name;
    private String address;
    private String city;
    public String getCity;
    
    public Student(){
        
    }
    public Student(String rollno, String name, String address, String city){
        this.rollno = rollno;
        this.rollno = name;
        this.rollno = address;
        this.rollno = city;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    
}
