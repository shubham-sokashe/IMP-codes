package EmployeeDatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import employeeInfoManage.EmpAddress;
import employeeInfoManage.EmployeeInfo;

public class GetDetailsFromDataBase {

	private static final String MY_SQL_URL = "com.mysql.jdbc.Driver";

	// method to get database connection
	public Connection getDatabaseConnection(String databaseURL, String username, String password)
			throws ClassNotFoundException, SQLException {
		Connection databaseCon = null;
		Class.forName(MY_SQL_URL);
		Connection conn = DriverManager.getConnection(databaseURL, username, password);
		databaseCon = conn;
		if (databaseCon != null)
			System.out.println("DataBase Connection established successfully....\n\n");
		else
			System.out.println("DataBase Connection failed....\n\n");

		return databaseCon;
	}

	// method to add employee details into the database
	public int addEmpDetails(Connection dbConn, EmployeeInfo emp) throws SQLException {
		int rowsAffected = 0;

		PreparedStatement sqlStmInfo = dbConn
				.prepareStatement("INSERT INTO employeeinfo (emp_id , emp_name) VALUES (?,?)");
		PreparedStatement sqlStmAdd = dbConn.prepareStatement(
				"INSERT INTO empaddress (emp_bname , emp_state , emp_country , emp_id , emp_zip) VALUES (?,?,?,?,?)");
		sqlStmInfo.setInt(1, emp.getEmpId());
		sqlStmInfo.setString(2, emp.getEmpName());

		sqlStmAdd.setString(1, emp.getEmpAddress().getBuildingName());
		sqlStmAdd.setString(2, emp.getEmpAddress().getState());
		sqlStmAdd.setString(3, emp.getEmpAddress().getCountry());
		sqlStmAdd.setInt(4, emp.getEmpId());
		sqlStmAdd.setInt(5, emp.getEmpAddress().getPinCode());
		rowsAffected = sqlStmInfo.executeUpdate() + sqlStmAdd.executeUpdate();
		return rowsAffected;
	}

	// method to print result
	public void printResult(int rows) {
		if (rows > 0) {
			System.out.printf("Query Executed successfully..\t  Total Number of Rows affected :  %d", rows);
		}

	}

	// method to get all the details of employee
	public Set<EmployeeInfo> getAllEmpInfo(Connection conn ) throws SQLException {

		String query = "SELECT employeeinfo.emp_id , employeeinfo.emp_name , empaddress.emp_bname , empaddress.emp_state , empaddress.emp_country , empaddress.emp_zip FROM employeeinfo INNER JOIN empaddress ON employeeinfo.emp_id = empaddress.emp_id";
		Statement stm = conn.createStatement();
		ResultSet info = stm.executeQuery(query);
		Set<EmployeeInfo> empSet = new HashSet<>();
		while (info.next()) {
			EmployeeInfo empObj = new EmployeeInfo();
			EmpAddress empAddObj = new EmpAddress();

			empObj.setEmpId(info.getInt("emp_id"));
			empObj.setEmpName(info.getString("emp_name"));

			empAddObj.setBuildingName(info.getString("emp_bname"));
			empAddObj.setState(info.getString("emp_state"));
			empAddObj.setCountry(info.getString("emp_country"));
			empAddObj.setPinCode(info.getInt("emp_zip"));
			empObj.setEmpAddress(empAddObj);

			empSet.add(empObj);
		}
		return empSet;
		

	}
	
	// method to get employee from specific country 
	public Set<EmployeeInfo> getEmpOnCOuntry(Connection conn, String country) throws SQLException {
		String query = "SELECT employeeinfo.emp_id , employeeinfo.emp_name , empaddress.emp_country FROM employeeinfo INNER JOIN empaddress ON employeeinfo.emp_id = empaddress.emp_id WHERE emp_country = \'".concat(country).concat("\'");
		Statement stm = conn.createStatement();
		ResultSet info = stm.executeQuery(query);
		Set<EmployeeInfo> empSet = new HashSet<>();
		while (info.next()) {
			EmployeeInfo empObj = new EmployeeInfo();
			EmpAddress empAddObj = new EmpAddress();

			empObj.setEmpId(info.getInt("emp_id"));
			empObj.setEmpName(info.getString("emp_name"));

			empAddObj.setBuildingName("NA");
			empAddObj.setState("NA");
			empAddObj.setCountry(info.getString("emp_country"));
			empAddObj.setPinCode(0);
			empObj.setEmpAddress(empAddObj);

			empSet.add(empObj);
		}
		return empSet;
	}
	
	
	// method to update country name  by employee name
	public int updateCountry(Connection conn , String empName, String country) throws SQLException{
		String query = "UPDATE empaddress INNER JOIN employeeinfo ON empaddress.emp_id = employeeinfo.emp_id SET emp_country = \'".concat(country).concat("\'").concat("WHERE emp_name = \'").concat(empName).concat("\'");
		Statement stm = conn.createStatement();
		int rowAffected = stm.executeUpdate(query);
		return rowAffected;
	}
	
	

}
