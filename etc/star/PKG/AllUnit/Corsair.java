package Pkg.AllUnit;

import Pkg.Commons.*;

public class Corsair extends Airplane implements IAttack{

	public Corsair() {
		super();
		this.offense = 5;
		this.health = 40;
		this.unitkind = UnitKind.Protoss;
	}
	
	public Corsair(int offense) {
		super(offense);
		this.health = 40;
		this.unitkind = UnitKind.Protoss;
	}


	@Override
	public void attack(AllUnit unit) {
		System.out.println("----------------------------");
		if(this.chkState(unit)) {
			if(unit instanceof Mutal) {
				System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");
				System.out.println("상대가 뮤탈이므로 공격력 두 배 적용 : " + Integer.toString((this.offense) * 2));
				unit.attacked(this.offense * 2);
			}
			else {
				System.out.println(this.name + "이 " + unit.getName() + "을 공격합니다.");
				unit.attacked(this.offense);
			}
		}
	}
}	
