import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class Update1 extends HttpServlet
{
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
   {
    PrintWriter pw=res.getWriter();
   pw.println("<!DOCTYPE html>");
pw.println("<html>");
pw.println("<head>");
pw.println("<title>Update Question</title>");
pw.println("</head>");
pw.println("<body>");
 
      String s1=req.getParameter("lang");
	        String s2=req.getParameter("qno");

	  try
		{
	        String query=" ";
            Connection con=DBInfo.getConnection();
			if(s1.startsWith("core"))
		        query="Select * from core_java where Q_No=?";
			else if(s1.startsWith("android"))
		           query="Select * from android_que where Q_No=?";
				  else if(s1.startsWith("advance"))
		               query="Select * from adv_java_que where Q_No=?";
		   PreparedStatement ps=con.prepareStatement(query);
		   ps.setString(1,s2);
		   ResultSet rs=ps.executeQuery();
		   
		   while(rs.next())
		   {
		      String s3=rs.getString(2);
			  
			  String s4=rs.getString(3);
			  String s5=rs.getString(4);
			  String s6=rs.getString(5);
			  String s7=rs.getString(6);
			  String s8=rs.getString(7);
			  
			 
			
			  pw.println("<form action=\"UpdateQues\">");
			  pw.println("Your Q_No is:<input type=text value="+s2+" name=qno readonly=\"true\"/><br />");
			  pw.println("Your Question is:<input type=text value="+s3+" name=que /><br />");
			   pw.println("new Option1 is:<input type=text value="+s4+" name=o1 /><br />");
			    pw.println("New Option2 is:<input type=text value="+s5+" name=o2  /><br />");
				pw.println("new Option3 is:<input type=text value="+s6+" name=o3  /><br />");
			    pw.println("New Option4 is:<input type=text value="+s7+" name=o4  /><br />");
				pw.println("New Correct Answer is:<input type=text value="+s8+" name=ca /><br />");
				pw.println("<input type=hidden value="+s1+" name=\"lang\" ><br />");
				pw.println("<input type=submit />");
		      pw.println("</body>");
pw.println("</html>");
		 }
        }
		catch(Exception e)
		{
		   e.printStackTrace();
		}
	 

}
}