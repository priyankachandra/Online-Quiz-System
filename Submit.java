import java.sql.*;
import javax.servlet.http.*;
import java.io.*;
public class Submit extends HttpServlet
{ int crr=0,wrg=0,un=0;
      float per;
	  String s,s1;
	  
  public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException
  {   
      PrintWriter pw=res.getWriter();
	  
							   
					
			     
	      
	   
	  pw.println("<body>");
	  pw.println("<form action=Submit method=post>");
	  pw.println("<button type=submit >Show Result</button>");
	  pw.println("</form>");
	  pw.println("</body>");
	  pw.println("</html>");
	   
	  

	
  }
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException
	{
	  PrintWriter pw=res.getWriter();
	  
	  try
	 {
	    
	    Connection con=DBInfo.getConnection();
		String query="select Correct_ans from android_que";
		PreparedStatement ps=con.prepareStatement(query);
		ResultSet rs=ps.executeQuery();
		
	  while(rs.next())
	  {   
	       s=req.getParameter("option");
		   s1=rs.getString(1);
		  pw.println(s+" "+s1);
		 
		  if(s.equals(s1))
		     crr++;
		  else if(s.equals(null))
		          un++;
				else
                  wrg++;
				   
				  
	  }
	
	  pw.println("Correct answers="+crr);
	  pw.println("wrong answers="+wrg);
	  pw.println("unattempted questions="+un);
	  per=((crr)/(crr+wrg+un))*100;
	  pw.println("Percentage="+per+"%");
	 }
	 catch(Exception e)
	 {
	    e.printStackTrace();
	 }
	  
	  
	  
	}
}