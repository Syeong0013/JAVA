package Pkg.Final;

public class FinalExec {
	public static void main(String[] args) {
		Final person = new Final("990101-2288191", "�ѻ��");
		
		System.out.println(person.ssn);			// 990101-2288191
		System.out.println(person.name);		// �ѻ��
		
		//person.ssn = "001010-3291029"; 			>> error
		person.name = "�ְ��";
		System.out.println(person.name);		// �ְ��
	}
}
