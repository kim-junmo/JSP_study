package sec09.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sec09Ex01LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String user_id = request.getParameter("user_id"); //admin
		String user_pw = request.getParameter("user_pw"); //1234
		
		//hidden필드의 값을 여기서 확인한다.
		String user_address = request.getParameter("user_address");
		String user_email = request.getParameter("user_email");
		String user_hp = request.getParameter("user_hp");
		
		//db를 이용하여 아이디 및 비밀번호 존재여부 체크작업
				
		// 사용자가 입력한 로그인 정보가 (아이디 : admin, 비밀번호 : 1234일 경우)
		//맞으면 아래 if문은 true, 틀리면 false가 된다.
		//스프링의 문자열에서는 == 대신 equals를 사용한다.
		
		if(user_id.equals("admin") && user_pw.equals("1234")) {
			
			//인증된 사용자로 처리작업을 하는 것을 session객체라고 한다.
			//session 객체를 이용하여 인증된 사용자로 처리 작업을 진행한다.
			
			//브라우저에게 발급해준 JESSIONID의 식별자 값을 활성화된 서버측 메모리에 "auth"키 이름으로 user_id변수의 값을 저장.
			request.getSession().setAttribute("auth", user_id);
			
			response.sendRedirect("/sec09/main.jsp");
		}else {
			
			//인증이 실패한 사용자는 다시 로그인페이지로 돌아가게 한다.
			//이 방법이 총 3가지가 있다. 8장에 ex1~3까지
			
			//클라이언트로 사용하는 브라우저에 아래 정보가 전송된다.
			
			//브라우저로 보내는 한글 데이터 인코딩과 콘텐트에 mime type작업
			response.setContentType("text/html;charset=utf-8");
			
			//브라우저로 전송된다.
			PrintWriter out = response.getWriter();
			out.print("<script type ='text/javascript'>");
			out.print("alert('로그인 정보가 틀렸습니다. 다시 확인해주세요.');");
			out.print("location.href='/sec09/login.jsp';");
			out.print("</script>");
		}
	}

}
