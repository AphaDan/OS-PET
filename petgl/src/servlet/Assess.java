package servlet;
import  java.io.IOException;
import  java.io.PrintWriter;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
import  javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;

import pet.dao.DocDao;
import pet.dao.PetDao;
import pet.model.Doc;

@WebServlet("/assess")
public class Assess extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");//ÉèÖÃ×Ö·û±àÂë£¬±ÜÃâ³öÏÖÂÒÂë
		String id=request.getParameter("id");
		String assess=request.getParameter("assess");
		int a=Integer.valueOf(assess);
		PetDao petDao=new PetDao();
		int n=petDao.Assessment(id, a);
		if(n>0){
			request.getRequestDispatcher("success.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("error.jsp").forward(request,response);
		}
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException { 
		doGet(request, response);
	}
}
