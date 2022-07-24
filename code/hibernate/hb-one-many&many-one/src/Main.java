import java.util.List;
import java.util.Set;

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
		
		/*
		EmpInfo info = new EmpInfo();
		info.setEid(5);
		
		EmpEdu e1 = new EmpEdu();
		e1.setTitle("10th");
		e1.setPercent(88.88);
		e1.setPassyear("2000");
		e1.setEmp(info);
		
		EmpEdu e2 = new EmpEdu();
		e2.setTitle("12th");
		e2.setPercent(77.88);
		e2.setPassyear("2002");
		e2.setEmp(info);
		
		EmpEdu e3 = new EmpEdu();
		e3.setTitle("BE");
		e3.setPercent(76.88);
		e3.setPassyear("2006");
		e3.setEmp(info);
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		*/
		
		
		EmpInfo empInfo = s.get(EmpInfo.class, 5);
		System.out.println("Id : " + empInfo.getEid());
		System.out.println("Name : " + empInfo.getName());
		System.out.println("Email : " + empInfo.getEmail());
		System.out.println("Contact : " + empInfo.getContact());
		
		Set<EmpEdu> list = empInfo.getEdu();
		
		for (EmpEdu empEdu : list) {
			System.out.print(empEdu.getEuId() + "\t");
			System.out.print(empEdu.getTitle() + "\t");
			System.out.print(empEdu.getPercent() + "\t");
			System.out.print(empEdu.getPassyear() + "\n");
		}
		
		
		/*EmpEdu edu = s.get(EmpEdu.class, 11);
		
		System.out.println("Edu Id : " + edu.getEuId());
		System.out.println("Title : " + edu.getTitle());
		System.out.println("Percent : " + edu.getPercent());
		System.out.println("Passing Year : " + edu.getPassyear());
		
		System.out.println("Name : " + edu.getEmp().getName());*/
		
		tr.commit();
		s.close();
		
	}
}








