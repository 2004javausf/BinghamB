package com.revature.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.revature.beans.Student;
import com.revature.dao.StudentDAO;
import com.revature.util.ConnFactory;

public class StudentDAOImp implements StudentDAO{
	public static ConnFactory cf = ConnFactory.getInstance();

	//staement is a terrible thing to use
	//SQL injection is dangerous because it can inject sequences you don't plan for, Name "DROP TABLE"
	@Override
	public void insertStudent(int id, String name, int sch_id) throws SQLException {
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		String sql = "INSERT INTO STUDENT VALUES(" + id + ", '" + name + "'," + sch_id + ")"; //dont add the semicolon to the end of the sql query
		stmt.executeUpdate(sql);
	}

	@Override
	public List<Student> getStudentList() throws SQLException {
		List<Student> studentList = new ArrayList<>();
		Connection conn = cf.getConnection();
		Statement stmt = conn.createStatement();
		String sql  = "SELECT * FROM STUDENT";
		ResultSet rs = stmt.executeQuery(sql);
		Student s = null; //create a dummy object
		while(rs.next()) {
			s = new Student(rs.getInt(1),rs.getString(2),rs.getInt(3));
			studentList.add(s);
		}
		//SQL is not 0 indexed; 
		return studentList;
	}

}
