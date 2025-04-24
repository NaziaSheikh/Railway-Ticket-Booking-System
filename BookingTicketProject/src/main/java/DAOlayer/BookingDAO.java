package DAOlayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Booking;

public class BookingDAO {

	public int addPassenger(Booking b) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql:///railway","root","Nazia2001@");
		PreparedStatement pst=conn.prepareStatement("insert into booking values (?,?,?,?)");
		pst.setInt(1, b.getPid());
		pst.setString(2, b.getPname());
		pst.setString(3, b.getPsource());
		pst.setString(4, b.getPdestination());
		int count=pst.executeUpdate();
	    return count;
	}

	public List<Booking> fetch() throws ClassNotFoundException, SQLException {
		List<Booking> list=new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql:///railway","root","Nazia2001@");
		PreparedStatement pst=conn.prepareStatement("select * from booking");
		ResultSet rs=pst.executeQuery();
		
		while(rs.next())
		{
			Booking b=new Booking();
			b.setPid(rs.getInt(1));
			b.setPname(rs.getString(2));
			b.setPsource(rs.getString(3));
			b.setPdestination(rs.getString(4));
			list.add(b);
		}
		return list;
		
	}

	public int updateInfo(int pid, String psource) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql:///railway","root","Nazia2001@");
		PreparedStatement pst=conn.prepareStatement("update booking set psource=? where pid=?");
		pst.setString(1,psource);
		pst.setInt(2, pid);
		int count=pst.executeUpdate();
		return count;
	}

	public int delete(int pid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql:///railway","root","Nazia2001@");
		PreparedStatement pst=conn.prepareStatement("delete from booking where pid=?");
		pst.setInt(1, pid);
		int count=pst.executeUpdate();
		return count;
	}

}
