package com.isoProcess.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Table(name = "BUSINESSRULES")
@Data
@NoArgsConstructor
public class BusinessRules {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
//	@Column(name = "CREATED_DATE")
	@Column(name = "CREATED_DATE", updatable = false, insertable = false)
    private Date createdDate;
	@Column(name="CUSTOMERTYPE")
	private String customerType;
	@Column(name="SERVICENUM")
	private String serviceNum;
	@Column(name="CUSTOMERPRIORITY")
	private String customerPriority;
	@Column(name="COUNTER")
	private int counter;
	@Column(name="DURINGBILLING")
	private int duringBilling;
	@Column(name="AFTERBILLING")
	private int afterBilling;
	@Column(name="GENERALOUTAGE")
	private int generalOutage;
	@Column(name="OPENCASE")
	private int openCase;
	@Column(name="NONPAYMENT")
	private int nonPayment;
	@Column(name="EXCEEDPAYMENT")
	private int exceedPayment;
	
}
