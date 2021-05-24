package employeeInfoManage;

import java.sql.Connection;
import java.sql.SQLException;

import EmployeeDatabaseConnection.GetDetailsFromDataBase;

public class StoreEmpDetails {
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/employeemanagement";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "sql$bham123";
	
	public static void main(String[] args) {
		EmployeeInfo employee1 = new EmployeeInfo(1,"Shubham" , "LakeVista" ,"Maharashtra" , "India" , 416115 );
		EmployeeInfo employee2 = new EmployeeInfo(2, "akshay" , "BlueSprings" , "Kerala" , "India" , 600018);
		EmployeeInfo employee3 = new EmployeeInfo(3, "john" , "OrientTower" , "Manhatten" , "USA" ,10001 );
		EmployeeInfo employee4 = new EmployeeInfo(4, "adolf" , "FedralTower","Berlin","Germany",2001);
		EmployeeInfo employee5 = new EmployeeInfo(5,"Max" , "145B" , "Queens" , "USA" ,10001);
		
		
		GetDetailsFromDataBase empDBConnect = new GetDetailsFromDataBase();
		
		try {
			Connection dataBaseConn = empDBConnect.getDatabaseConnection(DATABASE_URL,USER_NAME, PASSWORD);
//			int result = empDBConnect.addEmpDetails(dataBaseConn, employee5);
//			empDBConnect.printResult(result);
//			System.out.println("info:\n"+ empDBConnect.getAllEmpInfo(dataBaseConn));
//			System.out.println("emloyee's from india : \n" + empDBConnect.getEmpOnCOuntry(dataBaseConn ,"USA"));
			int result = empDBConnect.updateCountry(dataBaseConn, "john", "USA");
			empDBConnect.printResult(result);
			dataBaseConn.close();
			System.out.println("DataBase Connection closed...");
		}
		catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	

}
