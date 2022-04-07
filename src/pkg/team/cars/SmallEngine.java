package pkg.team.cars;

public class SmallEngine extends Engine{
	
	public SmallEngine() {
		super();
	}
	
	public SmallEngine(double engineCapacity) {
		super(engineCapacity);
	}
	
	@Override
	public void Explosion() {
		System.out.println("소형엔진 폭발");
	}
	
}
