package com.dataBaseOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.readFile.ReadFile;

public class InsertDataIntoDB {
	private static final String DRIVER_URL = "com.mysql.jdbc.Driver";

	// create connection method
	public Connection getDBConnection(String dbUrl, String userName, String password) {
		Connection dbConnection = null;
		try {
			Class.forName(DRIVER_URL);
			Connection conn = DriverManager.getConnection(dbUrl, userName, password);
			dbConnection = conn;
		} catch (ClassNotFoundException e) {
			System.out.println("Cant able to Find Driver Class from my sql-connector JAR..\n\n ");
		} catch (SQLException e) {
			System.out.println("Failed to get connection of database...\n\n");
		}

		return dbConnection;
	}

	// method to get query
	protected String GetQuery(String[] header, String[] entry) {
		String query = "INSERT INTO game_data".concat("");
		if (null != header && null != entry) {
			String columns = prepareColumnStatement(header);
			String values = prepareValueStatement(entry);
			query = query.concat(columns).concat(" VALUES ").concat(values);
			System.out.println(query);
		} else {
			System.out.println("Please check header and entry arrays..\n\n");
		}
		return query;
	}

	// method to prepare column statement
	protected String prepareColumnStatement(String[] header) {
		String columnStm = "";
		for (int i = 1; i < header.length - 1; i++) {
			columnStm = columnStm.concat(header[i].trim().replace(" ", "")).concat(" , ");
		}
		columnStm = columnStm.concat(header[header.length - 1].trim().replace(" ", ""));
		columnStm = "(".concat(columnStm).concat(")");
		return columnStm;
	}

	// method to prepare values statement
	protected String prepareValueStatement(String[] values) {
		String valuesStm = "";
		for (int i = 1; i < values.length - 1; i++) {
			String val = values[i];
			if (val.trim().length() == 0) {
				val = "";
			}
			valuesStm = valuesStm.concat("\'" + val.trim() + "\'").concat(",");
		}
		valuesStm = valuesStm.concat("\'" + values[values.length - 1].trim() + "\'");
		valuesStm = "(".concat(valuesStm).concat(")");
		return valuesStm;
	}
	
	// method to persist entry int database
	protected void persistEntry(Connection conn ,String query) {
		if(null != conn) {
			try {
				Statement stm = conn.createStatement();
				int affectedrow = stm.executeUpdate(query);
				System.out.println("row affected : " + affectedrow++);
			} catch (SQLException e) {
				System.out.println("Cant able to prepare staement....\n\n");
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("The Connection object is null...\n\n");
		}
	}
	
	// method to persist all entries
	public void persistAll(Connection conn , List <String []> header , List <String []> entries) {
		entries.size();
		for(int i = 0 ;i< entries.size();i++) {
			int index = 0;
			String rowNo = entries.get(i)[index].trim();
			int headerNo = Integer.parseInt(rowNo);
			System.out.println("Header row to persist : " + headerNo);
			switch(headerNo) {
			case 1:
				persistEntry(conn,GetQuery(header.get(0),entries.get(i)));
				break;
			case 2:
				persistEntry(conn,GetQuery(header.get(1),entries.get(i)));
				break;
				
			case 3:
				persistEntry(conn,GetQuery(header.get(2),entries.get(i)));
				break;
				
			case 4:
				persistEntry(conn,GetQuery(header.get(3),entries.get(i)));;
				break;
				
			case 5:
				persistEntry(conn,GetQuery(header.get(4),entries.get(i)));
				break;
			default:
				System.out.println("Cannot able to persist file...\n\n");
				
			}
		}
	}
	
	// method to cast String to datetime
	public static String checkDateFormat(String str) {
		String datetime = null;
		str =str.substring(0, 19);
		System.out.println("date time is : " + str);
		SimpleDateFormat frm = new SimpleDateFormat("yyyy-MM-dd-HH.mm.SS");
		try {
			frm.parse(str);
			System.out.println("correct date..\n\n");
			datetime = str;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return datetime;
	}
	
	public  void insertFileDataIntoDB(String path , String DBURL, String userName, String password) {
		ReadFile newObj = new ReadFile(path);
		newObj.sortFile();
		List<String[]> allHeaders = newObj.getHeaders();
		List <String[]> allEntries = newObj.getEntries();
		InsertDataIntoDB session1 = new InsertDataIntoDB();
		Connection dbconn = session1.getDBConnection(DBURL, userName, password);
		session1.persistAll(dbconn,allHeaders,allEntries);
		try {
			dbconn.close();
			System.out.println("DataBase Connection has been closed...\n\n");
		} catch (SQLException e) {
			System.out.println("Failed to close dataBase Connection...\n\n");
			e.printStackTrace();
		}
	}

}
