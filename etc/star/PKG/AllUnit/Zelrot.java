public class Zelrot extends Unit implements IAttack{

	private int[] point = {2,4,7,12,18};
	
	public Zelrot() {
		super();
		this.offense = 3;
		this.health = 20;
		this.killPoint = 2;
		this.unitkind = UnitKind.Protoss;
	}
	
	// 추상클래스 추상메소드 재정의
	@Override
	public void upgrade() {
		this.level ++;
		System.out.println("축하합니다.");
		System.out.println(this.name + "레벨이 업그레이드 되었습니다.");
		System.out.println(this.name + "의 현재 레벨 : "+ Integer.toString(this.level));
		System.out.println(this.name + "의 현재 체력 : " + Integer.toString(this.health + (point[level-1] * 2)));
		System.out.println(this.name + "의 현재 공격력 : " + Integer.toString((this.offense) + (point[level-1])));
		this.health += point[level-1] * 2;
		this.offense += point[level-1];
		this.killPoint += this.killPoint;
	}
	
	// 인터페이스 추상메소드 재정의
	@Override
	public void attack(AllUnit unit) {
		System.out.println("----------------------------");
		if(this.chkState(unit)) {
			if(unit instanceof IFly){
				System.out.println("\t*** 공격불가 ***");
				System.out.println(this.name + "은 날아다니는 " + unit.getName() + "을 공격할 수 없습니다.");
				System.out.println("----------------------------");
			}
			else {
				System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");
				unit.attacked(this.offense);
				if(unit.state == State.die) {
					this.killNum ++;
					if(this.killPoint == this.killNum) {
						this.upgrade();
					}
				}
			}
		}
	}
	
	public void run() {
		System.out.println("----------------------------");
		System.out.println(this.name + "이 달립니다.");
	}

}
