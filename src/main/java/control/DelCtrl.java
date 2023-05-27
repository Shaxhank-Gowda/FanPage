package control;

import java.io.IOException;


import dao.Dao;
import dto.Dto;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/delete")
public class DelCtrl extends jakarta.servlet.GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String x=arg0.getParameter("del");
		
		int sid=Integer.parseInt(x);
		
		Dao d1= new Dao();
		   String str= d1.delete(sid);
		 arg1.getWriter().print(str);
		
		
	}

}
