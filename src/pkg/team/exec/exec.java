package pkg.team.exec;

import pkg.team.cars.*;

public class exec {
	public static void main(String[] args) {
		
		Sedan sedan = new Sedan("�Ÿ", 220);
		
		sedan.carRun();
		
		String sedanName = sedan.getCarName();
		int sedanMaxSpeed = sedan.getMaxSpeed();
		
		System.out.println(sedanName + sedanMaxSpeed);
	}
}
