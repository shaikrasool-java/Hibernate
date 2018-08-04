package com.java.hibernate;

import java.util.Set;

public class Student {

	private int sid;
	private String sname;
	private int marks;
	private Set courses;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Set getCourses() {
		return courses;
	}
	public void setCourses(Set courses) {
		this.courses = courses;
	}
}
