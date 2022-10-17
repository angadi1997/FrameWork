package Vtiger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ReadDataSql {
	
	public static void main(String[] args) throws Throwable   {
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qspider","root","root");
	Statement stat = conn.createStatement();
	String selectQuery = "select *from student";
	 ResultSet result = stat.executeQuery(selectQuery);
	while(result.next());
	{
		System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4));
		
	}
	conn.close();
	
		

}
}
