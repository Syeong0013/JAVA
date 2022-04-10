
public class User {
	
	private String userName;
	private String userId;
	
	public String getUserName() {
		return this.userName;
	}
	
	//생성자
	public User() {
		
	}
	
	public User(String userName, String userId) {
		this.userName = userName;
		this.userId = userId;
	}
	
	// 글을 쓰는 행위 메소드 
	public void userWrite(Post post, Boards boards) {
		post.insert(this, boards.makeRegnum());
		boards.insert(post);
	}
	
	// 글을 수정하는 행위 메소드 
	public void userUpdate(Boards boards) {
		boards.myList(this);
		boards.upList(this);
	}
	
	// 글을 삭제하는 행위 메소드
	public void userDelete(Boards boards) {
		boards.myList(this);
		boards.delList(this);
	}
	
}
