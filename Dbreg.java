import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*;

public class Dbreg extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
{
PrintWriter pw=res.getWriter();
String s1=req.getParameter("fname");
String s2=req.getParameter("lname");
String s3=req.getParameter("fhname");
String s4=req.getParameter("addr");
String s5=req.getParameter("gender");
String s6=req.getParameter("dob");
String s7=req.getParameter("mobile");
String s8=req.getParameter("sem");
String s9=req.getParameter("country");
String s10=req.getParameter("language");
String s11=req.getParameter("college");
String s12=req.getParameter("per10");
String s13=req.getParameter("board1");
String s14=req.getParameter("per12");
String s15=req.getParameter("board2");
String s16=req.getParameter("email");
String s17=req.getParameter("pass");
String s18=req.getParameter("repass");
String s19="student";

try
{
Connection con=DBInfo.getConnection();
 String query="insert into registration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
 PreparedStatement ps=con.prepareStatement(query);
 ps.setString(1,s1);
 
 ps.setString(2,s2);
 ps.setString(3,s3);
 ps.setString(4,s4);
 ps.setString(5,s5);
 ps.setString(6,s6);
 ps.setString(7,s7);
 ps.setString(8,s8);
 ps.setString(9,s9);
 ps.setString(10,s10);
 ps.setString(11,s11);
 ps.setString(12,s12);
 ps.setString(13,s13);
 ps.setString(14,s14);
 ps.setString(15,s15);
 ps.setString(16,s16);
 ps.setString(17,s17);
 ps.setString(18,s19);
 if(s17.equals(s18))
 {
      int i=ps.executeUpdate();
      pw.println(i);
       if(i==1)
           {   pw.println("Registration done successfully!");
              res.sendRedirect("Login");
           }
      else
          {
                pw.println("<html>");
      pw.println("<body>");
      pw.println("<center><font size=4 color=red>Registration not done<br>try again</font></center>");
	  pw.println("</body>");
	   pw.println("</html>");
	  RequestDispatcher rd=req.getRequestDispatcher("Login");
	  rd.include(req,res);
          }
 }
 else
{
    pw.println("Password doesn't match");
}

 }
 catch(Exception e)
 {
 e.printStackTrace();
 
 }



DBInfo.close();
}
}

 
 




