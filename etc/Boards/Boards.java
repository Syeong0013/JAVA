import java.util.ArrayList;

public class Boards {

	public ArrayList<Post> postList;
	public String boardsName;
	
	public Boards(String boardsName) {
		this.boardsName = boardsName;
		postList = new ArrayList<Post>();
	}
	
	// 행위 메소드
	public void addPost(Post post) {
		postList.add(post);
	}
	
	public void showPostList() {
		System.out.println("-----------------------------");
		System.out.println("\t" + boardsName + "글 목록");
		for(Post post : this.postList) {
			System.out.println(((Post)post).regnum + "번 글 \t");
			System.out.println("제목 \t " + ((Post)post).strTitle + "\t");
			System.out.println("글쓴이 \t " + (((Post)post).user).userName);
			System.out.println("내용 \t " + ((Post)post).content);
			System.out.println("-----------------------------");
		}
	}
	
	// 글 번호를 생성하는 메소드
	public int makeRegnum() {
		return this.postList.size() +1;
	}
}
