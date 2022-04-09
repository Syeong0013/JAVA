
public class Exec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user1 = new User("홍길동", "u001");
		User user2 = new User("전우치", "u002");
		
		Post post1 = new Post();
		Post post2 = new Post();
		Post post3 = new Post();
		Post post4 = new Post();
		
		Boards board = new Boards("자유게시판");
		Boards board1 = new Boards("비밀게시판");
		
		user1.write(user1, post1, board);
		user1.write(user1, post2, board);
		
		user2.write(user2, post3, board);
		user2.write(user2, post4, board1);
	}

}
