package BuisnessProjetDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SqlConnection{
	Connection con;
	Statement stmt;
	
	
	public SqlConnection() {
		super();		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jbcd","root","root");  
			this.stmt = con.createStatement();
			
			//Statement stmt = con.createStatement();  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}


	public Statement getStmt() {
		return stmt;
	}
}
