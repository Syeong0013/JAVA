package conditional.while_state;

public class exec {

	public static void main(String[] args) {
		
		int numCount = 0;
		while(numCount < 5) {
			numCount++;
			System.out.println(numCount);
			if(numCount == 5) {
				System.out.println("종료합니다.");
			}
		}

	}

}
