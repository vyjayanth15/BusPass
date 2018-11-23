package org.cap.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.cap.bean.LoginBean;
import org.cap.service.ILoginService;
import org.cap.service.LoginServiceImpl;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String userName=request.getParameter("userName");
		String userPwd=request.getParameter("userPwd");  
		LoginBean loginBean=new LoginBean(userName,userPwd);
		ILoginService loginservice=new LoginServiceImpl();
		
		if(loginservice.isValidLogin(loginBean)) {
			response.sendRedirect("pages/menu.html");
		}else {		
			PrintWriter pw=response.getWriter();
			pw.println("<h1>Enter valid username and password</h1>");
			pw.println(userName+" "+userPwd);
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
		}
	}
}
