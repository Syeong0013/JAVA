### 제목 무엇으로 할까나~~~

---

- JAVA 와 ORACLESQL을 연결하기 위한 절차
    1. ORACLE CONNECTION LOADING
    2. SQL 쿼리문 또는 PROCEDURE 호출문 생성
    3. 2번을 담을 그릇 생성
    4. 실행

## 0. DBHandle.java 생성

```java
public class DBHandle(){
	private String dbID;    // DB 접속 아이디
	private String dbPW;    // DB 접속 비밀번호
	private String dbUrl;   // DB 접속 주소
	
	// 생성자
	public DBHandle(Stirng dbID, String dbPW, String dbUrl){
		this.dbID = dbID;
		this.dbPW = dbPW;
		this.dbUrl = dbUrl;
	}
}
```

## 1. ORACLE CONNECTION LOADING

```java
private Connection getConnection(){
	// 아래 코드를 try 안에 넣으면 로컬변수가 되어 return 문으로 반환할 수 없음
	Connection dbConn = null;

	try{
		Class.forName("Oracle.jdbc.driver.OracleDriver");
		dbConn = DriverManager.getConnection(this.dbUrl, this.dbID, this.dbPW);
	} catch(Exception e){
		System.out.println(e.getMessage());
	}

	return dbConn;
}
```

## 2.1 SQL 쿼리문 생성

```java
private PreparedStatement getPreparedStatement(String strSql, String[] strParams){
	PreparedStatement psmt = null;

	try{
		Connection dbConn = getConnection();
		psmt = dbConn.prepareStatement(strSql);
		
		for(int i = 0; i < strParams.length; i++){
			psmt.setString(i+1, strParams[i]);
		}
	} catch(Exception e){
		System.out.println(e.getMessage());
	}
	
	return psmt;
}
```

## 2.2 PROCEDURE 호출문 생성

```java
private CallableStatement getCallableStatement(String strProc, String[] strParams){
	CallableStatement csmt = null;

	try{
		Connection dbConn = getConnection();
		csmt = dbConn.prepareCall(StrProc);
		
		for(int i = 0; i < strParams.length; i++){
			csmt.setString(i+1, strParams[i]);
		}
	} catch(Exception e){
		System.out.println(e.getMessage());
	}

	return csmt;
}
```

## 3. 실행부에서 호출할 메소드

```java
public void dbHandle(String str, String[] strParams, SQLQuery queryType){
	try{
		// 실행할 실행문이 쿼리문인지 프로시저인지 판단 
		if(queryType == SQLQuery.inline){
			PreparedStatement psmt = getPreparedStatement(str, strParams);
			psmt.executeUpdate();
		}
		else{
			CallableStatement csmt = getCallableStatement(str, strParams);
			csmt.executeUpdate();
		}
	} catch(Exception e){
		System.out.println(e.getMessage());
	}
}
```

```java
public enum SQLQueryType {
	procedure, inline
}
```

열거형으로 실행할 SQL이 쿼리문인지 프로시저인지 확인하기 위해서 SQL QUERY TYPE을 필드로 선언한다.

INLINE QUERY 문이면 getPreparedStatement method가 실행되고

PROCEDURE 이면 getCallableStatement method가 실행되도록 한다.

## 4. 실행부

```java
public void Exec {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String[] strParams = new String[2];
		System.out.println("글 제목을 입력하시오.");
		strParams[0] = sc.nextLine();
		System.out.println("글쓴이를 입력하시오.");
		strParams[1] = sc.nextLine();

		// INLINE QUERY 
		String strSql = "INSERT INTO BOARDS(TITLE, WRITER) VALUES(?,?)";

		// PROCEDURE
		String strProc = "{call PKG_BOARDS.PROC_INS_BOARDS(?,?)}";

		DBHandle db = new DBHandel("DB 접속 아이디", "DB 접속 암호", "DB 접속 주소");
		
		// inline query 
		db.dbHandle(strSql, strParams, SQLQueryType.inline);
		
		// procedure
		db.dbHandel(strProc, strParams, SQLQueryType.procedure);

	}
}
```
