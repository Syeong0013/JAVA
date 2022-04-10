
public class Exec {
	public static void main(String[] args) {
		
		User user1 = new User("홍길동","u001");
		User user2 = new User("전우치","u002");
		
		Post post1 = new Post();
		Post post2 = new Post();
		Post post3 = new Post();
		Post post4 = new Post();
		
		
		Boards board1 = new Boards("자유게시판");
		Boards board2 = new Boards("비밀게시판");
		
		user1.userWrite(post2, board1);
		//user1.userWrite(user1, post1, board1);
		user2.userWrite(post3, board1);
		//user2.userWrite(user2, post4, board2);
		
		user2.userUpdate(board1);
		
		//user2.userWrite(user2, post3, board1);
		//user2.userWrite(user2, post4, board2);
		
		//board1.showList();
		//board2.showList();
		
		
		//user1.userDelete(board1);
		
		
		//board1.showList();
		
	}
}
