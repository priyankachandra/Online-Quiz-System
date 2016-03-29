import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;


public class AddQ_DB extends HttpServlet
{
   
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
   { 
     PrintWriter pw=res.getWriter();
	 
	 String s1=req.getParameter("lang");
	 String s2=req.getParameter("que");
	 String s3=req.getParameter("o1");
	 String s4=req.getParameter("o2");
	 String s5=req.getParameter("o3");
	 String s6=req.getParameter("o4");
	 String s7=req.getParameter("ca");
	 
	 try
	 {  String query=" ";
	    Connection con=DBInfo.getConnection();
		 if(s1.startsWith("core"))
		     query="insert into core_java (Question,Option1,Option2,Option3,Option4,Correct_ans) values(?,?,?,?,?,?)";
		  else if(s1.startsWith("android"))
		     query="insert into android_que (Question,Option1,Option2,Option3,Option4,Correct_ans) values(?,?,?,?,?,?)";
			   else if(s1.startsWith("advance"))
		     query="insert into adv_java_que (Question,Option1,Option2,Option3,Option4,Correct_ans) values(?,?,?,?,?,?)";
			 
		PreparedStatement ps=con.prepareStatement(query);
	    
		ps.setString(1,s2);
		ps.setString(2,s3);
		ps.setString(3,s4);
		ps.setString(4,s5);
		ps.setString(5,s6);
		ps.setString(6,s7);
		
        int i=ps.executeUpdate();
		
       pw.println("<html><body><center><h1>");
	    pw.println(i+" Question added");
		 pw.println("</h1></center></body></html>");		
	   
	 }
	 catch(Exception e)
	 {
	    e.printStackTrace();
	 }
	}
}