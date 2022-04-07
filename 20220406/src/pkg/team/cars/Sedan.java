package pkg.team.cars;

public class Sedan extends Car{
	
	public Sedan() {
		super();
	}
	
	public Sedan(String carName, int maxSpeed) {
		super(carName, maxSpeed);
	}
	
	// �߻�Ŭ������ ��ӹ޴� Ŭ������ �߻�޽�带 �ݵ�� �������ؾ���.
	@Override
	public void carRun() {
		System.out.println("������ �޸���.");
	}
	
	@Override
	public void fixEngine() {
		SmallEngine sEngine = new SmallEngine();
		this.setEngine(sEngine);
	}
}
