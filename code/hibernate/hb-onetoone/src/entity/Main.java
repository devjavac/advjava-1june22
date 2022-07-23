package entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		EmpInfo e1 = new EmpInfo();
		e1.setName("B");
		e1.setContact("7700998877");
		e1.setEmail("B@gmail.com");
		
		EmpAdd a1 = new  EmpAdd();
		a1.setCity("Mumbai");
		a1.setPincode("998899");
		a1.setState("MH");
		a1.setEmp(e1);
	
		//s.save(a1);
		
		/*
		 * EmpInfo deleteEmp = new EmpInfo(); deleteEmp.setEid(9); s.delete(deleteEmp);
		 */
		
		
		EmpAdd empAdd = s.get(EmpAdd.class, 8);
		
		System.out.println("Id : " + empAdd.getEmp().getEid());
		System.out.println("Name : " + empAdd.getEmp().getName());
		System.out.println("Email : " + empAdd.getEmp().getEmail());
		System.out.println("Contact : " + empAdd.getEmp().getContact());
		System.out.println("City : " + empAdd.getCity());
		
		tr.commit();
		s.close();
		
	}
}




