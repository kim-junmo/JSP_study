package sec07;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//데이터 베이스 연동 기능, (db 연결하고 동작(SQL문을 실행))
//JDK안에 JDBC기능 라이브러리가 있음, JDBC를 학습
//Java 기반 애플리케이션의 데이터를 데이터베이스에 저장 및 업데이트하거나, 
//데이터베이스에 저장된 데이터를 Java에서 사용할 수 있도록 하는 자바 API이다.
public class MemberDAO {

	
	private Connection conn; //데이터베이스 연결
	private PreparedStatement pstmt; //연결상태에서 SQL문 실행 목적
	//private ResultSet rs; //Sql문중 Select문 실행 시 출력되는 결과를 저장하는 목적 
	
//	private String url = "오라클 서버 호스트 이름"; //jdbc url
//	private String uid = "계정";
//	private String pw = "비밀번호";
	
	//오라클 데이터베이스 연결정보
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "jspuser";
	private String pw = "jspuser";
	
	//생성자 
	public MemberDAO() {

	}
	
	public Connection getConnection() throws SQLException {
		if(conn == null || conn.isClosed()) {
			try {
				//메모리상에 driverManager라는 객체가 로딩이 된다.
				//Oracle.jdbc.OracleDriver" 오라클에서 제공해주는 JDBC드라이버에서 참조한다. 
				Class.forName("oracle.jdbc.OracleDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//conn이라는 객체가 생성된다. (데이터베이스가 연결상태)
			//conn객체가 생성시 오류가 나면 url, uid, pw이런 파라미터 값이 문제일 수도 있다.
			conn = DriverManager.getConnection(url, uid, pw);
		}
		
		return conn;
		
	}
	
	//기능
	
	//회원가입(insert)
	public void insMember(MemberVO vo) {
		try {
			
			//1)connection 객체생성 
			conn = getConnection(); //open
			
			//2)쿼리 준비 단계
			String id = vo.getId();
			String pwd = vo.getPwd();
			String name = vo.getName();
			String email = vo.getEmail();
			
			String sql = "insert into t_member(id, pwd, name, email)";
			sql += " values(?, ?, ?, ?)";
			
			//sql 변수안에 ?(placeholder)에 값을 대입한 insert문이 완성이 된다.
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
						
			//3) 쿼리 실행단계
			//sql변수의 insert문을 오라클 데이터베이스 서버에게 실행 요청한다.
			pstmt.executeLargeUpdate(); // sql문이 insert, delete, update에 사용할 메서드
						
			//4)연결 닫기
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//회원삭제(delete)
	public void delMember(String id) {
		try {
			conn = getConnection();
			
			String sql = "delete from t_member " + " where id =?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
	//회원목록(select)
	public List<MemberVO> listMembers() {
		//회원테이블의 모든 데이터를 저장 list컬렉션 객체에 저장
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {	
	
		//1)connection 객체생성 
		conn = getConnection(); //open
		
		//2)
		String sql = "select * from t_member";
		pstmt = conn.prepareStatement(sql);
		
		//rs가 오라클 T_MEMBER 데이터행의 해더를 가리킴.
		//데이터 존재유무를 떠나서 rs객체가 생성이 되면, 커서라는 것이 존재한다.
		//커서의 현재위치는 제목행 (헤더)라는 곳을 가리킨다.
		
		//ResultSet rs는 위에서 사용할 수도 있지만 (위에서 사용하는 것을 전역변수)
		//회원 목록을 보여주는 것만 사용을 하기 때문에 성능을 위해 여기에서 사용함(지역변수)
		
		ResultSet rs  = pstmt.executeQuery(); //sql문이 select일 경우 사용
				
		//rs.next() : 커서를 다음 위치로 이동하면서, 데이터가 존재하면 true, 존재하지 않으면 false
		while(rs.next()) {
			
			//rs 객체로 데이터를 읽어옴
			String id = rs.getString("id");
			String pwd = rs.getString("pwd");
			String name = rs.getString("name");
			String email = rs.getString("email");
			Date joinDate = rs.getDate("joinDate");
			
			MemberVO vo = new MemberVO();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setEmail(email);
			vo.setJoinDate(rs.getDate("joinDate"));
			
			list.add(vo);
		}
		
		rs.close();
		pstmt.close();
		conn.close();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} //open
		
		return list;
	}
}
