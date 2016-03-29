import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Home1 extends HttpServlet
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
pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");pw.println("</h1></div></td>");

  
pw.println("<td><form action='Login'><input type='submit' value='Login' style='background-color:black;color:white;width:100px;height:40px'autofocus></form></td>");
pw.println("</tr>");
pw.println("</table>");

pw.println("<ul>");
 pw.println(" <li id='name'><a href='Home1'>Home</a></li>");
  pw.println("<li id='name'><a href='Registration'>Registration</a></li>");
  pw.println("<li id='name'><a href='#news'>News</a></li>");
  pw.println("<li id='name'><a href='#contact'>Contact</a></li>");
  pw.println("<li id='name'><a href='#about'>About</a></li>");
  
pw.println("</ul>");

pw.println("<ul>");
  pw.println("<li id='fname'><img id=img width='1350' height='500'title=''src=\"../images/img1.jpg\"/></li>");
  pw.println("<li id='fname'><img id=img width='1350' height='500' title='' src=\"../images/img2.jpg\"/></li>");
 pw.println(" <li id='fname'><img id=img width='1350' height='500' title='' src=\"../images/img5.jpg\"/></li>");
 pw.println("<li id='fname'><img id=img width='1350' height='500' title='' src=\"../images/img20.jpg\"/></li>");
 pw.println("</ul>");

pw.println("</table>");
}
}