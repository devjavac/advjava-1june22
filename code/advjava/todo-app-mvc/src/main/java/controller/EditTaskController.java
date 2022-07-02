package controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.TaskBean;
import model.ToDoModel;
import model.ToDoModel;

@WebServlet("/edit-task")
public class EditTaskController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String status = request.getParameter("status");
		String scheduled = request.getParameter("sdt");
		
		SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
		String updateDate = simpleFormat.format(new Date());
		
		TaskBean dto = new TaskBean();
		dto.setId(Integer.parseInt(id));
		dto.setTitle(title);
		dto.setStatus(status);
		dto.setScheduledOn(scheduled);
		dto.setUpdatedOn(updateDate);
		
		ToDoModel model = new ToDoModel();
		boolean result = model.updateTask(dto);
		request.setAttribute("taskInfo", dto);
		if(result) {
			RequestDispatcher dis = request.getRequestDispatcher("edit-task.jsp?code=1");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis = request.getRequestDispatcher("edit-task.jsp?code=0");
			dis.forward(request, response);
		}
		
		
	}

}
