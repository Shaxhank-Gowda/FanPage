package control;

import java.io.IOException;

import dao.Dao;
import dto.Dto;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/update")
public class UppdateCtrl extends jakarta.servlet.GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = (arg0.getParameter("aa"));  //      1
		String name = (arg0.getParameter("ab"));  //    null
		String mail = (arg0.getParameter("ac")); //      aki@gmail.com
		String no = (arg0.getParameter("ad"));//         null
		String gen = (arg0.getParameter("gen"));//         null
		int id1 = Integer.parseInt(id);

		Dao d2 = new Dao();
		Dto s = d2.find(id1); // { 1, ramya, ram@gmail.com, female , 4533656}
		
		
		if (s != null) {
			if (name.length() == 0) { //true
				name = s.getName();   //null=> ramya
			}
			if (mail.length() == 0) {  //false
				mail = s.getMail();  //aki@gmail
			}
			if (no.length() == 0) {   //true*... 
				no = "" + s.getPh_no(); //  4564313
				
			}
			if (gen == null) {   // true
				gen = s.getGender();}  //7female

			long l = Long.parseLong(no);
			
			
			Dto d1 = new Dto();
			d1.setId(id1);
			d1.setName(name);
			d1.setMail(mail);
			d1.setGender(gen);
			d1.setPh_no(l);

			arg1.getWriter().print(d2.update(id1, d1));

		}
		else {
			arg1.getWriter().print("User does not exist on this ID");
		}

	}

}