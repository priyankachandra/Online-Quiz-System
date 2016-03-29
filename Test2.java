import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Test2 extends HttpServlet
{ 
 int count=0,no;
 ResultSet rs,rs2;
 String query1,query2;
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
{ 

PrintWriter pw=res.getWriter();
try
{
if(count==0)
{
Connection con=DBInfo.getConnection();
query1="select * from android_que";
PreparedStatement ps=con.prepareStatement(query1);

 rs=ps.executeQuery();
 query2="select count(*) from android_que";
PreparedStatement ps2=con.prepareStatement(query2);
 rs2=ps2.executeQuery();
 while(rs2.next())
{
     no=rs2.getInt(1);
}
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
if(count==no)
{
   pw.println("<td>");
   pw.println("<form  action=Submit>");
pw.println("<b><button type=submit style=color:white;background-color:maroon;font-weight:bold;font-size:15px;border-radius:10px;width:100px;height:50px;>Submit</button></b>");
   pw.println("</td>");
pw.println("</tr>");

pw.println("</table>");
}


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
pw.println("<td><input type=radio name=option value="+rs.getString(3)+">");
pw.println(rs.getString(3));
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option value="+rs.getString(3)+">");
pw.println(rs.getString(4));
pw.println("</td>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option value="+rs.getString(3)+">");
pw.println(rs.getString(5));
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option value="+rs.getString(3)+">");
pw.println(rs.getString(6));
pw.println("</td>");
pw.println("</tr>");





pw.println("</table>");
pw.println("</fieldset>");
pw.println("</center>");

pw.println("<br><br>");
pw.println("<center>");
pw.println("<table><tr><td>");
if(count<no)
{

pw.println("<form method=get action=Test >");
pw.println("<center><b><button type=submit style=color:black;font-weight:bold;background-color:skyblue;font-size:15px;border-radius:10px;width:100px;height:50px;>Next</button></b></center>");
pw.println("</form>");
pw.println("</td>");
}
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
if(count==no)
{
   pw.println("<td>");
   pw.println("<form  action=Submit>");
pw.println("<b><button type=submit style=color:white;background-color:maroon;font-weight:bold;font-size:15px;border-radius:10px;width:100px;height:50px;>Submit</button></b>");
   pw.println("</td>");
}
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
pw.println("<td><input type=radio name=option value="+rs.getString(3)+">");
pw.println(rs.getString(3));
pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option value="+rs.getString(3)+">");
pw.println(rs.getString(4));
pw.println("</td>");
pw.println("<tr>");
pw.println("<td><input type=radio name=option value="+rs.getString(3)+">");
pw.println(rs.getString(5));
pw.println("</td>");
pw.println("</tr>");
pw.println("<td><input type=radio name=option value="+rs.getString(3)+">");
pw.println(rs.getString(6));
pw.println("</td>");
pw.println("</tr>");
pw.println("</fieldset>");
pw.println("</table>");
pw.println("</center>");
pw.println("<center>");
pw.println("<table><tr><td>");
if(count<no)
{
pw.println("<form method=get action=Test >");
pw.println("<b><button type=submit style=color:black;font-weight:bold;background-color:skyblue;font-size:15px;border-radius:10px;width:100px;height:50px;>Next</button></b>");

pw.println("</form>");
pw.println("</td>");
}
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







