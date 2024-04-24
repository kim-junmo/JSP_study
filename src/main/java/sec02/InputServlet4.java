package sec02;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/input4")
public class InputServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public InputServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// input4를 보면 name을 지칭하는 단어가 동일함. 이때 배열을 사용하여 데이터를 받아야 한다.
		//request.getParameter("subject"); 이렇게 받으면 안된다.
		
		//하나의 이름으로 선택된 여러개의 값을 받을 때 사용 getParameterValues
		String[] subjects = request.getParameterValues("subject");
		for(String str : subjects) {
			System.out.println("선택한 과목: " + str);
		}
	}

}
