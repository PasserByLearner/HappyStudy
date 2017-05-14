package com.ll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ll.bean.Student;
import com.ll.service.ListService;

/**
 * Servlet implementation class TeacherLogin
 */
@WebServlet("/TeacherLogin")
public class Teacherlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Teacherlogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fileContent="";
		request.setCharacterEncoding("UTF-8");
		
		String username= request.getParameter("username");
		String password=request.getParameter("password");
	
		//System.out.println("servelt start");
		System.out.println(username + password);
		
		if(username.equals("admin")&&password.equals("admin"))
	   {
		fileContent="<result><flag>true</flag></result>";
		HttpSession session = request.getSession();  
		session.setAttribute("name","Mr.Wu");
		session.setAttribute("identity","Teacher");
		session.setAttribute("id", "2333333333");
		
		}else{
			fileContent= "<result><flag>false</flag></result>";
		}
		response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.write(fileContent);
        out.close();
		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
