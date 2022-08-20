package week3.day1assignment;

public class Students {
	
	public void getStudentInfo(int id)
	
	{
		System.out.println("Below is the output of overloaded method with id args alone");
		System.out.println("The ID of Student is "+ id);
	}

	public void getStudentInfo(int id,String name)
	
	{				System.out.println("");
	System.out.println("Below is the output of overloaded method with id and name args ");
		System.out.println("The ID and Name of student are "+ id+" and "+name);
		
	}

	public void getStudentInfo(String email,int Phone)
	{
		System.out.println("");
		System.out.println("Below is the output of overloaded method with Email and Phone args ");
		System.out.println("The Email ID of student is "+ email);
		System.out.println("The Phone number of student is "+Phone);
	}
public static void main(String[] args) {
	Students st= new Students();
	st.getStudentInfo(356);
	st.getStudentInfo(45, "Arjun");
	st.getStudentInfo("test@test.com", 3453450);
}
}
