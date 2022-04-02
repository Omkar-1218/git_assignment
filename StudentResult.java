package Basic;

import java.util.*;

public class StudentResult {
	
	float marks;
	Scanner s;
	
	void Result() {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter Marks=");
		marks= s.nextFloat();
		String Res = marks>=40 ? "Result is Pass" : " Result is Fail" ;
		System.out.print(Res);
		
	}
	public static void main(String[] args) {
		StudentResult m= new StudentResult();
		m.Result();
	}

}
