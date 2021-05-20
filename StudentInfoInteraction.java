package dataBaseInteraction;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;
import java.util.HashSet;
// code to create student database connection and iteract with it to get info
public class StudentInfoInteraction {
	private static String JDBC_URL = "com.mysql.jdbc.Driver";
	private static String USER_NAME = "root";
	private static String PASSWORD = "sql$bham123";
	private static String DATABASE_URL = "jdbc:mysql://localhost:3306/studentinfo";
	
	enum dataBaseColumns{
		id , first_name , last_name , grade;
	}
	// method to get connection 
	public static Connection getSQLConnection(String userName , String password) {
		Connection datBaseConnection = null;
		try{
			Class.forName(JDBC_URL);
			Connection sqlConnection = DriverManager.getConnection(DATABASE_URL, userName, password);
			datBaseConnection = sqlConnection;
		}
		catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
		}
		
		if(datBaseConnection != null) {
			System.out.println("Connection to the DataBase has Established....\n\n");
		}
		else {
			System.out.println("Connection to DataBase has Failed....\n\n");
		}
		
		return datBaseConnection;
	}
	
	// method to get all students info
	public static void getEntries(Connection conn) throws SQLException {
		String query = "SELECT * FROM student";
		Statement stm = conn.createStatement();
		ResultSet results = stm.executeQuery(query);
		
		while(results.next()) {
		System.out.println("id : " + results.getInt(1) + "\t\tFirst Name : " + results.getString(2) + "\t\tLast Name : " +
		results.getString(3) + "\t\tGrades :" + results.getString(4));	
		}
		
		
	}
	
	// method to insert data into the data-base
	public static  int insertStudentInfo( StudentsPOJO student ,Connection conn) throws SQLException {
		PreparedStatement stm = conn.prepareStatement("INSERT INTO student (id , first_name , last_name , grade) VALUES (? , ?, ?, ?)");
		stm.setInt(1, student.getstudentId());
		stm.setString(2, student.getstudentsFirstName());
		stm.setString(3, student.getstudentsLastName());
		stm.setString(4 , student.getstudentsGrade());
		
		int affectedRows = stm.executeUpdate();
		return affectedRows;
	}
	
	// method to search student on id
	public static StudentsPOJO getStudentById(Connection conn , int Id) throws SQLException {
		String query = "SELECT * FROM student WHERE id = ".concat(String.valueOf(Id));
		StudentsPOJO student1 = new StudentsPOJO();
		Statement stm = conn.createStatement();
		ResultSet result = stm.executeQuery(query);
		
		while(result.next()) {
			
			student1.setstudentId(result.getInt(1));
			student1.setstudentsFirstName(result.getString(2));
			student1.setstudentsLastName(result.getString(3));
			student1.setstudentsGrade(result.getString(4));
			
		}
		return student1;
	}
	
	//method to search student on firstname or lastname or grade
	public static Set<StudentsPOJO> getStudentByInfo(Connection conn ,dataBaseColumns column, String info )  throws SQLException{
		String query = "SELECT * FROM student WHERE ".concat(column.toString()).concat(" = ").concat("\'" + info +"\'");
		Statement stm = conn.createStatement();
		ResultSet results = stm.executeQuery(query);
		Set<StudentsPOJO> studentsSet = new HashSet<>();
		
		while(results.next()) {
			StudentsPOJO student1 = new StudentsPOJO();
			student1.setstudentId(results.getInt(1));
			student1.setstudentsFirstName(results.getString(2));
			student1.setstudentsLastName(results.getString(3));
			student1.setstudentsGrade(results.getString(4));
			
			studentsSet.add(student1);
			
		}
		return studentsSet;
	}
	
	
	// method to update last_name using id
	public static int updateStudentInfo(Connection conn , int id , String newData ) throws SQLException {
		String query = "UPDATE student SET last_name = ? WHERE id = ?";
		PreparedStatement stm = conn.prepareStatement(query);
		stm.setString(1, newData);
		stm.setInt(2, id);
		System.out.println(query);
		int affectedRow = stm.executeUpdate();
		return affectedRow;
	}
	
	// method to delete entry on id
	public static int deleteEntry(Connection conn , int id ) throws SQLException {
		String query = "DELETE FROM student WHERE id = ?";
		PreparedStatement stm = conn.prepareStatement(query);
		stm.setInt(1, id);
		int affectedRow = stm.executeUpdate();
		return affectedRow;
	}
	
	// method to print result
	public static void printResult(int i) {
		if(i >0) {
			System.out.println("Query fired successfuly...\n\n ");
		}
		else {
			System.out.println("Query failed...\n\n ");
		}
	}
	
	//method to close dataBaseConnection
	public static void closeConnection(Connection conn) {
		try {
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\nData base connection has been cloed....");
	}
	
	
	
	public static void main(String[] args) throws SQLException {
		Connection databaseConn = getSQLConnection(USER_NAME , PASSWORD);
		
		// enter data into the database
		
		/*	StudentsPOJO student1 = new StudentsPOJO(5, "tony", "stark", "B");
		int result = insertStudentInfo(student1 , databaseConn);
		printResult(result);
		*/
	
		// get student on id
		/*	StudentsPOJO stuObj = getStudentById(databaseConn , 3);
		System.out.println(stuObj.toString());
		*/
		
		// get student on info
//		System.out.println(getStudentByInfo(databaseConn , dataBaseColumns.first_name , "akshay"));
		
		// update info
//		int result = updateStudentInfo(databaseConn,2, "powar");
//		printResult(result);
		
		// delete info 
		
		int result = deleteEntry(databaseConn ,5 );
		printResult(result);
		closeConnection(databaseConn);
		

		
	}

}
