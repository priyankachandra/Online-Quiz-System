import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class C extends HttpServlet
{ 
    int count=0;
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException
    { 
        PrintWriter pw=res.getWriter();
		