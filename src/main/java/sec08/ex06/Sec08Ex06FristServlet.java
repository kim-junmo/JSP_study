package sec08.ex06;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Sec08Ex06FristServlet")
public class Sec08Ex06FristServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public Sec08Ex06FristServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8"); //한글깨짐방지
		
		response.setContentType("text/html;charset=utf-8");
		
		//request객체 : 클라이언트에서 보내온 모든 정보를 관리하는 객체.
		/*
		 - 사용자가 입력한 데이터
		 - 클라이언트의 브라우저 종류, 버전, IP 등
		 */
		// request객체에 정보를 추가작업
		request.setAttribute("address", "서울시 노원구 이젠빌딩");
		
		//서버내에서 주소가 이동이 된 경우는 현재 요청에 연장된 의미로 처리가 된다.
		RequestDispatcher dispatch = request.getRequestDispatcher("/Sec08Ex06SecondServlet");
		dispatch.forward(request, response);




	}

}
