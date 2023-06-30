package servlet;
import  java.io.IOException;
import  java.io.PrintWriter;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse;

import pet.dao.DocDao;
import pet.dao.PetDao;
import pet.model.Doc;
import pet.model.Pet;

import java.sql.*;
import  java.util.ArrayList;
import  java.util.List;

@WebServlet("/FindAssess")
public class FindAssess extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");
		String name=request.getParameter("name");
		PetDao petDao=new PetDao();
		List<Pet> list = petDao.findAll();
		DocDao docDao=new DocDao();
		double a=0;
		String id="";
		List<Doc> list2=docDao.findAll();
		for(Doc d:list2){
			if(d.getName().equals(name)){
				id=d.getId();
			}
		}
		a=docDao.FindAssessment(id);
		request.setAttribute("findAssessment", a); 
		request.setAttribute("name0",name);
		request.getRequestDispatcher("find_assess_show.jsp").forward(request,response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		doGet(request, response);
	}
}
