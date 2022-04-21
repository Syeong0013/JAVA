import java.util.*;

public class Exec {

	public static void main(String[] args) {

		// 1. 중복으로 멤버가 등록이 되는가
		Vector<String> vector = new Vector<String>();
		
		vector.add("홍길동");
		vector.add("홍길동");
		vector.add("전우치");
		
		System.out.println(vector.size());
		
		// for each
		for(String strName : vector) {
			System.out.println(strName);
		}
		
		// 2.LinkedList
		LinkedList<String> lk = new LinkedList<String>();
		lk.add("홍길동");
		lk.add("전우치");
		lk.add("전우치");
		
		System.out.println(lk.size());
		
		// for each
		for(String strName : lk) {
			System.out.println(strName);
		}
				
		// 3.stack
		Stack<String> st = new Stack<String>();
		st.add("홍길동");
		st.add("전우치");
		st.add("홍길동");
		
		System.out.println(st.size());
		
		// for each
		for(String strName : st) {
			System.out.println(strName);
		}
		
		// 4.ArrayList
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("홍길동");
		arr.add("전우치");
		arr.add("전우치");
		System.out.println(arr.size());
		
		// for each
		for(String strName : arr) {
			System.out.println(strName);
		}
		
		
		// 순서
		Car car1 = new Car("소타나", "현대");
		Car car2 = new Car("그랜져", "기아");
		Car car3 = new Car("k5", "삼성");
		Car car4 = new Car("소나타", "현대");
		
		LinkedList<Car> lk1 = new LinkedList<Car>();
		lk1.add(car1);
		lk1.add(car2);
		lk1.add(car3);
		
		boolean isResult = lk1.contains(car4);
		// car1과 car4가 같은 필드를 가지더라도 다른 객체로 인지
		System.out.println(isResult);
		
	}

}
