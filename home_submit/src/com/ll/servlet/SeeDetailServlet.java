package com.ll.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ll.bean.HomeWork;
import com.ll.service.WorkListService;

/**
 * Servlet implementation class SeeDetailServlet
 */
@WebServlet("/SeeDetailServlet")
public class SeeDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		String homework_id = request.getParameter("id");
		WorkListService service = new WorkListService();
		List<HomeWork> list = new ArrayList<>();
		list = service.queryHomeworkList(homework_id);
		request.setAttribute("homework", list.get(0));
		request.getRequestDispatcher("/WEB-INF/jsp/seeHomework.jsp").forward(request,response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
