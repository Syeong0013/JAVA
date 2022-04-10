import java.util.Scanner;

public class Post implements IPost{
	
	private User user;
	private int regnum;
	private String title;
	private String content;
	Scanner sc = new Scanner(System.in);
	
	public User getUser() {
		return this.user;
	}
	
	public int getRegnum() {
		return this.regnum;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	//생성자
	public Post() {
		
	}
	
	// 인터페이스 메서드 재정의
	@Override
	public void insert(User user, int regnum) {
		this.user = user;
		this.regnum = regnum;
		
		System.out.println(user.getUserName() + "님 안녕하세요 !");
		
		System.out.print("글 제목을 입력하세요. : ");
		this.title = sc.nextLine();
		
		System.out.print("글 내용을 입력하세요. : ");
		this.content = sc.nextLine();
		
	}
	
	@Override
	public void update() {
		
		System.out.print("수정하려는 글 제목을 입력하세요 : ");
		this.title = sc.nextLine();
		
		System.out.print("수정하려는 글 내용을 입력하세요 : ");
		this.content = sc.nextLine();
	}
	
	@Override
	public boolean chkPost(User user) {
		boolean chk = true;
		if(this.user != user) {			
			System.out.println("사용자와 글 작성자가 일치하지 않습니다.");
			chk = false;
		}
		return chk;
	}
	
}
