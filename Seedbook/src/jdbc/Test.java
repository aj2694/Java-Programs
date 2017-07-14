package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
		
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","pluto1234");
				Statement stmt=c.createStatement();
				ResultSet rs=stmt.executeQuery("select*from employeetable");
				while(rs.next()){
					System.out.println(rs.getInt(1)+""+rs.getString(2)+rs.getLong(3));
					
				}
				c.close();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
}
