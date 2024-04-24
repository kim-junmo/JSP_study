package sec02;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//get방식의 주소
//http://localhost:9090/input3?u_name=홍길동&u_id=hongcha&u_pw=hongcha&u_addr=서울시 노원구 이젠빌딩&u_tel=010-9999-9999&u_age=100
//QueryString(쿼리스트링) : u_name=홍길동&u_id=hongcha&u_pw=hongcha&u_addr=서울시 노원구 이젠빌딩&u_tel=010-9999-9999&u_age=100

@WebServlet("/input3")
public class InputServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InputServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	
	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}



	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get 방식은 한글 깨짐 방지 작업을 하지 않는다.
		//한글 깨짐 방지 작업
//		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("u_name");
		String id = request.getParameter("u_id");
		String pw = request.getParameter("u_pw");
		String addr = request.getParameter("u_addr");
		String tel = request.getParameter("u_tel");
		
		//나이를 숫자(정수)로 변환작업, 래퍼클래스, 아래 주소 참조 
		//https://velog.io/@doxxx93/Wrapper-Class%EB%9E%80
		//String age = request.getParameter("u_age");
		int age = Integer.parseInt(request.getParameter("u_age"));
		
		//출력작업
		System.out.println("이름은? " + name);
		System.out.println("아이디는? " + id);
		System.out.println("비밀번호는? " + pw);
		System.out.println("주소는? " + addr);
		System.out.println("전화번호는? " + tel);
		System.out.println("나이는? " + age);
	}

}
