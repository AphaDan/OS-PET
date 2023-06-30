package servlet;
import  java.io.IOException;
import  java.io.PrintWriter;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; import javax.servlet.http.HttpServletResponse; 

import pet.dao.DocDao;
import pet.model.Doc;

@WebServlet("/updateDoc")
public class UpdateDoc extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		Doc doc=new Doc();
		DocDao docDao=new DocDao();
		doc.setId(id);
		doc.setName(name);
		doc.setSex(sex);
		int n = docDao.update(doc);
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
