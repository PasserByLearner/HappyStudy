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

import com.ll.bean.Student;
import com.ll.service.ListService;
import com.ll.service.maintenanceservice;

/**
 * Servlet implementation class insertoneservelt
 */
@WebServlet("/insertoneservelt")
public class insertoneservelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public insertoneservelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		Student s = new Student();
		String student_id = request.getParameter("student_id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String classname= request.getParameter("classname");
		String sex = request.getParameter("sex");
		s.setStudent_Id(student_id);
		s.setName(name);
		s.setPassword(password);
		s.setSex(sex);
		s.setStudent_Class(classname);
		maintenanceservice service = new maintenanceservice();
		List<Student> list = new ArrayList<>();
		boolean t = service.studentregister(s);
		String fileContent="";
		if(!t){fileContent= "<result><flag>false</flag></result>";}
		else{fileContent="<result><flag>true</flag></result>";
		request.getSession().setAttribute("student", s);}
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
