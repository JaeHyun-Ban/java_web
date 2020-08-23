package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet5
 */
@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	//로그인용이니 아이디하고 비밀번호가 보이면 안되니까 POST로 생성해준다
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("user_id");
		String pwd = request.getParameter("user_pw");
		String address = request.getParameter("user_address");
		System.out.println("아이디: " + id);
		System.out.println("비밀번호: " + pwd);
		
		String data = "<html>";
		data += "<body>";
		data += "아이디: " + id;
		data += "<br>";
		data += "비밀번호: " + pwd;
		data += "<br>";
		data += "주소: " + address;
		data += " </body>";
		data += "</html>";
		out.print(data);//입력 해준 데이터들을 출력해 준다.
		
		
	}

}




























