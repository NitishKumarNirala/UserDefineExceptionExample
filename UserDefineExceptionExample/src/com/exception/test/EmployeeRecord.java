package com.exception.test;


import java.time.ZonedDateTime;

import com.google.gson.annotations.Expose;


public class EmployeeRecord {
   
   @Expose
   private String employeeName;
   @Expose
   private Long  employeeId;
   
   private ZonedDateTime currentDate;
   
   
   
   public ZonedDateTime getCurrentDate() {
      return currentDate;
   }
   public void setCurrentDate(ZonedDateTime currentDate) {
      this.currentDate = currentDate;
   }
   public String getEmployeeName() {
      return employeeName;
   }
   public void setEmployeeName(String employeeName) {
      this.employeeName = employeeName;
   }
   public Long getEmployeeId() {
      return employeeId;
   }
   public void setEmployeeId(Long employeeId) {
      this.employeeId = employeeId;
   }
   
   

}
