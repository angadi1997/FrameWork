package Vtiger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDatanonSQL {
public static void main(String[] args) throws Throwable {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider","root","root");
	Statement stat = conn.createStatement();
	String query = "insert into student(first_name,last_name,address)values('manu','arya','india')";
	int result = stat.executeUpdate(query);
	if(result==1)
	{
		System.out.println("user is created");
		
	}
	else
	{
		System.out.println("user is not created");
	}
	conn.close();
	
	
}
	
}
