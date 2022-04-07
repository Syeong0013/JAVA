package pkg.team.cars;

public class Tank extends Car{
	
	private int maxBulletCnt;
	
	public int getMaxBulletCnt() {
		return maxBulletCnt;
	}

	public Tank() {
		super();
	}
	
	public Tank(String carName, int maxSpeed) {
		super(carName, maxSpeed);
	}
	
	public Tank(String carName, int maxSpeed, int maxBulletCnt) {
		super(carName, maxSpeed);
		this.maxBulletCnt = maxBulletCnt;
	}
	
	@Override
	public void carRun() {
		System.out.println("탱커가 달린다.");
	}
	
	@Override
	public void speedUp() {
		System.out.println("탱커 속도가 느리게 올라간다.");
	}
	
	@Override
	public void fixEngine() {
		BigEngine bEngine = new BigEngine();
		this.setEngine(bEngine);
	}
}
