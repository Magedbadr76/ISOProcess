package com.isoProcess.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DashboardCountPerDept {
   @Id
   private String name;
   private Long counts;

   // Getters and Setters
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
   public Long getCounts() {
       return counts;
   }
   public void setCounts(Long counts) {
       this.counts = counts;
   }
}
