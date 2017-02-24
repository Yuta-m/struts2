/**
 *
 */
package com.internousdev.struts2.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author internous
 *
 */
public class DBConnector {
	private static String driverName="com.mysql.jdbc.Driver";
	private static String url ="jdbc:mesql://localhost/openconnect";
	private static String user="root";
	private static String password="mysql";

	public Connection getConnetion(){
	Connection con =null;
		try{
			Class.forName(driverName);
			con=(Connection) DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch (SQLException e){
			e.printStackTrace();
		}return con;
	}
}

