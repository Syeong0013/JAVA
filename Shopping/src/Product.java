
public class Product {

	public String prodName;
	public int prodPrice;
	public int enableAge; //나이제한
	
	// 행위 : 나이에 따라 살 수 있는 지 확인하는 절차필요
	public void checkAge(int buyCus_Age) {
		String result = "";
		if(buyCus_Age >= enableAge) {
			result = "구매가능";
		}
		else {
			result = "구매 불가능";			
		}
		System.out.print(result);
	}
	
}
