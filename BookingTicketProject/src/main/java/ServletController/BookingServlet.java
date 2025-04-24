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
import pojo.Booking;

@WebServlet("/book")
public class BookingServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String source=req.getParameter("source");
		String destination =req.getParameter("destination");
		Booking b=new Booking();
		b.setPid(id);
		b.setPname(name);
		b.setPsource(source);
		b.setPdestination(destination);
		
		BookingDAO dao=new BookingDAO();
		
		try {
			int count = dao.addPassenger(b);
			req.setAttribute("info",count);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher rd=req.getRequestDispatcher("FinalBooking.jsp");
		rd.forward(req, resp);
	}
}
