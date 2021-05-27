package com.test;

import com.dataBaseOperation.InsertDataIntoDB;

// to rest read file class
public class TestReadFileClass {
	
	private final static String db_URL = "jdbc:mysql://localhost:3306/game_data_warehouse";
	private final static  String userName2 = "root";
	private final static String password1 = "sql$bham123";
	private final static String FILE_PATH = "E:\\JAVA\\WORK_SPACE\\GameDataBaseModule\\src\\Bussiness_Requirement\\gamefilesmall.csv";
	private final static String FILE_2 = "E:\\JAVA\\WORK_SPACE\\GameDataBaseModule\\src\\Bussiness_Requirement\\gamefile.csv";

	public static void main(String[] args) {
		new InsertDataIntoDB().insertFileDataIntoDB(FILE_PATH,db_URL,userName2,password1);
	}

	
	
	
}
