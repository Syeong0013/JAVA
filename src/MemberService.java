
public class MemberService {
	
	
	public void login(String id, String pw) {
		if(id.equals("hong") && pw.equals("1234")) {
			System.out.println("�α��εǾ����ϴ�.");
		}
		else {
			System.out.println("�α��ο� �����߽��ϴ�.");
		}
	}
	
	public void logout(String id) {
		System.out.println("�α׾ƿ��Ǿ����ϴ�.");
	}
}
