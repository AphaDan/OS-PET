package servlet;

import  java.io.IOException;
import  java.io.PrintWriter;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse; 



import pet.dao.PetDao;
import pet.model.Pet;

import java.sql.*;
import  java.util.ArrayList;
import  java.util.List;

@WebServlet("/find")
public class FindPet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		String owner=request.getParameter("owner");
		String isMember=request.getParameter("isMember");
		PetDao petDao = new PetDao();
		Pet pet=new Pet();
		List<Pet> listAll = petDao.findAll();
		List<Pet> res= new ArrayList<Pet>();
		for(Pet p:listAll){
			if(!owner.equals("")){
				if(!p.getOwner().equals(owner))
					continue;
			}
			if(!isMember.equals("")){
				if(!p.getIsMember().equals(isMember))
					continue;
			}
			res.add(p);
		}
		
		request.setAttribute("update", res); 
		request.getRequestDispatcher("find_pet_show.jsp").forward(request,response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		doGet(request, response);
	}
}
