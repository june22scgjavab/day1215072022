package com.infosys.demo.userinterface;

import java.util.Scanner;

import com.infosys.demo.model.Student;

public class StudentApplication {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int number=scan.nextInt();
		
		//int num[]=new int[number];
	    Student students[]=new Student[number];
	   // |null  |null   |null   |null   |null   |
	   //    0      1       2      3        4
	   // System.out.println(students[0].getMarks());
	    for(int i=0;i<students.length;i++) {
	    	students[i]=new Student();
	    	System.out.println("Enter the roll number");
	    	int roll=scan.nextInt();
	    	students[i].setRoll(roll);
	    	System.out.println("Enter the name of the student");
	    	String name=scan.next();
	    	students[i].setName(name);
	    	System.out.println("Enter the marks");
	    	int marks=scan.nextInt();
	    	students[i].setMarks(marks);
	    }
	    	
       for(Student student : students)
       {
    	   System.out.println(student.getRoll()+" "+student.getName()+" "+student.getMarks());
       }
	    
	    
	    }
	    
	    

	}


