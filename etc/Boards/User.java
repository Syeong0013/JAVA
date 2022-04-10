
public class User {

	public String userName;
	public String userId;
	
	public User() {
		
	}
	
	public User(String userName, String userId) {
		this.userName = userName;
		this.userId = userId;
	}
	
	
	// 글을 작성하는 행위 메소드 
	public void write(User user, Post post, Boards postList) {
		
		post.insert(user, postList.makeRegnum());
		
		postList.addPost(post);
		postList.showPostList();
		
	}
}
