package servlet;
import  java.io.IOException;
import  java.io.PrintWriter;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse;

import pet.dao.DocDao;

import pet.model.Doc;

import java.sql.*;
import  java.util.ArrayList;
import  java.util.List;

@WebServlet("/FindP")
public class FindP extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");
		String phone=request.getParameter("phone");
		DocDao docdao = new DocDao();
		List<Doc> res=docdao.findAll();
		String passw="";
		System.out.println(res.isEmpty());
		System.out.println("phone:"+phone);
		for(Doc doc:res){
			//System.out.println(doc.getPhone().equals(phone));
			if(phone.equals(doc.getPhone())){
				passw=doc.getPassword();
				System.out.println("ур╣╫ак:"+passw);
			}
		}
		
		request.setAttribute("findpassword", passw); 
		request.getRequestDispatcher("forget_passw_show.jsp").forward(request,response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		doGet(request, response);
	}
}
