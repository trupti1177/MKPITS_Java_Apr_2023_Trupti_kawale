/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springproject;

import Java.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Dell
 */
public class Springproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee employee=(Employee)context.getBean("e");
employee.show();       // TODO code application logic here
    }
    
}
