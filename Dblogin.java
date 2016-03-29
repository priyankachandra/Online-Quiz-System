import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import javax.servlet.*;

public class Dblogin extends HttpServlet
{

 public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
 {
      String utype="";
	  int flag=0;
	  String pass;
   PrintWriter pw=res.getWriter();
   String s1=req.getParameter("uname");
   String s2=req.getParameter("pass");
  try
{  
  Connection con=DBInfo.getConnection();
  String query="select * from registration where Email=? and Password=?";
  PreparedStatement ps=con.prepareStatement(query);
  ps.setString(1,s1);
  ps.setString(2,s2);
  ResultSet rs=ps.executeQuery();
  while(rs.next())
  {
     flag=1;
     utype=rs.getString(18);
	 System.out.println(utype+"monika");
  }
  if(flag==1&&utype.equalsIgnoreCase("student"))
  {
     res.sendRedirect("Start_Test");
  }
  if(flag==1&&utype.equalsIgnoreCase("Admin"))
  {
     res.sendRedirect("Admin?id="+s1+"&id1="+s2);
  }
  if(flag==0)
  {   pw.println("<html>");
      pw.println("<body>");
      pw.println("<center><font size=4 color=red>username or Password is wrong<br>try again</font></center>");
	  pw.println("</body>");
	   pw.println("</html>");
	  RequestDispatcher rd=req.getRequestDispatcher("Login");
	  rd.include(req,res);
  }
 }
catch(Exception e)
{
   e.printStackTrace();
} 
	 }
	 }
  
 
  
   
   
   
  
   
   
   
   
   