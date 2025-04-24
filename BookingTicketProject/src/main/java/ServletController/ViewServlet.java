package ServletController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAOlayer.BookingDAO;
import pojo.Booking;

@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		BookingDAO dao=new BookingDAO();
		List<Booking> list=new ArrayList<>();
		try {
			list=dao.fetch();
			req.setAttribute("result", list);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		req.setAttribute("result", list);
		RequestDispatcher rd=req.getRequestDispatcher("FinalViewing.jsp");
		rd.forward(req, resp);
	}
}
