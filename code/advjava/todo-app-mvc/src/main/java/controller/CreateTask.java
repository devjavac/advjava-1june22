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
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String scheduledDate = request.getParameter("sdt");
		
		TaskBean bean = new TaskBean();
		bean.setTitle(title);
		bean.setStatus(status);
		bean.setScheduledOn(scheduledDate);
		
		ToDoModel model = new ToDoModel();
		boolean result = model.saveTasK(bean);
		
		
		if(result) {
			response.sendRedirect("create-task.jsp?code=1");
		}else {
			response.sendRedirect("create-task.jsp?code=0");
		}
		
	}

}
