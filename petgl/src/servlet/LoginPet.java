package servlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pet.dao.PetDao;
import pet.model.Pet;

@WebServlet("/loginpet")
public class LoginPet extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		request.setCharacterEncoding("GB2312");
		String id=request.getParameter("id");
		String passw=request.getParameter("passw");
		PetDao petDao=new PetDao();
		List<Pet> list=petDao.findAll();
		int n=0;
		for(Pet pet:list){
			if(pet.getId().equals(id)&&pet.getPassword().equals(passw)){
				n=1;
				break;
			}
		}
		
		if(n==1){
			request.setAttribute("petId", id);
			request.getRequestDispatcher("login_pet_frame.jsp").forward(request, response);	
		}else{
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doGet(request, response);
	}
}
