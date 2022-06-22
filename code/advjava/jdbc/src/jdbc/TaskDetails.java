package jdbc;

import java.util.ArrayList;

public class TaskDetails {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Task1");
		list.add("Task2");
		list.add("Task3");
		list.add("Task4");
		list.add("Task5");
		list.add("Task6");
		
		
		for(String task : list) 
		{
			System.out.println(task);
		}
		
	}
}
