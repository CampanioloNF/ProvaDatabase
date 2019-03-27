package it.polito.tdp.provadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.polito.tdp.provadb.db.DizionarioDAO;

public class Main {
	
	
	
	public void run() {
		
		String parola = "gattto"; // immaginiamo che provenga da txtParola.getText()
		
		DizionarioDAO dao = new DizionarioDAO() ;
		
		if(dao.esisteParola(parola)) 
			System.out.format("La parola %s esiste\n", parola) ;
		else
			System.out.format("La parola %s non esiste\n", parola) ;
		
	}

	public static void main(String[] args) {
		Main test = new Main() ;
		test.run() ;
	}

}
