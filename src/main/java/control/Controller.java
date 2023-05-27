package control;


import java.io.IOException;


import dao.Dao;
import dto.Dto;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/url")
public class Controller extends jakarta.servlet.GenericServlet {

	
	@Override
	public void service(jakarta.servlet.ServletRequest arg0, jakarta.servlet.ServletResponse arg1)
			throws jakarta.servlet.ServletException, IOException {
		// TODO Auto-generated method stub
		String x=(arg0.getParameter("id"));
		String y=(arg0.getParameter("name"));
		String z=(arg0.getParameter("email"));
		String u=arg0.getParameter("gender");
		String w=(arg0.getParameter("phone"));
		int i=Integer.parseInt(x);
		long l=Long.parseLong(w);
		
		Dao d2=new Dao();
		Dto f=d2.find(i);
		
		
		if (f==null) {
		
		
		Dto d1= new Dto();
		d1.setId(i);
		d1.setName(y);
		d1.setMail(z);
		d1.setGender(u);
		d1.setPh_no(l);
		
		
		
	
		arg1.getWriter().print( d2.insert(d1));}
		else {
			arg1.getWriter().print("an account already exist on this id please try a neww ID");
			
		}
		
		
	}}


	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	