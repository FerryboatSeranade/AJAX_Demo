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

		request.setCharacterEncoding("UTF-8");//�����������ΪUTF-8�ַ�
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		System.out.println("userName:"+userName+";password:"+password);
		
		if(userName.equals("ss")&&password.equals("123456")) {
			response.setContentType("text/html;charset=UTF-8");//��Ҫ���صĻ�������UTF-8���ַ�����......�Ľ���������������
			PrintWriter out =response.getWriter();
			out.println("��ϲ����½�ɹ�");
		}else {
			response.setContentType("text/html;charset=UTF-8");//��Ҫ���صĻ�������UTF-8���ַ�����......�Ľ���������������
			PrintWriter out =response.getWriter();
			out.println("���ź��������������");
		}

	}

}
