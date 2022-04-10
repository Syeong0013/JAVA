import java.util.ArrayList;
import java.util.Scanner;

public class Boards {

	private ArrayList<IPost> boardList;
	private String boardsName;
	
	public Boards(String boardsName) {
		this.boardsName = boardsName;
		boardList = new ArrayList<IPost>();
	}
	// 글 번호를 자동 생성
	public int makeRegnum() {
		return boardList.size() +1;
	}
	
	public void insert(Post post) {
		boardList.add(post);
	}
	
	public void showList() {
		System.out.println("\t" + boardsName);
		System.out.println("--------------------------");
		for(IPost post : this.boardList) {
			
			System.out.print("글 번호 \t" +((Post)post).getRegnum());
			System.out.println("\t 글쓴이 \t" +(((Post)post).getUser()).getUserName());
			System.out.println("글 제목 \t" +((Post)post).getTitle());
			System.out.println("글 내용 \t" +((Post)post).getContent());
			System.out.println("");
		}
		
	}
	
	public void myList(User user) {
		System.out.println("");
		System.out.println("\t" + boardsName);
		System.out.println(user.getUserName() + "님의 글 목록입니다.");
		for(IPost post : this.boardList) {
			if(((Post)post).getUser() == user) {
				System.out.print("글 번호 \t" +((Post)post).getRegnum());
				System.out.println("\t 글쓴이 \t" +(((Post)post).getUser()).getUserName());
				System.out.println("글 제목 \t" +((Post)post).getTitle());
				System.out.println("글 내용 \t" +((Post)post).getContent());
				System.out.println("");
			}
		}
	}
	
	public void upList(User user) {
		int selNum;
		System.out.print("수정하려는 글 번호를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
		selNum = sc.nextInt();
		
		if((boardList.get(selNum-1)).chkPost(user)) {
			boardList.get(selNum-1).update();
		}
		
	}
	
	public void delList(User user) {
		int selNum;
		System.out.print("삭제하려는 글 번호를 입력하시오. : ");
		Scanner sc = new Scanner(System.in);
		selNum = sc.nextInt();
		if((boardList.get(selNum-1)).chkPost(user)) {
			boardList.remove(selNum-1);
		}
	}
	
}
