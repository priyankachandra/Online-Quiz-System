import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Registration extends HttpServlet
{
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
{
PrintWriter pw=res.getWriter();

pw.println("<!DOCTYPE html>");
pw.println("<html>");
pw.println("<head>");
   pw.println("<title>Registration form</title>");
   pw.println("<link rel= shortcut icon href=\"../images/icon3.png\">");
   pw.println("<link rel= stylesheet href=\"../style_registration.css\" type=text/css>");
   pw.println("<script type=text/javascript src=\"../registration.js\"></script>");
pw.println("</head>");
pw.println("<body>");

pw.println("<table><tr>");
pw.println("<td><img src=\"../images/s1.jpg\" width='100' height='100'/></td>");
pw.println("<td><div id=header>");
  pw.println("<h1 href=#OnlineTest><span>");

pw.println("<b><I>Online Servey Buzz</b></I></span>");
pw.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp");pw.println("</h1>");
pw.println("<br></div></td>");
pw.println("<td>");
   pw.println("<ul>");
  pw.println("<li><a href=Home1>Home</a></li>");
  pw.println("<li><a href=Registration>Registration</a></li>");
  pw.println("<li><a href=Login> login</a></li>");
  
  
pw.println("</ul>");
pw.println("</td>");
pw.println("</tr>");
pw.println("</table>");


// pw.println("<form name=myform onsubmit=\"registration();\">");
pw.println("<center>");

pw.println("<fieldset style=width:800px;background-color:ghostwhite;border-radius:10px>");
  pw.println("<legend><h1>Registration form</h1></legend>");
 
pw.println("<form action=\"Dbreg\" method=\"Get\" name=\"myform \" onsubmit=\"return registration()\"; >");
pw.println("<table>");
  pw.println("<tr>");
     pw.println("<td><b>First name*</b> </td>");
    pw.println("<td><input type=text name=fname required=true placeholder=FirstName>&nbsp;&nbsp;&nbsp;&nbsp;</td>");
    pw.println("<td><b> Last name* </b></td>");
    pw.println("<td><input type=text name=lname placeholder=LastName><br><br></td>");
  pw.println("</tr>");
  pw.println("<tr>");
    pw.println("<td><b>Father's name</b></td>");
     pw.println("<td><input type=text name=fhname placeholder=Father'sName required=true><br><br></td>");
  pw.println("<tr>");
    pw.println("<td><b>Address</b></td>");
    pw.println("<td> <textarea rows=6 columns=4 required=true name=addr></textarea><br><br></td>");
  pw.println("</tr>");
  pw.println("<tr>");
    pw.println("<td><b>Gender</b></td>");
    pw.println("<td><input type=radio name=gender value=male>male");
        pw.println(" <input type=radio name=gender value=Female>Female");
    pw.println("</td>");
    
   
    pw.println("<td><b>DateOfBirth</b></td>");
    pw.println("<td><input type=\"date\" name=dob required=true><br><br></td>");
  pw.println("</tr>");
 pw.println(" <tr>");
pw.println("<tr>");
pw.println("<td><b>Contact No</b></td>");
pw.println("<td><input type=text name=mobile></td>");


    pw.println("<td><b> Sem </b></td>");
    pw.println("<td><input type=text name=sem><br><br></td>");
 pw.println("</tr>");
 pw.println("<tr>");
    pw.println("<td><b>Select your country</b></td>");
    pw.println("<td><select name=country>");
         pw.println(" <option value=0>select</option>");
          
       pw.println(" <option value=india>India</option>");
       pw.println("<option value=others>Others</option>");
       
          pw.println("</select><br><br>");
		  pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
 pw.println(" <td><b>Select your language</b></td>");
  pw.println("<td>");
     pw.println("<select name=language>");
      pw.println("<option value=0>select</option>");
       pw.println("<option value=Android>Android</option>");
       pw.println("<option value=core java>core java</option>");
       pw.println("<option value=Advance java>Advance java</option>");
       pw.println("<option value=C>C</option>");
      pw.println(" <option value=C++>C++</option>");
       pw.println("<option value=Oracle>Oracle</option>");
       pw.println("<option value=mySql>mySql</option>");
       pw.println("<option value=sql>sql</option>");
   pw.println("</select><br><br>");
   pw.println("</td>");
  pw.println("</tr>");
pw.println("<tr>");
  pw.println("<td><b>College</b></td>");
  pw.println("<td><select name=college>");
        pw.println("<option value=JECRC>JECRC</option>");
        pw.println("<option value=SKIT>SKIT</option>");
        pw.println("<option value=GIT>GIT</option>");
        pw.println("<option value=arya>arya</option>");
        pw.println("<option value=Poornima>Poornima</option>");
        pw.println("<option value=VIT>VIT</option>");
        pw.println("<option value=MBM>MBM</option>");
        pw.println("<option value=JECRC>JECRC</option>");
   pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><b>10th %</b></td>");
pw.println("<td><input type=num name=per10></td>");
pw.println("<td><b>Board</b></td>");
pw.println("<td><select name=board1>");
      pw.println("<option value=select>select</option>");
      pw.println("<option value=RBSE>RBSE</option>");
     pw.println(" <option value=CBSE>CBSE</option>");
   pw.println("</select><br><br>");
  pw.println("</td>");
pw.println("</tr>");
pw.println("<tr>");
pw.println("<td><b>12th %</b></td>");
pw.println("<td><input type=num name=per12></td>");
pw.println("<td><b>Board</b></td>");
pw.println("<td><select name=board2>");
     pw.println(" <option value=select>select</option>");
      pw.println("<option value=RBSE>RBSE</option>");
      pw.println("<option value=CBSE>CBSE</option>");
   pw.println("</select>");
  pw.println("</td><br><br>");
pw.println("</tr>");
      
  pw.println("<td><b>Email-ID</b></td>");
  pw.println("<td><input type=text max-length=30 name=email placeholder=xyz@gmail.com > <br><br></td>");
pw.println("</tr>");
pw.println("<tr>");
  pw.println("<td><b>Password</b></td>");
  pw.println("<td><input type=password max-length=30 name=pass title=password must be r at least 8 character long required=true> <br><br></td>");
pw.println("</tr>");

pw.println("<tr>");
  pw.println("<td><b>Re-enter password</b></td>");
  pw.println("<td><input type=password max-length=30 name=repass  required=true><br><br> </td>");
pw.println("</tr>");
pw.println("<tr><td colspan=4><br>");
pw.println("<input type=submit style=\"background-color: white; color:black; width:70px; height:30px;border-radius:10px\"></td></table></form>");
pw.println("<table><tr>");
pw.println("<td><form action=\"Home1\" method=\"Get\">");
pw.println("<input type=submit value=Cancel style=\"background-color: white; color:black; width:70px; height:30px;border-radius:10px\"></form></td>");
pw.println("<td><form action=\"Registration\" method=\"Get\">");
pw.println("<input type=submit value=Reset style=\"background-color: white; color:black; width:70px; height:30px;border-radius:10px\"></form></td>");
pw.println("</tr>");
pw.println("</table>");



pw.println("</fieldset>");
pw.println("</center>");
//pw.println("</form>");
pw.println("</body>");
pw.println("</html>");
}}
