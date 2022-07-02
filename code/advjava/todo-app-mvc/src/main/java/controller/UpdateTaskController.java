package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.TaskBean;
import model.ToDoModel;

@WebServlet("/update-task")
public class UpdateTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. Get the Id to be edited
		String taskId = request.getParameter("id");
		int id = Integer.parseInt(taskId);
		
		// 2. get the data from the model class 
		ToDoModel model = new ToDoModel();
		TaskBean bean = model.getTaskById(id);
		
		// 3. Set the Task data into request Attribute
		request.setAttribute("taskInfo", bean);
		
		// 4. redirect to Jsp Page
		RequestDispatcher dis = request.getRequestDispatcher("edit-task.jsp");
		dis.forward(request, response);
		
		
	}

	
}





