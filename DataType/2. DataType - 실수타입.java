
/* 실수타입 = float, double

float
- 4byte, 32bit
- 정밀도 7자리

double
- 8byte, 64bit
- 정밀도 15자리

!실수 리터럴
5e2 > 5.0 * 10^2
0.5e-2 > 0.5 * 10^-2

*/

public class DataType_floatDouble {
	public static void main(String[] args) {
			
		float var1 = 3.14;		>> error
		float var2 = 3.14f;
		double var3 = 3.14;
		
		// 정밀도 테스트 
		float var4 = 0.1234567890123456789f;
		double var5 = 0.1234567890123456789;
		
		System.out.println(var4);	>> 0.12345679
		System.out.println(var5);	>> 0.12345678901234568
	
	}
}
