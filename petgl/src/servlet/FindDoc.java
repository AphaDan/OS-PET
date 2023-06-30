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

@WebServlet("/Finddoc")
public class FindDoc extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		DocDao docdao = new DocDao();
		List<Doc> res= docdao.findDocs(name, sex);
		request.setAttribute("update", res); 
		request.getRequestDispatcher("findAndEdit_doc_show.jsp").forward(request,response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		doGet(request, response);
	}
}
