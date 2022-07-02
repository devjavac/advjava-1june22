package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.TaskBean;
import model.ToDoModel;


@WebServlet("/new-task")
public class CreateTask extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. Get The data
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String scheduledDate = request.getParameter("sdt");
		
		// 2. Set Data into Bean class
		TaskBean bean = new TaskBean();
		bean.setTitle(title);
		bean.setStatus(status);
		bean.setScheduledOn(scheduledDate);
		
		// 3. create Object of Model class 
		ToDoModel model = new ToDoModel();
		
		//4. Call Save Method And get the result
		boolean result = model.saveTasK(bean);
		
		
		if(result) {
			response.sendRedirect("create-task.jsp?code=1");
		}else {
			response.sendRedirect("create-task.jsp?code=0");
		}
		
	}

}
