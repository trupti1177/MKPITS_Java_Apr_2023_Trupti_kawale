/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author Dell
 */
public class Employee {
    private int id;  
private String name;  
  
public Employee() {System.out.println("def cons");}  
  
public Employee(int id) {this.id = id;}  
  
public Employee(String name) {  this.name = name;}  
  
public Employee(int id, String name) {  
    this.id = id;  
    this.name = name;  
}  
  
public void show(){  
    System.out.println(id+" "+name);  
}  
  
}  