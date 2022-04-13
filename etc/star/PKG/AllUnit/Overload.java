package Pkg.AllUnit;
import Pkg.Commons.*;

public class Overload extends Transport implements IFly, ICarry{

	public Overload() {
		super();
		this.health = 40;
		this.pickupNum = 8;
		this.unitkind = UnitKind.Zerg;
	}
	
	public void observe() {
		if(this.state != State.die) {
			System.out.println("----------------------------");
			System.out.println(this.name + "이 숨은 유닛을 스캔합니다.");
			System.out.println("----------------------------");
			this.showHideList();
		}
		else {
			System.out.println("----------------------------");
			System.out.println(this.name + "은 추락한 수송차이므로 스킬사용 불가합니다.");
			System.out.println("----------------------------");
		}
	}
	
}
