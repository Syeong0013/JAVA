
public class MemberService {
	
	
	public void login(String id, String pw) {
		if(id.equals("hong") && pw.equals("1234")) {
			System.out.println("로그인되었습니다.");
		}
		else {
			System.out.println("로그인에 실패했습니다.");
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃되었습니다.");
	}
}
