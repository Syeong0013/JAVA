게시판

BOARDS 
	BOARDS_NUM	CHAR(4) 'B001'
	BOARDS_NAME	VARCHAR2(30)

	1.CREATE (NUM 자동생성)
	2.READ	 (모든 정보 검색기능)
	3.UPDATE (POST 정보도 UPDATE)
	4.DELETE (POST 정보도 DELETE)

POST
	POST_IDX 	NUMBER
	POST_TITLE	VARCHAR2(30)
	POST_CONTENT	VARCHAR2(200)
	POST_REGNUM	DATE
	USER_ID		CHAR(4) 'C001'
	BOARDS_NUM	CHAR(4)	'B001'

	1.CREATE (IDX 자동생성)
	2.READ	 (모든 정보 검색기능)
	3.UPDATE (REGNUM UPDATE)
	4.DELETE

USER
	USER_ID		CHAR(4)	'C001'
	USER_NAME	VARCHAR2(20)
	USER_PW		??

	1.CREATE (USER_ID 자동생성)
	2.READ
	3.UPDATE (USER_ID 수정불가) 
	4.DELETE (POST 삭제)
	
	join, getUserList, login, logout, updateUser, deleteUser, userSearch

// JDBC 기능
회원가입
public void join(){}

글쓰기
public void write(){}
	1. 로그인
	2. 게시판 선택
	3. 글 작성

글 수정 및 삭제
public void chkPost(){}


내가 쓴 글 조회
public void myPost(){}
