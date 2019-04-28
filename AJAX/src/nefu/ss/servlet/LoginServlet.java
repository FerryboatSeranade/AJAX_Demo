package nefu.ss.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("hello,i'm doPost");

		request.setCharacterEncoding("UTF-8");//将机器码解码为UTF-8字符
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		System.out.println("userName:"+userName+";password:"+password);
		
		if(userName.equals("ss")&&password.equals("123456")) {
			response.setContentType("text/html;charset=UTF-8");//将要返回的机器码以UTF-8的字符集和......的解释器返还给请求方
			PrintWriter out =response.getWriter();
			out.println("恭喜您登陆成功");
		}else {
			response.setContentType("text/html;charset=UTF-8");//将要返回的机器码以UTF-8的字符集和......的解释器返还给请求方
			PrintWriter out =response.getWriter();
			out.println("很遗憾，您密码输错了");
		}

	}

}
