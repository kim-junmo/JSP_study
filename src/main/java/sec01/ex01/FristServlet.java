package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/FristServlet")
@WebServlet("/First") //메핑주소설정, 메핑주소는 브라우저에서 사용하며, FristServlet클래스 파일을 호출함.
public class FristServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public FristServlet() {
        super();
        
    }

	//서블릿 클래스 파일이 첫 로딩 되면서 init()메서드는 단 1번만 호출.
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init 메서드 호출");
	}

	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}

	//클라이언트에서 보내는 방식이 get요청이었을 때 호출되는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet 메서드 호출");
	}
	
	
	//클라이언트에서 보내는 방식이 post요청이었을 때 호출되는 메서드
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doPost 메서드 호출");
	}

}
