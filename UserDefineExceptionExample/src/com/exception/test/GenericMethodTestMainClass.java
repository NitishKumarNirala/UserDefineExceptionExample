package com.exception.test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class GenericMethodTestMainClass {
   
   public static void main(String[] args) {
      
      employeeMethod();
      
   }

   private static EmployeeRecord employeeMethod() {
      EmployeeRecord employee=new EmployeeRecord();
      employee.setEmployeeName("Vivek");
      System.out.println("employee Name"+employee.getEmployeeName());
      employee=GenericMethodExample.convertJson(employee.getEmployeeName(), EmployeeRecord.class);
      employee.setEmployeeId(1l);
      employee.setCurrentDate(ZonedDateTime.now(ZoneId.systemDefault()));
      System.out.println("employee Name"+employee.getEmployeeName());
      return employee;
   }

}
