import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HqlSqlExecution {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		
		//Query<Student> query = session.createQuery("Query"); //For HQL Query
		//Query<Student> query = session.createNativeQuery("Query"); //For SQL Query
 		
		Query<Student> query = session.createQuery("FROM Student where status=:flg", Student.class);
		query.setBoolean("flg", true);
		//Query<Student> query = session.createNativeQuery("select * from studinfo where status=true", Student.class);
		
		List<Student> list = query.list();
		
		for(Student st : list) {
			System.out.print(st.getName() + "\t");
			System.out.print(st.getEmail() + "\t");
			System.out.print(st.getContact() + "\t");
			System.out.print(st.getDob() + "\n");
		}
		
		
		
		
		tr.commit();
		session.close();
	}
}

// Select all the employee where salary >=30000;









