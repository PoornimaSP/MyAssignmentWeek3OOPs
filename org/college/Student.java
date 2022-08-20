package org.college;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student Name is 'John Smith'");
	}
	
	public void studentDept()
	{
		System.out.println("Students department is CSE");
	}
	
	public void studentId()
	{
		System.out.println("Student ID is 123");
	}
	
	public static void main(String[] args) {
		College cg= new College();
		System.out.println("Below are the output of methods belonging to Grand Parent class 'College' ");
		cg.collegeCode();
		cg.collegeName();
		cg.collegeRank();

	
		
		
		System.out.println("");
		System.out.println("Below are the output of inherited and own methods belonging to Parent class 'Department' ");
		Department dp= new Department();
		dp.collegeCode();
		dp.collegeName();
		dp.collegeRank();
		dp.deptName();
		
				
		
		System.out.println("");
		System.out.println("Below are the output of inherited and own methods belonging to Child class 'Department' ");
		Student st=new Student();

		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		st.deptName();
		st.studentName();
		st.studentId();
		st.studentDept();	
		
		
		
	}
}
