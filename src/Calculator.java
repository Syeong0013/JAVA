// ���� ��ü 
public class Calculator {
	
	public void powerOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	
	public void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	
	public void divide(int x, int y) {
		double result = (double)x / (double)y;
		System.out.println(x + " + " + y + " = " + result);
	}
	
	public int plus(int x, int y) {
		int result = x * y;
		System.out.println(x + " * " + y + " = " + result);
		return result;
	}
	
	public void plus1(int[] values) {
		int sum = 0;
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		System.out.println("�Է��� ������ ���� : " + sum);
	}
	
	// �޼ҵ忡�� �ٸ� �޼ҵ� ȣ�� plusȣ��>> return �޾ƿ;���
	public void plusminus(int x, int y) {
		int result1 = plus(x, y);
		result1 = result1 -1;
		System.out.println(x + " + " + y + " - 1 = " + result1);
	}
	
	// ���簢���� ���̸� ���ϴ� �޼ҵ�
	public void areaRectangle(double width) {
		System.out.println("���簢���� ���̴� = " + width * width );
	}
	// ���簢���� ���̸� ���ϴ� �޼��� 
	public void areaRectangle(double width, double height) {
		System.out.println("���簢���� ���̴� = " + width * height );
	}
}
