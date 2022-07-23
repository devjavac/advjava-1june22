import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestMain {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure("hibernate.cfg.xml");
		SessionFactory sf = conf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tr = se.beginTransaction();
		
		//==========SQL Approach=========
		//String sqlQuery = "select * from contact_info where contact like '99%'";
		//Query<PhBook> sqlQry = se.createNativeQuery(sqlQuery, PhBook.class);
		//List<PhBook> contactList = sqlQry.list();
		
		//==========HQL Approach=========
		String hqlquery = "from PhBook where contact like '99%'";
		Query<PhBook> hqlQry = se.createQuery(hqlquery);
		List<PhBook> contactList = hqlQry.list();
		// hqlQry.executeUpdate(); // to execute Update or Delete HQL query
		
		for(PhBook p : contactList) {
			System.out.print(p.getId() + "\t");
			System.out.print(p.getName() + "\t");
			System.out.print(p.getContact() + "\t");
			System.out.print(p.getEmail() + "\n");
		}
		
		String hqlDeleteQuery = "delete from PhBook where contact like '99%'";
		Query<PhBook> hqlDeleteQry = se.createQuery(hqlDeleteQuery);
		int count = hqlDeleteQry.executeUpdate();
		System.out.println(count + " : rows deleted...");
		
		
		
		
		/*
		 * Scanner scan = new Scanner(System.in); for(int i = 1 ; i<=4 ; i++) { PhBook
		 * ph1 = new PhBook(); ph1.setName(scan.next()); ph1.setContact(scan.next());
		 * ph1.setEmail(scan.next()); se.save(ph1); } scan.close();
		 */
		tr.commit();
		se.close();
		
	}
}








