import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Admin extends HttpServlet
{
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
  {   
     PrintWriter pw=res.getWriter();
	 try
	 {
         String fn=" ";	 
      	 String s1=req.getParameter("id");
	     String s2=req.getParameter("id1");
	    Connection con=DBInfo.getConnection();
		String query="select FirstName from registration where Email=? and Password=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,s1);
		ps.setString(2,s2);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
		    fn=rs.getString(1);
		}
	 
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
	 pw.println("<legend><h1>Admin Panel</h1></legend>");
	 pw.println("<div style=background-color:black;width:700px;height:70px; margin-top:0px><marquee behavior=alternate width=700><I><h1 style=color:white>");
	 pw.println("Welcome to "+fn);
	 pw.println("</h1></I></marquee></div>");
	 pw.println("<br><br><img src=../images/img25.png width=150px height=150px><br><br>");
	 pw.println("<table style=width:500px>");
	 pw.println("<tr>");
	 pw.println("<td><form action=AddQ><br><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><b>Add new Question</b></button></form></td>");
	 pw.println("<td><form action=DeleteQue><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><b>Delete Question</b></button></form></td>");
	 pw.println("<td><form action=UpdateQue><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><b>Update Question</b></button></form></td>");
	 pw.println("<td><form action=DisplayQue><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><b>Display Questions</b></button></form></td>");
	 pw.println("</tr></table><br><br><br>");
	 pw.println("<footer><font size=4><b>Home  |  Contact  | About Us</b></font></footer>");


	 pw.println("</fieldset>");
	 pw.println("</center>");
	 pw.println("</body>");
	 pw.println("</html>");
	 }
	 catch(Exception e)
	 {
	   e.printStackTrace();
	 }
  }
 }