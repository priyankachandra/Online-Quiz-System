import java.sql.*;
public class DBInfo
{
	static Connection con;
	static
	{ 
	try
	{
	Class.forName("com.mysql.jdbc.Driver");
	}
	 catch(Exception e)
	{
		 e.printStackTrace();
	}
}
	public static Connection getConnection()
	{
		String url="jdbc:mysql://localhost:3306/online_test";
		String uname="root";
		String password="rat";
		  
		
	    try
	    {
	    	con=DriverManager.getConnection(url, uname, password);
	    	
	    }
	    catch(Exception e)
	    {
	       e.printStackTrace();
	    }
	    return con;
	}
	    public static void close()
	    
	    {
	    	try
	    	{
	    		con.close();
	    	}
	    	catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	}


	
	
	
	
	
	


