package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuguTest
 */
@WebServlet("/guguTest")
public class GuguTest extends HttpServlet {
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

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		//integer로 입력받은 문자열 숫자값을 int형으로 바꿔주자
		int dan = Integer.parseInt(request.getParameter("dan"));
		
		out.print("<table border='1' width='800' align='center'>");
		out.print("<tr align='center' bgcolor='#FFFF66'>");
		out.print("<td colspan='4'>" + dan + "단 출력 </td>");
		out.print("</tr>");
		
		//tr태그에 배경색을 교대로 출력하는 작업 실행
		for(int i = 1; i < 10; i++) {
			if(i % 2 == 0) {		//짝수일때
				out.print("<tr align='center' bgcolor='#ACFA58'>");
			} else {				//홀수일때
				out.print("<tr align='center' bgcolor='#81BEF7'>");
			}
			
			out.print("<td width='200' >");
			out.print("<input type='radio' />" + i);
			out.print("</td>");
			out.print("<td width='200'>");
			out.print("<input type='checkbox' />" + i);
			out.print("</td>");
			out.print("<td width='400'>");
			out.print(dan + " * " + i);
			out.print("</td>");
			out.print("<td width='400'>");
			out.print(i * dan);
			out.print("</td></tr>");
		}
		
		out.print("</table>");
		
		//yes24처럼 책을 체크할 수 있는 그런 모양의 웹어플리케이션이 만들어 졌다.
	}

}

























