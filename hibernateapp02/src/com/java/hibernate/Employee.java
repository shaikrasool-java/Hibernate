package com.java.hibernate;
import java.sql.*;

public class Employee {
	
	private int eid;
	private String fname;
	private String lname;
	//private TimeStamp ts;
		
	/*private int v;
	public int getV() {
		return v;
	}
	public void setV(int v) {
		this.v = v;
	}*/
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	/*public TimeStamp getTs() {
		return ts;
	}
	public void setTs(TimeStamp ts) {
		this.ts = ts;
	}*/
	

}
