package com.mobile.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//In this class I have created the details of mobile and make table of name Mobile by entity annotation and set mobileId as primary key
@Entity
public class Mobile {

 @Id
 @GeneratedValue
 private int	mobileId;
 private String	mobileName;
 private String	mobileTYPE;
 private int	mobilePrice;
 private int	mobileWarenty;
 private int	mobileIMEINumber;
public int getMobileId() {
	return mobileId;
}
public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}
public String getMobileName() {
	return mobileName;
}
public void setMobileName(String mobileName) {
	this.mobileName = mobileName;
}
public String getMobileTYPE() {
	return mobileTYPE;
}
public void setMobileTYPE(String mobileTYPE) {
	this.mobileTYPE = mobileTYPE;
}
public int getMobilePrice() {
	return mobilePrice;
}
public void setMobilePrice(int mobilePrice) {
	this.mobilePrice = mobilePrice;
}
public int getMobileWarenty() {
	return mobileWarenty;
}
public void setMobileWarenty(int mobileWarenty) {
	this.mobileWarenty = mobileWarenty;
}
public int getMobileIMEINumber() {
	return mobileIMEINumber;
}
public void setMobileIMEINumber(int mobileIMEINumber) {
	this.mobileIMEINumber = mobileIMEINumber;
}
 
 public Mobile() {
	// TODO Auto-generated constructor stub
}
public Mobile(int mobileId, String mobileName, String mobileTYPE, int mobilePrice, int mobileWarenty,
		int mobileIMEINumber) {
	super();
	this.mobileId = mobileId;
	this.mobileName = mobileName;
	this.mobileTYPE = mobileTYPE;
	this.mobilePrice = mobilePrice;
	this.mobileWarenty = mobileWarenty;
	this.mobileIMEINumber = mobileIMEINumber;
}
@Override
public String toString() {
	return "Mobile [mobileId=" + mobileId + ", mobileName=" + mobileName + ", mobileTYPE=" + mobileTYPE
			+ ", mobilePrice=" + mobilePrice + ", mobileWarenty=" + mobileWarenty + ", mobileIMEINumber="
			+ mobileIMEINumber + "]";
}
 
}
