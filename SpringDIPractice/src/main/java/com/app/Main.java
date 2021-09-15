package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Loading the Spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieving the bean
        Employee employee = context.getBean("employee", Employee.class);

        // Calling methods on the bean
        System.out.println(employee.getEmployeeAddress());
        
        System.out.println(employee.getEmployeeAssets());
        
        System.out.println(employee.getEmployeeListOfAddress());
        
        System.out.println(employee.getPerformanceScore());

        // Closing the context
        context.close();

    }
}
