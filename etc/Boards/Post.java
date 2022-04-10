import java.util.*;

public class Post {
	
	public User user;
	public int regnum;
	public String strTitle;
	public String content;
		
	public Post() {}
		
	public Post(int regnum, String strTitle, String content) {
		this.regnum = regnum;
		this.strTitle = strTitle;
		this.content = content;
	}
		
		
	// 행위 메소드 
	public void insert(User user, int regnum) {		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("글 번호를 입력하시오. ");
		this.regnum = sc.nextInt();
		// 개행문자 삭제 
		sc.nextLine();
		*/
		
		//글 번호 자동 생성 기능
		this.regnum = regnum;
		
		System.out.println("글 제목을 입력하시오. ");
		this.strTitle = sc.nextLine();
			
		System.out.println("글 내용을 입력하시오. ");
		this.content = sc.nextLine();
			
		this.user = user;
	}
}

