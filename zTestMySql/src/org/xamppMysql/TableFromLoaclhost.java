package org.xamppMysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TableFromLoaclhost {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//	List<String> list = new ArrayList<String>() ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://root@localhost/sample1");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM table1");
		while (resultSet.next()) {
			
			
		//	String stringTemp = resultSet.getString(1);
			
		//	list.add(stringTemp);
			System.out.println( resultSet.getString(1)	+ " - "+ resultSet.getString(2)+" - " + resultSet.getString(3) );
			
		}
		
	//	System.out.println(list);
	}

	
}
