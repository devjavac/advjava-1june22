package bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		Student st = new Student();
		st.setId(1);
		st.setName("Abc");
		st.setContact("9879789789");
		st.setEmail("abc@gmail.com");
		// Load a Hibernate Config
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
			session.save(st); // to insert data into Table
			//session.update(Obj);
			//session.delete(obj);
			//session.get(null, args);
		tr.commit();
		session.close();
		
		
	}
}
