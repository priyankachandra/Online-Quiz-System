import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Start_Test extends HttpServlet
{
   
   public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
   {
     PrintWriter pw=res.getWriter();
	
      pw.println("<!DOCTYPE html>");
        pw.println("<html>");
 
      pw.println(" <head>");
  
   pw.println("<link rel=stylesheet type=text/css href=../style_start_test.css>");
   pw.println("<script src=\"../timer.js\" type=text/javascript></script>");
   pw.println(" </head>");
   pw.println("<body style=background-image:url(\"../images/img12.jpg\")>");
   pw.println("<p id=timer></p>");
   pw.println("<center>");
   pw.println("<fieldset style=width:900px;padding:0px>");
  pw.println(" <ul>");
   pw.println("<li id=fname><img src=../images/img13.jpg width=900 height=100 margin-top=0></li>");
   pw.println("<li id=fname><img src=../images/img15.jpg width=900 height=100></li>");
  pw.println("<li id=fname ><img src=../images/img14.jpg width=900 height=100></li>");
   pw.println("<li id=fname><img src=../images/img17.png width=900 height=100 ></li>");
  pw.println("</ul>");
  
   
    
	 pw.println("<table style=margin-top:150px>");
	  pw.println("<tr>");
	   pw.println("<td><b><I>C</I></b></td>");
	    pw.println("<td><form action=Test><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><a href=C>Start Test</a></button></form></td>");
	   pw.println("</tr>");
	 
	  pw.println("<tr>");
	    pw.println("<td><b><I>C++</I></b></td>");
	pw.println("<td><form action=Test><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><a href=C++>Start Test</a></button></form></td>");
	  pw.println(" </tr>");
	   pw.println("<tr>");
	    pw.println("<td><b><I>SQL</I></b></td>");
	   pw.println("<td><form action=Test><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><a href=SQL>Start Test</a></button></form></td>");
	   pw.println("</tr>");
	   pw.println("<tr>");
	  pw.println(" <br>");
	    pw.println("<td><b><I>Android</I></b></td>");
	   pw.println("<td><form action=Test><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><a href=Android>Start Test</a></button></form></td>");
	   pw.println("</tr>");
	  pw.println(" <tr>");
	    pw.println("<td><b><I>Core Java</I></b></td>");
	 pw.println("<td><form action=Test><button type=submit  style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><a href=CoreJava>Start Test</a></button></form></td>");
	   pw.println("</tr>");
	  pw.println(" <tr>");
	   pw.println("<td><b><I>Advance Java&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</I></b></td>");
 pw.println("<td><form action=Advance Java ><button type=submit onsubmit=return my(); style=font-weight:bold;font-size:15px;width:100px;height:50px;border-radius:10px><a href=start_test>Start Test</a></button></form></td>");;
	
	  pw.println(" </tr>");
	
	 pw.println(" </table>  ");
    pw.println("</fieldset>");
   pw.println("</center>");
    pw.println("</body> ");
	pw.println("</html> ");
	}
}