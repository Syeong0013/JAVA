package pkg.team.cars;

public class BigEngine extends Engine{
	
	public BigEngine() {
		super();
	}
	
	public BigEngine(double engineCapacity) {
		super(engineCapacity);
	}
	
	@Override
	public void Explosion() {
		System.out.println("�������� ����");
	}
	
}
