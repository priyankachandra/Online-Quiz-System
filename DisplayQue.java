import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class DisplayQue extends HttpServlet
{
  public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
  {
     PrintWriter pw=res.getWriter();
     pw.println("<!DOCTYPE html >");
     pw.println("<html >");
	 pw.println("<form action=DisplayQue method=Post>");
	 pw.println("Enter the language for which u want to view question<input type=text name=que>");
	 pw.println("<input type=submit>");
     
  }
 public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
 {
     PrintWriter pw=res.getWriter();
    pw.println("<!DOCTYPE html >");
    pw.println("<html >");
    pw.println("<head>");

  pw.println("<title>View Questions</title>");
   pw.println("</head>");

 pw.println("<body>");
      try
	  { String name=req.getParameter("que");
	   
		String query=" ";
      Connection con=DBInfo.getConnection();
	  if(name.startsWith("android"))
	      query="select * from android_que";
	  else if(name.startsWith("core"))
	      query="select * from core_java";
		   else if(name.startsWith("advance"))
	     query="select * from adv_java_que";
		 
	  PreparedStatement ps=con.prepareStatement(query);
	  ResultSet rs=ps.executeQuery();
   
       pw.println("<center>");
       pw.println("<table border=1>");
	   pw.println(" <tr>");
	    pw.println(" <td>Q_No</td>");
		 pw.println("<td>Question</td>");
		 pw.println("<td>Option1</td>");
		 pw.println("<td>Option2</td>");
		 pw.println("<td>Option3</td>");
		 pw.println("<td>Option4</td>");
		 pw.println("<td>Correct_answer</td>");
	   pw.println("</tr>");
	 
	  while(rs.next())
	  {
	      String s1=rs.getString(1);
		  String s2=rs.getString(2);
		  String s3=rs.getString(3);
		  String s4=rs.getString(4);
		  String s5=rs.getString(5);
		  String s6=rs.getString(6);
		  String s7=rs.getString(7);
	  
	    pw.println("<tr>");
		 pw.println("<td>"+s1+"</td>");
		 pw.println("<td>"+s2+"</td>");
		 pw.println("<td>"+s3+"</td>");
		 pw.println("<td>"+s4+"</td>");
		  pw.println("<td>"+s5+"</td>");
		 pw.println("<td>"+s6+"</td>");
		 pw.println("<td>"+s7 +"</td>");
		}
		
	}
	catch(Exception e)
	{
	   e.printStackTrace();
	}
	 
  
 pw.println("</body>");
pw.println("</html>");
}
}
