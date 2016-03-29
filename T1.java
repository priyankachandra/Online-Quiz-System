import java.sql.*;
import javax.servlet.http.*;
import java.io.*;
public class T1 extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
  {   
      PrintWriter pw=res.getWriter();
	   try
	 {
	    Connection con=DBInfo.getConnection();
		String query="select * from android_que";
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		pw.println("<html>");
		pw.println("<body>");
		 
		
		  pw.println("<input type=radio name=option value="+rs.getString(3)+">");
		  pw.println(rs.getString(3));
		  pw.println("<input type=radio name=option value="+rs.getString(4)+">");
		  pw.println(rs.getString(4));
		  pw.println("<input type=radio name=option value="+rs.getString(5)+">");
		  pw.println(rs.getString(5));
		  pw.println("<input type=radio name=option value="+rs.getString(6)+">");
		  pw.println(rs.getString(6));
		 
	catch(Exception e)
	 {
	    e.printStackTrace();
	 }
  }
 }
  