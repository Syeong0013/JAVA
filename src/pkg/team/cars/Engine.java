package pkg.team.cars;

// �߻�Ŭ���� > �ν��Ͻ�ȭ �� �� ����
public abstract class Engine {

	private double engineCapacity;
	
	public Engine() {
		
	}
	
	public Engine(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	// �߻� �޼��� 
	public abstract void Explosion();
}
