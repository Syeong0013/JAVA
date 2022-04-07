package pkg.team.cars;

// 추상클래스 > 인스턴스화 할 수 없음
public abstract class Engine {

	private double engineCapacity;
	
	public Engine() {
		
	}
	
	public Engine(double engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	// 추상 메서드 
	public abstract void Explosion();
}
