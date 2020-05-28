package coreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnectivity {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		String url = "jdbc:postgresql://127.0.0.1:54225/browser//mohanlal?user=postgres&password=April2019@&ssl=true";
		
		Connection con = DriverManager.getConnection(url);
		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("Select * from filmography");
		
		while(rs.next())
		{
			String film = rs.getString("name");
			String year = rs.getString("year");
			String director = rs.getString("director");
			
			System.out.println(film);
			System.out.println(year);
			System.out.println(director);
		}
		


	}

}
