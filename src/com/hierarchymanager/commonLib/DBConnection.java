package com.hierarchymanager.commonLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;


public class DBConnection 
{
	@Test
		
		//public ResultSet connectTodb(String connString , String name , String pass , String queryString) throws ClassNotFoundException, SQLException
	public void connectTodb() throws SQLException
		{
			try
				{
				 
					Class.forName("oracle.jdbc.driver.OracleDriver");
					System.out.println("Oracle JDBC Driver Registered!");
					String dbURL = "jdbc:oracle:thin:@//oicrpt_tdb.dev.qintra.com:1536/oicrpt_t";
					Connection con = DriverManager.getConnection(dbURL, "DATAMART_UPDATER", "datamartupdater_2");
					System.out.println("Connection created");
						
						Statement stMnt = con.createStatement();
						ResultSet rs = stMnt.executeQuery("select * from RPT_CONFIG");
						while(rs.next()) {
			                System.out.print(rs.getInt(1) + "\t");
			                System.out.println(rs.getString(2));
			            }
						System.out.println("Query Is Executed");
	 
				} 
			catch (ClassNotFoundException e) 
				{
	 
					System.out.println(" Oracle JDBC Driver Not Found");
					e.printStackTrace();
	 
				}
			
					
				//return rs;
		}

}


