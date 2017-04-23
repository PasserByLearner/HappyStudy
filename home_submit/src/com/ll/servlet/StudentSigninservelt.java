package com.ll.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.ll.bean.Student;
import com.ll.service.ListService;

/**
 * Servlet implementation class StudentSigninservelt
 */
@WebServlet("/StudentSigninservelt")
public class StudentSigninservelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentSigninservelt() {
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
		ListService service = new ListService();
		
		String username= request.getParameter("username");
		String password=request.getParameter("password");
	
		//System.out.println("servelt start");
		List<Student> list  = service.studentsignin(request.getParameter("username"),request.getParameter("password"));
		
		if(list.isEmpty()){fileContent= "<result><flag>false</flag></result>";}
		else{fileContent="<result><flag>true</flag></result>";
		request.getSession().setAttribute("student", list.get(0));}
		//String fileContent="<result><flag>true</flag></result>";
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
