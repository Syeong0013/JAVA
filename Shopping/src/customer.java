
public class customer {

	// 1. 객체 
	// 속성 - property, attribute 
	// 행위  -  method
	
	public String cID;
	public String cName;
	public int cAge;
	public String gender;
	
	// 2. 헹위
	public void buyProduct(String prodName, int price) {
		
		/* 32살인 홍길동이 prodName을 price에 구매한 정보를 화면에 출력 */
		String strResult = Integer.toString(cAge) + "인";
		strResult += cName + "씨가";
		strResult += prodName + "을";
		strResult += Integer.toString(price) + "에 구매했습니다.";
		
		System.out.println(strResult);
	
	}
	
	// 3. 더한다 
	public int getPlus(int start, int finish) {
		
		//1. for -- 개수 제한
		int result = 0;
		for(int i = start; i<finish; i++) {
			result += i;
		}
		return result;
		
		//2. while -- 개수 제한 없음
		/*
		int j = start;
		while(j <= finish) {
			j += 3;
		}
		*/
		/*
		int j = 1;
		while(true) {
			if(j == 1000) {
				break;
			}
		}
		
		int o = 1;
		do {
			result += o;
			o += 1;
		}while(o <= 100)
		;
		*/
	
	}
	
}
