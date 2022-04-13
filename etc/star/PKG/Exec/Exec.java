package Pkg.Exec;

import Pkg.AllUnit.*;

public class Exec {
	
	public static void main(String[] args) {
		Zergling zg1 = new Zergling();
		zg1.name = "저글링1";
		Zergling zg2 = new Zergling();
		zg2.name = "저글링2";
		Zergling zg3 = new Zergling();
		zg3.name = "저글링3";
		Zergling zg4 = new Zergling();
		zg4.name = "저글링4";
		Zergling zg5 = new Zergling();
		zg5.name = "저글링5";
		Zergling zg6 = new Zergling();
		zg6.name = "저글링6";
		Zergling zg7 = new Zergling();
		zg7.name = "저글링7";
		Zergling zg8 = new Zergling();
		zg8.name = "저글링8";
		Zergling zg9 = new Zergling();
		zg9.name = "저글링9";
		Zergling zg10 = new Zergling();
		zg10.name = "저글링10";
		
		Zelrot zr1 = new Zelrot();
		zr1.name = "질럿1";
		Zelrot zr2 = new Zelrot();
		zr2.name = "질럿2";
		
		
		Dragon dr1 = new Dragon();
		dr1.name = "드라곤1";
		Dragon dr2 = new Dragon();
		dr2.name = "드라곤2";

		
		Mutal mu = new Mutal(30);
		mu.name = "뮤탈1";
		Mutal mu1 = new Mutal();
		mu1.name = "뮤탈2";
		Mutal mu2 = new Mutal();
		mu2.name = "뮤탈3";
		Mutal mu3 = new Mutal();
		mu3.name = "뮤탈4";
		Mutal mu4 = new Mutal();
		mu4.name = "뮤탈5";
		Mutal mu5 = new Mutal();
		mu5.name = "뮤탈6";
		Mutal mu6 = new Mutal();
		mu6.name = "뮤탈7";
		Mutal mu7 = new Mutal();
		mu7.name = "뮤탈8";
		Mutal mu8 = new Mutal();
		mu8.name = "뮤탈9";

		Corsair co = new Corsair();
		co.name = "코세어1";
		
		Shuttle sh= new Shuttle();
		sh.name = "셔틀1";
		
		Overload ov = new Overload();
		ov.name = "오버로드1";
		Overload ov1 = new Overload();
		ov1.name = "오버로드2";
		
		ScienceVessel sc = new ScienceVessel();
		sc.name = "사이언스1";
		
		Ghost ghost = new Ghost();
		ghost.name = "고스트1";
		Ghost ghost1 = new Ghost();
		ghost1.name = "고스트2";
		
		/*
		System.out.println("\t    질럿 ");
		
		System.out.println("");
		System.out.println("\t상대 종족 공격");
		zr1.attack(mu);
		zr1.attack(ov);
		
		System.out.println("");
		System.out.println("\t  동족 공격");
		zr1.attack(dr1);
		zr1.attack(ghost1);
		zr1.attack(sh);
		zr1.attack(sc);
		
		System.out.println("");
		System.out.println("\t  레벨 업 및 적용 확인");
		zr1.attack(zg1);
		zr1.attack(zg1);
		zr1.attack(zg1);
		zr1.attack(zg1);
		zr1.attack(zg2);
		zr1.attack(zg2);
		zr1.attack(zg2);
		zr1.attack(zg2);
		zr1.attack(zg3);
		zr1.attack(zg3);
		zr1.attack(zg4);
		zr1.attack(zg4);
		zr1.attack(zg5);
		
		System.out.println("");
		System.out.println("\t  질럿 쓰러진 후");
		mu.attack(zr1);
		mu.attack(zr1);
		zr1.attack(zg3);
		
		System.out.println("");
		System.out.println("\t 하늘 유닛 공격");
		zr2.attack(mu);
		*/
		/*
		System.out.println("\t    뮤탈");
		System.out.println("");
		System.out.println("\t  동족 공격");
		mu.attack(zg2);
		mu.attack(ov);
		
		System.out.println("");
		System.out.println("\t 상대 종족 공격");
		mu.attack(zr1);
		mu.attack(dr1);
		mu.attack(ghost1);
		mu.attack(co);
		mu.attack(sh);
		mu.attack(sc);
		
		System.out.println("");
		System.out.println("\t  쓰러짐");
		dr1.attack(mu);
		mu.attack(dr1);
		dr1.attack(mu);
		*/
		/*
		System.out.println("\t    오버로드");
		System.out.println("");
		System.out.println("\t  동족 외 탑승 시도");
		ov.pickup(zr1);
		ov.pickup(dr1);
		ov.pickup(ghost1);
		ov.pickup(co);
		ov.pickup(sh);
		ov.pickup(sc);
		
		System.out.println("");
		System.out.println("     날아다니는 동족 탑승 시도");
		ov.pickup(mu);
		
		System.out.println("");
		System.out.println("     걸어다니는 동족 탑승 시도");
		ov.pickup(zg1);
		
		System.out.println("");
		System.out.println("    이미 탑승 중인 유닛으로 탑승 시도");
		ov.pickup(zg1);
		
		System.out.println("");
		System.out.println("\t수용 인원 초과 시 ");
		ov.pickup(zg1);
		ov.pickup(zg2);
		ov.pickup(zg3);
		ov.pickup(zg4);
		ov.pickup(zg5);
		ov.pickup(zg6);
		ov.pickup(zg7);
		ov.pickup(zg8);
		ov.pickup(zg9);
		
		System.out.println("");
		System.out.println("    추락 시 탑승인원 전원 쓰러짐 ");
		dr1.attack(ov);
		zg1.attack(dr1);
		ov.pickup(zg10);
		
		System.out.println("");
		System.out.println("\t  은신 유닛 스캔");
		ov1.observe();
		ghost.hide();
		//ghost1.hide();
		ov1.observe();
		
		sc.attack(ghost1);
		sc.attack(zg10);
		*/
	}
}
