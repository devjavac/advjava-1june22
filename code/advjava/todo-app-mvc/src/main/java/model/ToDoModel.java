package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

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
			/*SimpleDateFormat sdFormat = new SimpleDateFormat("dd-mm-yyyy");
			stmt.setDate(1, new Date(sdFormat.parse(bean.getScheduledOn()).getTime()));
			stmt.setString(3, bean.getScheduledOn());*/
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
	
	
	public List<TaskBean> getAllTask() {
		ArrayList<TaskBean> taskList = new ArrayList<TaskBean>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava1june","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from task");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				TaskBean obj = new TaskBean();
				obj.setId(rs.getInt("id"));
				obj.setTitle(rs.getString("title"));
				obj.setStatus(rs.getString("status"));
				obj.setScheduledOn(rs.getString("scheduledOn"));
				obj.setUpdatedOn(rs.getString("updatedOn"));
				taskList.add(obj);
			}
			rs.close();
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return taskList;
	}
	
	public TaskBean getTaskById(int id) {
		TaskBean bean = new TaskBean();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava1june","root","root");
			PreparedStatement stmt = con.prepareStatement("select * from task where id=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if(rs.next()) {
				bean.setId(rs.getInt("id"));
				bean.setTitle(rs.getString("title"));
				bean.setStatus(rs.getString("status"));
				bean.setScheduledOn(rs.getString("scheduledOn"));
				bean.setUpdatedOn(rs.getString("updatedOn"));
			}
			rs.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	
	
	
	
	public boolean updateTask(TaskBean bean) {
		boolean result = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava1june","root","root");
			PreparedStatement stmt = con.prepareStatement("update task set title=? ,status=?,scheduledOn=?,updatedOn=? where id=?");
			stmt.setString(1, bean.getTitle());
			stmt.setString(2, bean.getStatus());
			stmt.setString(3, bean.getScheduledOn());
			stmt.setString(4, bean.getUpdatedOn());
			stmt.setInt(5, bean.getId());
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
