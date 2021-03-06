
/*
byte 
     - 1byte, 8bit 
     - -2^7 ~ 2^7-1
     
     short
     - 2byte, 16bit
     - -2^15 ~ 2^15-1
     
     char (유니코드)
     - 2byte, 16bit
     - 0 ~ 2^16-1
     
     int 
     - 4byte, 32bit
     - -2^31 ~ 2^31-1
     
     long
     - 8byte, 64bit
     - -2^63 ~ 2^63-1
     
     ! 정수 리터럴
     2진수 : 0b or 0B로 시작하며 0,1로만 구성된다.
     8진수 : 0으로 시작하고 0 ~ 7의 숫자로 구성된다.
     10진수 : 소수점이 없는 0 ~ 9의 숫자로 구성된다.
     16진수 : 0x or 0X로 시작하고 0 ~ 9의 숫자와 A ~ F까지의 문자로 구성된다.
     
*/


public class DataType_int {
	public static void main(String[] args) {
  
		int var1 = 0b11;
		int var2 = 0011;
		int var3 = 11;
		int var4 = 0x11;
		
		System.out.println(var1);	// 3
		System.out.println(var2);	// 9
		System.out.println(var3);	// 11
		System.out.println(var4);	// 17
		
	}
}

public class DataType_byte {
	public static void main(String[] args) {
			
		byte var1 = -128;
		byte var2 = -127; 
		byte var3 = 0;
		byte var4 = 127;
		byte var = 128;		 	>> error
	}
}

public class DataType_long {
	public static void main(String[] args) {
			
		long var1 = 10;
		long var2 = 20L;
		long var3 = 1000000000000;	>> error
		long var4 = 1000000000000L;
	}
}

public class DataType_char {
	public static void main(String[] args) {
			
		char var1 = 'A';
		char var2 = 65;
		
		System.out.println(var1);	// A
		System.out.println(var2);	// A
	}
}

public class DataType_String {
	public static void main(String[] args) {
			
		String var1 = "java";
		String var2 = "자바";
		
		System.out.println(var1);			>> java
		System.out.println(var2);			>> 자바
		
		
		String var3 = "문자열에 따옴표 넣기 \"연습\"";
		System.out.println(var3);			>> 문자열에 따옴표 넣기 "연습"
		
		String var4 = "TAB\t사용해서\t공백주기";
		System.out.println(var4);			>> TAB	사용해서	공백주기
		
		String var5 = "Enter\n사용해서\n줄바꿈";
		System.out.println(var5);			>> Enter
								   사용해서
								   줄바꿈
	
	}
}

