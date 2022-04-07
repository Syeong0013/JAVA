
public class CalculatorExample {
	public static void main(String[] args) {
		
		
		Calculator cal = new Calculator();
		
		System.out.println("계산기");
		cal.powerOn();
		cal.plus(3, 4);
		cal.powerOff();
		
		cal.powerOn();
		int[] values = {200,200};
		cal.plus1(values);
		cal.plus1(new int[] {1,2,3});
		cal.plusminus(2, 4);
		
		
		// 정사각형의 넓이를 구하는 메서드
		cal.areaRectangle(3);
		
		// 직사각형의 넓이를 구하는 메서드 
		cal.areaRectangle(3,4);
		
	}
}
