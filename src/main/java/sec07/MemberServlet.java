package sec07;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/memberOk")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public MemberServlet() {
        super();
        
    }
    
    //get 요청방식 일때 호출되는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}
	
	//post 요청방식 일때 호출되는 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doHandle(request, response);
	}
	
	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//마임: 웹에서 주고 받는 데이터는 이게 어떠한 타입인지 모르기 때문에 마임을 넣어 웹에서 읽을 수 있게 됨.
		response.setContentType("text/html;charset=utf-8");
		
		//db연동기능 클래스
		MemberDAO dao = new MemberDAO();
		
		//출력스트림 - 네트워크를 이용한 스트림 작업
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("utf-8"); //한글깨짐방지
		
		//<input type="hidden" name="command" value="addMember"> 때문에 나옴
		String command = request.getParameter("command"); // addMember, delMember
		if(command != null && command.equals("addMember")) {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		MemberVO vo = new MemberVO();
		vo.setId(id);
		vo.setPwd(pwd);
		vo.setName(name);
		vo.setEmail(email);
		
		dao.insMember(vo);
		
		}else if(command != null && command.equals("delMember")) {
			
			String id = request.getParameter("id");
			
			dao.delMember(id);
		}
		
		//테이블의 모든 데이터 출력하기.
		List<MemberVO> list = dao.listMembers();
		
		//클라이언트에게 전송하는 작업
		out.print("<html><body>");
		
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td>삭제</td><tr>");
		
		for(int i=0; i<list.size(); i++) {
			MemberVO memVO = list.get(i);
			String id = memVO.getId();
			String pwd = memVO.getPwd();
			String name = memVO.getName();
			String email = memVO.getEmail();
			Date joinDate = memVO.getJoinDate();
			
			out.print("<tr><td>" + id + "</td><td>" + pwd + "</td><td>" + name + "</td><td>"
						+ email + "</td><td>" + joinDate + "</td><td>" + 
						"<a href ='/memberOk?command=delMember&id=" + id + "'>삭제</a></td><td>");
			
		}
		
		out.print("</table>");
		out.print("<a href='/sec07/MemberForm.html'>회원등록</a>");
		out.print("</body></html>");
	}

}
