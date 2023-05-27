package control;

import java.io.IOException;


import dao.Dao;
import dto.Dto;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Image")
public class ImgCtrl {//extends jakarta.servlet.GenericServlet {

	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		System.out.println(arg0.getParameter("filecover"));
	}


}
