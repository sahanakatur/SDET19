package QuerryPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {
		
	public static void main(String[] args) throws SQLException {
		Connection con=null;
		try {
		  //Step 1:Register the database
		  Driver driverref = new Driver();
		  DriverManager.registerDriver(driverref);
		  
		  //Step 2: establish connection with database
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customers", "root", "root");
		  
		  //Step3: Issue create statement
		  Statement stat = con.createStatement();
		  
		  //Step 4: Execute any query
		  int result = stat.executeUpdate("insert into customer values('3','Sahana','Vinay','Bangalore');");
		  if(result==1)
		  {
		   System.out.println("project is successfully created");
		  }
		  else
		  {
		   System.out.println("query failed");
		  }
		}
		  catch(Exception e) {
		  }
		  		  
		  finally
		  {
			  //Step 5:Close database connection
		  con.close();
		  System.out.println("connection is closed");
		  }
		 }


	}


