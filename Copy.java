import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Copy extends HttpServlet
{ 
 int count=0;
 ResultSet rs,rs1;
 String query,query1;
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
{ 
Connection con;
PrintWriter pw=res.getWriter();
try
{
if(count==0)
{
con=DBInfo.getConnection();
query="select * from android_que";
PreparedStatement ps=con.prepareStatement(query);

 rs=ps.executeQuery();

query1="select count(*) from android_que";
PreparedStatement ps1=con.prepareStatement(query1);
rs1=ps1.executeQuery();
while(rs1.next())
{
  pw.println(rs1.getInt(1));
}

if(rs.next())
{
  
 count++;
pw.println("<html>");
pw.println("<body style=background-image:url(\"../images/img10.jpg\">");
pw.println("<table><tr>");
pw.println("<td><img src=\"../images/s1.jpg\" width='100' height='100'/></td>");
pw.println("<td><div id='header'>");
  pw.println("<h1 href='#OnlineTest'><span><b><I>Online Servey Buzz</b></I></span>");
pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");pw.println("</h1></div></td>");
pw.println("</tr>");
pw.println("</table>");

pw.println("<center>");
pw.println("<fieldset style=width:500px;height:300px;border-radius:10px;background-color:bisque;border-color:skyblue;margin-top:50px;box-shadow:0 0 5px 1px #969696;>");
pw.println("<table>");
pw.println("<tr>");
pw.println("<td>");
pw.println(rs.getString(1));
pw.println("</td>");
pw.println("<td>");
pw.println(rs.getString(2));
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option>");
pw.println(rs.getString(3));
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option>");
pw.println(rs.getString(4));
pw.println("</td>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option>");
pw.println(rs.getString(5));
pw.println("</td>");
pw.println("</tr>");
pw.println("<td><input type=radio name=option>");
pw.println(rs.getString(6));
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td>");

pw.println("</tr>");
pw.println("</td>");
pw.println("</table>");
pw.println("</fieldset>");
pw.println("</center>");

pw.println("<br><br>");
pw.println("<center>");
pw.println("<table><tr><td>");
pw.println("<form method=get action=Test >");
pw.println("<center><b><button type=submit style=color:black;font-weight:bold;background-color:skyblue;font-size:15px;border-radius:10px;width:100px;height:50px;>Next</button></b></center>");
pw.println("</form>");
pw.println("</td>");
}
if(count>1)
{
pw.println("<td>");
pw.println("<form method=Post action=Test>");
pw.println("<center><b><button type=submit style=color:black;background-color:skyblue;font-weight:bold;font-size:15px;border-radius:10px;width:100px;height:50px;>Back</button></b></center>");
pw.println("</td>");
pw.println("</tr>");
pw.println("</table>");
pw.println("</center>");

}


}
catch(Exception e)
{
e.printStackTrace();

}
}

public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException
{ 
PrintWriter pw=res.getWriter();


 try
{ 
if(rs.previous())
{
  count--;
pw.println("<html>");

pw.println("<link rel=shortcut_icon href=\"../s1.jpg\">");

pw.println("</head>");



pw.println("<body style=background-image:url(\"../images/img10.jpg\">");
pw.println("<table><tr>");
pw.println("<td><img src=\"../images/s1.jpg\" width='100' height='100'/></td>");
pw.println("<td><div id='header'>");
  pw.println("<h1 href='#OnlineTest'><span><b><I>Online Servey Buzz</b></I></span>");
pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");pw.println("</h1></div></td>");
pw.println("</tr>");
pw.println("</table>");
pw.println("<center>");
pw.println("<fieldset style=width:500px;height:300px;border-radius:10px;background-color:bisque;border-color:skyblue;margin-top:50px;box-shadow:0 0 5px 1px #969696;>");
pw.println("<table>");
pw.println("<tr>");
pw.println("<td>");
pw.println(rs.getString(1));
pw.println("</td>");
pw.println("<td>");
pw.println(rs.getString(2));
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option>");
pw.println(rs.getString(3));
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option>");
pw.println(rs.getString(4));
pw.println("</td>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option>");
pw.println(rs.getString(5));
pw.println("</td>");
pw.println("</tr>");
pw.println("<td><input type=radio name=option>");
pw.println(rs.getString(6));
pw.println("</td>");
pw.println("</tr>");
pw.println("</fieldset>");
pw.println("</table>");
pw.println("</center>");
pw.println("<center>");
pw.println("<table><tr><td>");
pw.println("<form method=get action=Test >");
pw.println("<b><button type=submit style=color:black;font-weight:bold;background-color:skyblue;font-size:15px;border-radius:10px;width:100px;height:50px;>Next</button></b>");

pw.println("</form>");
pw.println("</td>");

}
pw.println("<td>");

if(count>1)
{
  
pw.println("<form method=post action=Test >");
pw.println("<center><b><button type=submit style=color:black;font-weight:bold;background-color:skyblue;font-size:15px;border-radius:10px;width:100px;height:50px;>Back</button></b></center>");
pw.println("</td>");
pw.println("</tr>");
pw.println("</table>");
pw.println("</center>");

}
}
catch(Exception e)
{
   e.printStackTrace();
}
}



}







