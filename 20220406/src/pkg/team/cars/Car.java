package pkg.team.cars;

// abstract >> 추상클래스
// 이 클래스를 상속받는 또 다른 클래스는 무조건 추상 멤버 (추상클래스, 추상 속상)을 재정의 해야한다.
public abstract class Car {
	
	// 1. 속성의 추상화 > 인스턴스화 할 수 없어야함dddddd
	private String carName;
	private int maxSpeed;
	private int nowSpeed;
	private Engine carEngine; 	// 속성
	

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
	// new Car 할 때 엔진이 이미 들어있어야하는 상황
	public Engine getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(Engine carEngine) {
		this.carEngine = carEngine;
	}
	*/
	
	
	// 2. 생성자
	// 위의 두가지 속성 값을 Car클래스를 사용하는 쪽에서 초기화할 것이냐 
	// 위의 두가지 속성 값을 초기값을 할당한 상대로 할 것이냐
	public Car() {
		this.nowSpeed = 0;
	}
	
	public Car(String carName, int maxSpeed) {
		this.nowSpeed = 0;
		this.carName = carName;
		this.maxSpeed = maxSpeed;
	}
	
	// 3. 추상 메써드
	public abstract void carRun();
		// 달리는 행위는 있으나 어떻게 달리는 지에 대해서는 세세하게 정의하지 않는다. > 추상화
	
	public abstract void fixEngine();
		// 엔진이 이미 장착된 상태로 Car를 인스턴스화해야함.
	
	protected void setEngine(Engine carEngine) {
		// 접근제어자를 public으로 설정 시 
		// 상속받는 하위클래스에서 carEngine은 보이지 않지만 setEngine 메서드는 보임
		// public으로 열리는 게 불안하다. >> protected
		this.carEngine = carEngine;
	}
	
	public void speedUp() {
		System.out.println("속도가 올라갑니다.");
	}
	

	
}
