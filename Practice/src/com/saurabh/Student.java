package com.saurabh;

public class Student {
	
	int roll;
	int id ;
	String   name;
	String course;
	
	void regStudent(int roll, int id, String name, String course ) {
		this.course=course;
		this.name = name;
		this.id = id;
		this.roll = roll;
	}
	
	

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", id=" + id + ", name=" + name + ", course=" + course + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s  = new Student();
		s.regStudent(01, 100, "Saurabh", "Java");
		System.out.println(s);
		

	}

}
