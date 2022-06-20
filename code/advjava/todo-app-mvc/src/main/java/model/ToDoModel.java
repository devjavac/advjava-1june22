package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import bean.TaskBean;

public class ToDoModel {

	public boolean saveTasK(TaskBean bean) {
		boolean result = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava1june","root","root");
			PreparedStatement stmt = con.prepareStatement("insert into task(title,status,scheduledOn) values(?,?,?)");
			stmt.setString(1, bean.getTitle());
			stmt.setString(2, bean.getStatus());
			stmt.setString(3, bean.getScheduledOn());
			int count = stmt.executeUpdate();
			if(count>0) {
				result = true;
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
