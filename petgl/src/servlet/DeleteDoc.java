package servlet;
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.List;

import javax.servlet.ServletException; 
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import  javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;

import pet.dao.DocDao;
import pet.model.Doc;
@WebServlet("/deletedoc")
public class DeleteDoc extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");
		String id=request.getParameter("id");
		int n=0;
		DocDao docDao=new DocDao();
		try {
			Doc doc=docDao.find(id);
			n = docDao.remove(doc);
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
