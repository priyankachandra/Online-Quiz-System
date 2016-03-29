import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import java.io.*;
public class UpdateQues extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
  {
      PrintWriter pw=res.getWriter();
	
	 String s1=req.getParameter("que");
	 String s2=req.getParameter("o1");
	 String s3=req.getParameter("o2");
	 String s4=req.getParameter("o3");
	 String s5=req.getParameter("o4");
	 String s6=req.getParameter("ca");
	 String s7=req.getParameter("qno");
	 String s8=req.getParameter("lang");
    pw.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8);
	   try
	 {   String query=" ";
	    Connection con=DBInfo.getConnection();
		if(s2.startsWith("core"))
		 query="update core_java set Question=?, Option1=?, Option2=?,Option3=?,Option4=?, Correct_ans=? where Q_No=?";
		else if(s2.startsWith("android"))
		 query="update android_que set Question=?, Option1=?, Option2=?,Option3=?,Option4=?, Correct_ans=? where Q_No=?";
		    else if(s2.startsWith("advance"))
		 query="update adv_java_que set Question=?, Option1=?, Option2=?,Option3=?,Option4=?, Correct_ans=? where Q_No=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,s1);
		ps.setString(2,s2);
		ps.setString(3,s3);
		ps.setString(4,s4);
		ps.setString(5,s5);
		ps.setString(6,s6);
		ps.setString(7,s7);
		
	    int i=ps.executeUpdate();
		pw.println("updated Record"+i);
	}
   catch(Exception e)
	 {
	    e.printStackTrace();
	 }
	}
}
	 