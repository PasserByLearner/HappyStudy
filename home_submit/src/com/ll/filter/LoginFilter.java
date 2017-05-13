package com.ll.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/LoginFilter")
public class LoginFilter implements Filter {

	private FilterConfig config;
	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws IOException, ServletException {
			HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		HttpSession session = request.getSession();
		String url = request.getRequestURI();
		String contextPath = request.getContextPath();
		System.out.println("请求的URL为：" + url);
		System.out.println("请求的session为：" + session.getAttribute("name"));
		
		if(url.equals(contextPath + "/login2.jsp") || url.equals(contextPath + "/login") || url.equals(contextPath + "/Signin") 
				|| url.equals(contextPath + "/registered.jsp") || url.equals(contextPath + "/registered") || url.indexOf("/images")!=-1)
		{
		    arg2.doFilter(arg0, arg1);
		}
		else if(url.contains(".css") || url.contains(".js")){

		//如果发现是css或者js文件，直接放行
		arg2.doFilter(arg0, arg1);
		}else 
		{
		if("".equals(session.getAttribute("name")) || session.getAttribute("name") == null){
        response.sendRedirect(contextPath + "/login2.jsp");
		request.setAttribute("msg", "请先登录！");
		return;
		}else{
			arg2.doFilter(arg0, arg1);
		}
	}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
