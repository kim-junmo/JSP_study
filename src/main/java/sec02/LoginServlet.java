package sec02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    //HttpServletRequest request(request 객체) : 클라이언트의 요청을 담당, 예로 사용자가 입력한 데이터
    //HttpServletResponse response(response 객체) : 서버에서 클라이언트로 정보를 보낼때 응답기능을 관리함
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//서블릿에서 Html Code 작업하기
		
		//브라우저에게 보내는 데이터가 mime-type : text/html 형식이고, utf-8인코딩으로 해석
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		
		String U_id = request.getParameter("U_id");
		String U_pw = request.getParameter("U_pw");
				
		String date = "<html>";
		date += "<body>";
		
		date += "아이디 " + U_id;
		date += "비밀번호 " + U_pw;
		
		date += "</body>";
		date += "</html>";
		
		out.print(date);
		
	}

}
