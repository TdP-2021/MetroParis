package it.polito.tdp.metroparis.db;

import java.sql.Connection;

public class TestDAO {

	public static void main(String[] args) {
		
		try {
			Connection connection = DBConnect.getConnection();
			connection.close();
			System.out.println("Connection Test PASSED");
			
			MetroDAO dao = new MetroDAO() ;
			
			System.out.println(dao.getAllFermate()) ;
			System.out.println(dao.getAllLinee()) ;

		} catch (Exception e) {
			throw new RuntimeException("Test FAILED", e);
		}
	}

}
