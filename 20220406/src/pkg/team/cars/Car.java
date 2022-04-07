package pkg.team.cars;

// abstract >> �߻�Ŭ����
// �� Ŭ������ ��ӹ޴� �� �ٸ� Ŭ������ ������ �߻� ��� (�߻�Ŭ����, �߻� �ӻ�)�� ������ �ؾ��Ѵ�.
public abstract class Car {
	
	// 1. �Ӽ��� �߻�ȭ > �ν��Ͻ�ȭ �� �� �������dddddd
	private String carName;
	private int maxSpeed;
	private int nowSpeed;
	private Engine carEngine; 	// �Ӽ�
	

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNowSpeed() {
		return nowSpeed;
	}

	public void setNowSpeed(int nowSpeed) {
		this.nowSpeed = nowSpeed;
	}

	public String getCarName() {
		return carName;
	}

	/*
	// new Car �� �� ������ �̹� ����־���ϴ� ��Ȳ
	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	*/
	
	
	// 2. ������
	// ���� �ΰ��� �Ӽ� ���� CarŬ������ ����ϴ� �ʿ��� �ʱ�ȭ�� ���̳� 
	// ���� �ΰ��� �Ӽ� ���� �ʱⰪ�� �Ҵ��� ���� �� ���̳�
	public Car() {
		this.nowSpeed = 0;
	}
	
	public Car(String carName, int maxSpeed) {
		this.nowSpeed = 0;
		this.carName = carName;
		this.maxSpeed = maxSpeed;
	}
	
	// 3. �߻� �޽��
	public abstract void carRun();
		// �޸��� ������ ������ ��� �޸��� ���� ���ؼ��� �����ϰ� �������� �ʴ´�. > �߻�ȭ
	
	public abstract void fixEngine();
		// ������ �̹� ������ ���·� Car�� �ν��Ͻ�ȭ�ؾ���.
	
	protected void setEngine(Engine carEngine) {
		// ���������ڸ� public���� ���� �� 
		// ��ӹ޴� ����Ŭ�������� carEngine�� ������ ������ setEngine �޼���� ����
		// public���� ������ �� �Ҿ��ϴ�. >> protected
		this.carEngine = carEngine;
	}
	
	public void speedUp() {
		System.out.println("�ӵ��� �ö󰩴ϴ�.");
	}
	

	
}
