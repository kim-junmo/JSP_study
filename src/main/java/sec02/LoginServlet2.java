package sec02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//get방식과 post방식 요청 동시에 처리하기.

@WebServlet("/loginmethod")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	//클라이언트에서 get요청일 경우 호출되는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doget 메서드 호출");
		doHandle(request, response);
	}

	//클라이언트에서 post요청일 경우 호출되는 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("dopost 메서드 호출");
		doHandle(request, response);
	}
	
	//공통메서드 만들기, get방식 또는 post방식 둘다 호출되기위한 목적
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("dohandle 메서드 호출");
		
		String U_id = request.getParameter("U_id");
		String U_pw = request.getParameter("U_pw");
		
		//db연동작업 : 아이디와 비밀번호가 일치하는지 여부를 체크
		
		System.out.println("아이디: " + U_id);
		System.out.println("비밀번호: " + U_pw);
		
	}
	

}
