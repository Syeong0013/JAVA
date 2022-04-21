import java.util.*;

public class Exec {

	public static void main(String[] args) {
	
		// HashSet
		HashSet<String> hashset = new HashSet<String>();
		
		// set 인터페이스를 상속받음
		hashset.add("홍길동");
		hashset.add("전우치");
		hashset.add("전우치");
		
		System.out.println(hashset);
		// 중복값을 허용하지 않음

		for(String a : hashset) {
			System.out.println(a);
		}
		
		
		Car car1 = new Car("쏘나타","현대");
		Car car2 = new Car("쏘나타","현대");
		Car car3 = car1;
		
		HashSet<Car> hashCar = new HashSet<Car>();
		hashCar.add(car1);
		hashCar.add(car2);
		hashCar.add(car3);
		System.out.println(hashCar);
		for(Car a : hashCar) {
			System.out.println(a.name + a.brand);
		}
		
		
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("김");
		treeset.add("하");
		treeset.add("최");
		treeset.add("최");
		
		System.out.println(treeset);
		// 중복 비허용, 순서와 상관없이 졸트를 사용
		
		TreeSet<Car> treecar = new TreeSet<Car>();
		treecar.add(car1);
		treecar.add(car2);
		treecar.add(car3);
		
		System.out.println(treecar);
		
		
		// Map -- 1. Hashtable, HashMap
		Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
				// key, value pair
		// 11. 홍길동
		// 24. 전우치 
		// 36. 박도수
		hashtable.put(11, "홍길동");
		hashtable.put(24, "전우치");
		hashtable.put(36, "박도수");
		
		String strName = hashtable.get(24);
		// hashtable.get(key)
		System.out.println(strName);
		
		// hashmap을 이용한 주차장예제
		HashMap<String, Car> parks = new HashMap<String, Car>();
		
		Car car11 = new Car("소나타", "현대");
		Car car21 = new Car("k5", "기아");
		Car car31 = new Car("소나타", "현대");
		Car car4 = new Car("쏘렌토", "기아");
		Car car5 = new Car("쏘렌토", "기아");
		
		parks.put("A-10", car11);
		parks.put("B-12", car21);
		parks.put("A-43", car31);
		parks.put("B-01", car4);
		
		// hashMap에 해당 객체가 존재하지는 검사 > containsValue
		if(parks.containsValue(car5)) {
			Car parkCar = parks.get("A-10");
			System.out.println(car5.name);
			System.out.println(car5.brand);
		}
		else {
			System.out.println("없다");
		}
		///////////////////////////////////////////////////////////////
		List<String> arrList = new ArrayList<String>();
		List<String> vector = new Vector<String>();
		
		arrList.add("안녕");
		arrList.add("잘가");
		vector.add("순서키1");
		
		Map<String, Car> hashTable = new Hashtable<String, Car>();
		Map<String, Car> hashMap = new HashMap<String, Car>();
		
		// HashMap <key = String, value pair = List<String>>
		Map<String, List<String>> boardLists = new HashMap<String, List<String>>();
		boardLists.put("board1",arrList);
		boardLists.put("board2", vector);
		System.out.println(boardLists);	//{board2=[순서키1], board1=[안녕, 잘가]}
		System.out.println(boardLists.get("board1"));	//[안녕, 잘가]
		
		Map<Integer, Map<String, Car>> partList = new HashMap<Integer, Map<String, Car>>();
		partList.put(1, parks);
		
		Car car111 = new Car("쏘나타","현대");
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add("Dgdad");
		arr.add(car111);
		
		for(Object o: arr) {
			if(o instanceof Integer) {
				System.out.println((Integer)o);			
			}
			if(o instanceof String) {
				System.out.println((String)o);
			}
			if(o instanceof Car) {
				System.out.println((Car)o);
			}
		}
		
		System.out.println(partList);
	}

}
