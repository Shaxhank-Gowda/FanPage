package control;

import java.io.IOException;
import java.util.List;

import dao.Dao;
import dto.Dto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/petch")
public class petchCtrl extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);

		String id = (req.getParameter("a"));
		Dao d2 = new Dao();

		if (id.equals("all")) {
			List<Dto> l = d2.fetchAll();
			for (Dto dto : l) {
				resp.getWriter().print("Fan Id : " + dto.getId() + "\t" + "Name : " + dto.getName() + "\t" + "Mail Id : "
								+ dto.getMail() + "\t" + "Gender:" + dto.getGender() + "\t" + "Ph_no : "
								+ dto.getPh_no() + "\n");

			}
		}

		else {
			int x = Integer.parseInt(id);

			Dto s = d2.find(x);
			if (s != null) {
				resp.getWriter().print("Fan Id : " + x + "\n" + "Name : " + s.getName() + "\n" + "Mail Id : "
						+ s.getMail() + "\n" + "Gender:" + s.getGender() + "\n" + "Ph_no : " + s.getPh_no());

			} else {
				resp.getWriter().print("User does not exist on this ID");
			}

		}
	}
}
