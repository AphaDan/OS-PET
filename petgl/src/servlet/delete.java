package servlet;

import java.io.IOException; 
import java.util.ArrayList; 
import java.util.List;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import  javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;

import pet.dao.PetDao;
import pet.model.Pet;

@WebServlet("/delete")
public class delete extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");
		String id=request.getParameter("id");
		String type=request.getParameter("type");
		int n=0;
		PetDao petDao=new PetDao();
		try {
			Pet pet=petDao.find(id);
			n = petDao.remove(pet);
			if(n>=1){
				request.getRequestDispatcher("success.jsp").forward(request, response);
				
				
			}else{
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doGet(request, response);
	}
}
