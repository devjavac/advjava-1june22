package bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HbTest {
	public static void main(String[] args) {
		
		Product p1 = new Product(); // transient State Object
		p1.setId(1);
		p1.setName("A");
		p1.setPrice(11.22);
		p1.setQuantity(2);
		
		Product p2 = new Product(); // transient State Object
		p2.setId(2);
		p2.setName("B");
		p2.setPrice(22.33);
		p2.setQuantity(10);
		
		Product p3 = new Product(); // transient State Object
		p3.setId(3);
		p3.setName("C");
		p3.setPrice(123.123);
		p3.setQuantity(1);
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
			/*session.save(p1); // Persistent State Object
			session.save(p2); // Persistent State Object
			session.save(p3); // Persistent State Object
			*/
		
		//=======update Product===========
		/*Product updateProduct = new Product(); // transient State Object
		updateProduct.setId(2);
		updateProduct.setName("B");
		updateProduct.setPrice(22.33);
		updateProduct.setQuantity(5);
		
		session.update(updateProduct);*/
		
		//========Delete Record============
		/*Product deleteProduct = new Product();
		deleteProduct.setId(2);
		session.delete(deleteProduct);*/
		
		//========get Product By Id============
		
		Product pro = session.get(Product.class, 3);
		System.out.println("Id : " + pro.getId());
		System.out.println("Name : " + pro.getName());
		System.out.println("Price : " + pro.getPrice());
		System.out.println("Quantity : " + pro.getQuantity());
		
		
		tr.commit();
		session.close();
		sf.close();
		
		
	}
}

/*
 * Insert Data :- session.save(obj)
 * Update Data :- session.update(obj)
 * Delete Data :- session.delete(obj)
 * Select Data :- session.get(EntityClass, PK-Value)
 */





























