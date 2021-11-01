import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import java.sql.Statement;

public class CreateDatabase
{
public static void main(String args[])
{
try
{
	Connection con = null;

	Driver d = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	System.out.println("Driver Class Loaded");


	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
	System.out.println("Connection established");
	Statement stmt = con.createStatement();
	String sql = "CREATE DATABASE mulesoft";
    stmt.executeUpdate(sql);
    System.out.println("Database created successfully...");
	con.close();



	con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}