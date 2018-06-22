

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DoTryPojo {
	public static void main(String[] args) {
		/*TryPojo e1 = new TryPojo(10,"John1","Pune",10000);
		TryPojo e2 = new TryPojo(12,"John2","Pune",20000);
		TryPojo e3 = new TryPojo(13,"John3","Mumbai",30000);
		*/
		TryPojo t1=new TryPojo(01,"ggg","yygy",65454);
		/*t1.setEmpId(10);
		t1.setAddress("pune");
		t1.setEmpName("suraj");
		t1.setSalary(201558);
		*/
		/*Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure("/hibernate.cfg.xml").buildSessionFactory();
		Session session = sessionFactory.openSession();
		Criteria cr = session.createCriteria(Employee.class);
		Query query =session.createSQLQuery("");
		*/
		
		Session session= new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Transaction tr = session.beginTransaction();
		session.save(t1);
		//session.save(e2);
		//session.save(e3);
		session.flush();
		tr.commit();
		session.close();
		
		//TryPojo dbEmp = session.get(TryPojo.class,10);
		
		
	}	
}
