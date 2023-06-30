package servlet;
import  java.io.IOException;
import  java.io.PrintWriter;

import javax.servlet.ServletException; import javax.servlet.annotation.WebServlet; import javax.servlet.http.HttpServlet;
import  javax.servlet.http.HttpServletRequest;
import  javax.servlet.http.HttpServletResponse;

import pet.dao.DocDao;
import pet.model.Doc;

@WebServlet("/insertdoc")
public class InsertDoc extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");//ÉèÖÃ×Ö·û±àÂë£¬±ÜÃâ³öÏÖÂÒÂë
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex"); 
		String passw=request.getParameter("passw");
		String phone=request.getParameter("phone");
		String confirm=request.getParameter("confim");
		int n=0;
		if(id.equals("")||name.equals("")||passw.equals("")||!passw.equals(confirm)||phone.equals("")){
			n=0;
		}else{
			Doc doc=new Doc();
			DocDao docDao=new DocDao();
			doc.setId(id);
			doc.setName(name);
			doc.setPassword(passw);
	        doc.setSex(sex);
			doc.setPhone(phone);
			n = docDao.create(doc);
		}
		
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
