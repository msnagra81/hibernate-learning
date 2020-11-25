package test.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HibBean hb = new HibBean("New Data using constructor", "Mint");
    	
    	// Whatever data needed to post, use this object
    	EmbeddableTest fullName= new EmbeddableTest("FName", "Test", "LName");
    	hb.setAid(100);
    	hb.setColor("Red");
    	hb.setName("Test Hibernate");
    	hb.setFullName(fullName);
    	
       Configuration conf = new Configuration().configure().addAnnotatedClass(HibBean.class);
       
       SessionFactory sf = conf.buildSessionFactory();
       
       Session session = sf.openSession();
       
       Transaction tr = session.beginTransaction();
       
       session.save(hb);
       
       // This is to post data to db
       
       tr.commit();
       
       // To get data from DB
       
//       hb = session.get(HibBean.class, 1);
       
       System.out.println(hb.toString());
       
    }
}
