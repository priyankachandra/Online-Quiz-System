import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import java.io.*;
public class UpdateQ_DB extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
  {
      PrintWriter pw=res.getWriter();
	
	 String s1=req.getParameter("qno");
	  String s2=req.getParameter("lang");
	 
	  try
	 {  String query="";
	    Connection con=DBInfo.getConnection();
		
		if(s2.startsWith("core"))
		   query="select * from core_java where Q_No=?";
		 else if(s2.startsWith("android"))
		      query="select * from android_que where Q_No=?";
			  else if(s2.startsWith("advance"))
		             query="select * from adv_java_que where Q_No=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,s1);
		
	    ResultSet rs=ps.executeQuery();
      String que=rs.getString(2);
	 
	  String O1=rs.getString(3);
	  String O2=rs.getString(4);
	  String O3=rs.getString(5);
	  String O4=rs.getString(6);
	  String C=rs.getString(7);
	   pw.println("<!DOCTYPE html>");
pw.println("<html>");
pw.println("<head>");
pw.println("<title>Online Test</title>");
pw.println("<link rel=shortcut_icon href=\"../s1.jpg\">");
pw.println("<link rel=stylesheet href=\"../style_home.css\" type=text/css>");
pw.println("</head>");
pw.println("<body>");
pw.println("<table><tr>");
pw.println("<td><img src=\"../images/s1.jpg\" width='100' height='100'/></td>");
pw.println("<td><div id='header'>");
  pw.println("<h1 href='#OnlineTest'><span><b><I>Online Servey Buzz</b></I></span>");

pw.println("</tr>");
pw.println("</table>");

pw.println("<ul>");
 pw.println(" <li id='name'><a href='Home1'>Home</a></li>");
  pw.println("<li id='name'><a href='Registration'>Registration</a></li>");
  pw.println("<li id='name'><a href='#news'>News</a></li>");
  pw.println("<li id='name'><a href='#contact'>Contact</a></li>");
  pw.println("<li id='name'><a href='#about'>About</a></li>");
  
pw.println("</ul><br><br>");

pw.println("<center>");
	 pw.println("<fieldset style=width:700px;height:500px;background-color:ghostwhite>");
	 
	 pw.println("<legend><h1>Update Question</h1></legend><br><br>");
	 
	 pw.println("<form action=UpdateQues>");
	 pw.println("<table>");
	 pw.println("<tr>");
	 pw.println("<td>Enter question</td><td><input type=text value="+que+" name=que><br><br></td></tr>");
	 pw.println("<td>Enter Option 1</td><td><input type=text value="+O1+" name=o1><br><br></td></tr>");
	 pw.println("<td>Enter Option 2</td><td><input type=text value="+O2+" name=o2><br><br></td></tr>");
	 pw.println("<td>Enter Option 3</td><td><input type=text value="+O3+" name=o3><br><br></td></tr>");
	 pw.println("<td>Enter Option 4</td><td><input type=text value="+O4+" name=o4><br><br></td></tr>");
	 pw.println("<td>Enter correct answer</td><td><input type=text value="+C+" name=ca><br><br></td></tr>");
	 pw.println("<table>");
	 pw.println("<input type=submit value=update style=color:black;font-weight:bold;background-color:skyblue;font-size:15px;border-radius:10px;width:100px;height:50px>");
	
  
	 }
	 catch(Exception e)
	 {
	    e.printStackTrace();
	 }
	    
  
	 
	
	}
}