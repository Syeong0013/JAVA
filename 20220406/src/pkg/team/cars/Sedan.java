package pkg.team.cars;

public class Sedan extends Car{
	
	public Sedan() {
		super();
	}
	
	public Sedan(String carName, int maxSpeed) {
		super(carName, maxSpeed);
	}
	
	// 추상클래스를 상속받는 클래스는 추상메써드를 반드시 재정의해야함.
	@Override
	public void carRun() {
		System.out.println("세단이 달린다.");
	}
	
	@Override
	public void fixEngine() {
		SmallEngine sEngine = new SmallEngine();
		this.setEngine(sEngine);
	}
}
