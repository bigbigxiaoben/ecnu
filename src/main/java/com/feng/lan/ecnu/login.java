package com.feng.lan.ecnu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import com.feng.lan.dao.IUserInfoDao;
import com.feng.lan.entities.vo.UserInfo;

public class login extends HttpServlet{

	private static final long serialVersionUID = 1l;
	
	private IUserInfoDao userInfo;
	public login(){
		super();
	}
	@Override
	public void doGet(HttpServletRequest request,HttpServletResponse response)
		throws ServletException,IOException{
//		ModelAndView mav = new ModelAndView("/index.jsp");
		String userName = request.getParameter("username");//取得用户名
		String password = request.getParameter("password");//取得密码
		UserInfo user = userInfo.getUserInfo(userName, password);
		if(user !=null){
			response.sendRedirect("/views/welcome.jsp?userName="+userName+"&password="+password);
		}else{
			response.sendRedirect("/view/error.jsp");
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      doGet(request,response);
	}
	
}
