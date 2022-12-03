package org.tnsindia.springbeans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class StudentDAO {

	private String driver;
	private String URL;
	private String username;
	private String password; 
	
	//generate setters
	
	public void setDriver(String driver) {
		this.driver = driver;
	}



	public void setURL(String URL) {
		URL = URL;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public void selectALLrows() throws ClassNotFoundException, SQLException{
		//load driver
		Class.forName(driver);
		
		//get connection
		Connection c=DriverManager.getConnection(URL, username, password);
		
		//execute a query
		java.sql.Statement s=c.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM m25students.students");
		
		
		while(r.next()) {
			int ID=r.getInt(1);
			String Name=r.getString(2);
			int StudentAge=r.getInt(3);
			String Dept=r.getString(4);
			System.out.println("The below table is for book:");
			System.out.println("ID: "+ID+" "+"Name: "+Name
					+" "+"Age: "+StudentAge+" "+"Depratment: "+Dept);
		}
	}

}
