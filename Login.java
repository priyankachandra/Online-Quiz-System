import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Login extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
PrintWriter pw=res.getWriter();


pw.println("<!DOCTYPE html>");
pw.println("<html>");
pw.println("<head>");
   pw.println("<title>Login</title>");
   pw.println("<link rel=shortcut icon href=\"../images/icon3.png\">");
   pw.println("<link rel=stylesheet href=\"../style_login.css\" type=text/css>"); 
pw.println("<script type=text/javascript src=\"../login.js\"></script>");   
pw.println("</head>");
pw.println("<body>");

     pw.println("<table><tr>");
           pw.println(" <td><img src=\"../images/s1.jpg\" width=100 height=100/></td>");
           pw.println(" <td><h1><span>");

             pw.println("<b><I>Online Servey Buzz</b></I></span></h1>");
            pw.println(" </td>");
         pw.println(" </tr>");
    pw.println("</table>");

  pw.println("<ul>");
    pw.println("<li><a id=link href=Home1>Home</a></li>");
     pw.println("<li><a id=link href=Registration>Registration</a></li>");
     pw.println("<li><a id=link href=#news>News</a></li>");
     pw.println("<li><a id=link href=#contact>Contact</a></li>");
     pw.println("<li><a id=link href=#about>About</a></li>");
  pw.println("<br>");
  
 pw.println("</ul>");
pw.println("<br>");
  pw.println("<center>");
    pw.println("<fieldset style=width:500px;background-color:ghostwhite;border-radius:10px; box-shadow: 0 0 5px 1px #969696; border-color:white>");
      pw.println("<center><legend><h1>Login</h1></legend></center><br>");
   pw.println("<center><img src=\"../images/icon3.png\" width=60 height=60></center><br>");

    pw.println("<form name=log action=\"Dblogin\" method=post onsubmit=\"return onSub()\";>");
       pw.println("<font size=4><b><I>Enter Username</I></b></font><br><br>");
        pw.println("<input type=text name=uname max-length=30 class=focus placeholder=Enter your email style=width:200px>");
        pw.println("<br><br>");
       pw.println("<font size=4><b><I>Enter Password</I></b></font><br><br>");
        pw.println(" <input type=password name=pass max-length=30 class=focus placeholder=Password style=width:200px>");
pw.println("<br>");
pw.println("<br>");
pw.println("<input type=checkbox name=keep value=keep me logged in>");
pw.println("<I><b>Keep me logged in</b></I>");
pw.println("<br><br><br>");
 pw.println("<input type=submit value=Login>");
 pw.println(" </form>");
  
   pw.println(" &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");
 pw.println("<form action=Home1><input type=submit value=Cancel></form>");
pw.println("<br><br>");
 

pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");
pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");
pw.println("<a href=#forgot password><I><b>forgot password</b></I></a><br><br>");
  pw.println(" </fieldset>");
  pw.println("</center>");
 pw.println("</body>");
pw.println("</html>");
}}
    