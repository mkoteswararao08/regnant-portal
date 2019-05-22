package myemployeeretrivedata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class JDBCoperation {

	public static List<EmployeeprofData> Employeeprofpage (String employeeid){

		List<EmployeeprofData> data = new ArrayList<EmployeeprofData>();

		try {

		Class.forName("com.mysql.jdbc.Driver");

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetimesheet", "root","Kumar@116");
		Statement stm = conn.createStatement(); 

		ResultSet rs = stm.executeQuery("SELECT * FROM employeetimesheet.timesheet_table where employeeid='"+employeeid+"'");

		while(rs.next()) {

			EmployeeprofData dis = new EmployeeprofData();

		dis.employeeid= rs.getString(1);
		dis.employeename=rs.getString(2);
		dis.date=rs.getString(3);
		dis.taskno=rs.getString(4);
		dis.task=rs.getString(5);
		dis.starttime=rs.getString(6);
		dis.endtime=rs.getString(7);
	
		data.add(dis);

		}

		          }
				catch (ClassNotFoundException e1) {
		          
		          System.out.println("Driver Not Found");
		          
		          e1.printStackTrace();
		          }

		          catch (SQLException e) {
		          
		          System.out.println("SQL Exception in ");

		          e.printStackTrace();
		          }

		return data;

		}



}
