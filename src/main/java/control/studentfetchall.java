package control;

import java.io.IOException;
import java.util.List;

import dao.Dao;
import dto.Dto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/fetchall")
public class studentfetchall extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
// TODO Auto-generated method stub
//	super.doGet(req, resp);
	

	Dao d=new Dao();
	List<Dto> l=d.fetchAll();
	
	req.setAttribute("list", l);
	
	RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
	rd.forward(req, resp);
	
	
//		for (Dto a : l) {
//		resp.getWriter().print(a.getId() +"\t"+a.getName() +"\t"+a.getMail() +"\t"+a.getGender() +"\t"+a.getPh_no() +"\n");
//	}
	

}
}
