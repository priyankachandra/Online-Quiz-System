import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Q_fetch extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
int count=0;
 PrintWriter pw=res.getWriter();
 try
 {
 
 Connection con=DBInfo.getConnection();
 
 
 String query="select Q_No,Question,Option1,option2,option3,option4 from adv_java_que";
 PreparedStatement ps=con.prepareStatement(query);
 ResultSet rs=ps.executeQuery();
 pw.println("<html>");
 pw.println("<body>");
 pw.println("<center>");
 pw.println("<fieldset style=width:700px;border-radius:5px;background-color:Lavender;border-color:blue >");
 while(rs.next())
 {
    pw.println("<table>");
	pw.println("<tr>");
	 pw.println("<th>");
       pw.println(rs.getString(1));
	   pw.println("</th>");
	   pw.println("<th>");
   pw.println(rs.getString(2));
   pw.println("</th>");
   pw.println("</tr>");
   pw.println("</table>");
   pw.println("<table>");
   pw.println("<tr>");
  
    pw.println("<td><input type=radio name=option>");
	pw.println(rs.getString(3));
	pw.println("</td>");
	pw.println("<td><input type=radio name=option>");
	pw.println(rs.getString(4));
	pw.println("</td>");
	
	pw.println("</tr>");
	
	 pw.println("<tr>");
  
    pw.println("<td><input type=radio name=option>");
	pw.println(rs.getString(5));
	pw.println("</td>");
	
	pw.println("<td><input type=radio name=option>");
	pw.println(rs.getString(6));
	pw.println("</td>");
	pw.println("</tr>");
	 pw.println("</table>"); 
	   pw.println("<br/><br/><br/><br/>");
	   count++ ;
    
}	
    pw.println("<table>");  
     pw.println("<tr>");
	 pw.println("<td>");
	pw.println("<input type=submit value=next></td>");
	pw.println("</tr>");
	pw.println("</table>");    
	
 if(count==4)
	 {
	 res.sendRedirect("next");
	
	   } 
	   pw.println("<center>");
	   
	  con.close(); 
}

catch(Exception e)
{
e.printStackTrace();
} 
}
}