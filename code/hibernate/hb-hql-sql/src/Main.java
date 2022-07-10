import java.time.LocalDate;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	
	static SessionFactory sf = getSessionFactory();
	
	public static void main(String[] args) {
		
		printStudent(5);
		
	}
	
	public static void saveData() {
		Student st = new Student();
		st.setName("test1");
		st.setEmail("test1@gmail.com");
		st.setDob( LocalDate.of(2000, 3, 12));
		st.setContact("9876678999");
		st.setStatus(true);
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
			session.save(st);
		tr.commit();
		session.close();
	}
	
	
	public static void printStudent(int id) {
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		
		Student st = s.get(Student.class, id);
		
		System.out.println("Id : " + st.getId());
		System.out.println("Name : " + st.getName());
		System.out.println("Email : " + st.getEmail());
		System.out.println("Contact : " + st.getContact());
		System.out.println("Birth Date : " + st.getDob());
		System.out.println("Status : " + st.isStatus());
		System.out.println("Created On : " + st.getCreateTs());
		System.out.println("Updated On : " + st.getUpdateTs());
		
		tr.commit();
		s.close();
		
	}
	
	
	public static SessionFactory getSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
	}
	
	public static void closeSessionFacotry(SessionFactory sf) {
		sf.close();
	}
	
}



















