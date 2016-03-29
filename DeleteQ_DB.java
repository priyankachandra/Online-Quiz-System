import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class DeleteQ_DB extends HttpServlet
{
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
   {
    PrintWriter pw=res.getWriter();
	String s1=req.getParameter("lang");
	String s2=req.getParameter("qno");
	//pw.println(s1+" "+s2);
	try
	 {  String query=" ";
	    Connection con=DBInfo.getConnection();
		 //pw.println(con);
		 if(s1.startsWith("core"))
		       query="delete  from core_java where Q_No=?";
		 else if(s1.startsWith("advance"))
		         query="delete  from adv_java_que where Q_No=?";
			  else if(s1.startsWith("android"))
		             query="delete  from android_que where Q_No=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,s2);
		 
	    int i=ps.executeUpdate();
		  pw.println("<html><body><center><h1>");
	    pw.println(i+" Question deleted");
		 pw.println("</h1></center></body></html>");
	 }
	 catch(Exception e)
	 {
	    e.printStackTrace();
	 }
	}
}