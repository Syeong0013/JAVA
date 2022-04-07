package Pkg.Final;

public class FinalExec {
	public static void main(String[] args) {
		Final person = new Final("990101-2288191", "한사랑");
		
		System.out.println(person.ssn);			// 990101-2288191
		System.out.println(person.name);		// 한사랑
		
		//person.ssn = "001010-3291029"; 			>> error
		person.name = "최고야";
		System.out.println(person.name);		// 최고야
	}
}
