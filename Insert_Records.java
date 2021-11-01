import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import java.sql.Statement;

public class Insert_Records
{
public static void main(String args[])
{
try
{
	Connection con = null;

	Driver d = new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	System.out.println("Driver Class Loaded");


	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mulesoft","root","root");
	System.out.println("Connection established");
	Statement stmt1 = con.createStatement();
	Statement stmt2 = con.createStatement();
	Statement stmt3 = con.createStatement();
	String sql1 = "insert into movies values('Baahubali','Prabhas','Anushka','Rajamouli',2017)";
	String sql2 = "insert into movies values('Vakeel Saab','Pawan Kalyan','Hasan','Sriram',2021)";
	String sql3 = "insert into movies values('Pushpa','Arjun','Rashmika','Sukumar',2021)";
    stmt1.executeUpdate(sql1);
    stmt2.executeUpdate(sql2);
    stmt3.executeUpdate(sql3);
    System.out.println("Records inserted successfully...");
	con.close();



	con.close();



}
catch(Exception e)
{
System.out.println(e);
}
}
}