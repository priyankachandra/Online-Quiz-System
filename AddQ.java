import javax.servlet.http.*;
import java.io.*;
import java.sql.*;


public class AddQ extends HttpServlet
{
   
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
   { 
     PrintWriter pw=res.getWriter();
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
	 pw.println("<table>");
	 pw.println("<tr>");
	 pw.println("<legend><h1>Add Question</h1></legend>");
	 
	 pw.println("<form action=AddQ_DB>");
	 pw.println("<table>");
	 pw.println("<tr>");
	 pw.println("<td>Enter the language in which u want to add question</td><td><input type=text name=lang><br><br></td></tr>");
	 
	 pw.println("<tr>");
	 pw.println("<td>Enter new Question</td><td><input type=text name=que><br><br></td></tr>");
	
	 pw.println("<tr>");
	 pw.println("<td>Enter option1</td><td><input type=text name=o1><br><br></td></tr>");
	 pw.println("<td>Enter option2</td><td><input type=text name=o2><br><br></td></tr>");
	 pw.println("<td>Enter option3</td><td><input type=text name=o3><br><br></td></tr>");
	 pw.println("<td>Enter option4</td><td><input type=text name=o4><br><br></td></tr>");
	 pw.println("<td>Enter correct answer</td><td><input type=text name=ca><br></td></tr>");
	  pw.println("</table>");
	 pw.println("<input type=submit value=add style=color:black;font-weight:bold;background-color:skyblue;font-size:15px;border-radius:10px;width:100px;height:50px>");
  }
 }
	 
	   
	
	 
	 
	
	 
   
 
	 