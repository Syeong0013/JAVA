package Pkg.AllUnit;

import Pkg.Commons.*;

public class Shuttle extends Transport implements ICarry,IFly{

	public Shuttle() {
		super();
		this.health = 30;
		this.pickupNum = 8;
		this.unitkind = UnitKind.Protoss;
	}

}
