package ServletController;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOlayer.BookingDAO;

@WebServlet("/upd")
public class UpdateServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int pid=Integer.parseInt(req.getParameter("id"));
		String psource=req.getParameter("sou");
		BookingDAO dao=new BookingDAO();
		int count;
		try {
			count = dao.updateInfo(pid,psource);
			req.setAttribute("ans", count);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("FinalUpdate.jsp");
		rd.forward(req, resp);
	}

}
