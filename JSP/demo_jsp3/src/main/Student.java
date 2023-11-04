package com.example.demo_jsp3;

public class Student {
    public Student() {

    }
    private String Rollnumber;
    private String Name;
    private String Address;
    private String city;

    public Student(String rollnumber, String name, String address, String city) {
        Rollnumber = rollnumber;
        Name = name;
        Address = address;
        this.city = city;
    }

    public String getRollnumber() {
        return Rollnumber;
    }

    public void setRollnumber(String rollnumber) {
        Rollnumber = rollnumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
