package servlet;

import  java.io.IOException;
import  java.io.PrintWriter;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
import  javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;

import pet.dao.PetDao;
import pet.model.Pet;

@WebServlet("/insert")
public class InsertPet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");//ÉèÖÃ×Ö·û±àÂë£¬±ÜÃâ³öÏÖÂÒÂë
		String id=request.getParameter("id");
		String type=request.getParameter("type");
		String owner=request.getParameter("owner"); 
		String cases=request.getParameter("case");
		String isMember=request.getParameter("isMember");
		String docid=request.getParameter("doc");
		
		Pet pet=new Pet();
		PetDao petDao=new PetDao();
		pet.setId(id);
		pet.setType(type);
		pet.setOwner(owner);
		pet.setCases(cases);
		pet.setIsMember(isMember);
		pet.setDocid(docid);
		
		int n = petDao.create(pet);
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
