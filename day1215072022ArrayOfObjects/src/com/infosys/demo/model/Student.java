package com.infosys.demo.model;

import java.util.Objects;

public class Student {
private int roll;
private String name;
private int marks;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
/**
 * @return the roll
 */
public int getRoll() {
	return roll;
}
/**
 * @param roll the roll to set
 */
public void setRoll(int roll) {
	this.roll = roll;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the marks
 */
public int getMarks() {
	return marks;
}
/**
 * @param marks the marks to set
 */
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public int hashCode() {
	return Objects.hash(marks, name, roll);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return marks == other.marks && Objects.equals(name, other.name) && roll == other.roll;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", getRoll()=" + getRoll() + ", getName()="
			+ getName() + ", getMarks()=" + getMarks() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
			+ ", toString()=" + super.toString() + "]";
}

}
