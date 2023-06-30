package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pet.dao.DocDao;


@WebServlet("/signin")
public class LoginDoc extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		DocDao docDao=new DocDao();
		boolean ss=docDao.signin(id, password);
		System.out.println(ss);
		try {
			if(ss==true){
				request.getRequestDispatcher("indes_pet.jsp").forward(request, response);		
				
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
