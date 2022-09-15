package com.saurabh.bean;

public class Test {
	
	void regStudent(StudentBean studentBean) {
		System.out.println(studentBean.getName());
		System.out.println(studentBean.getId());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentBean student = new StudentBean();
		student.setName("SAURABH");
		student.setId(12);
		
		Test t  = new Test();
		t.regStudent(student);
		

	}

}
