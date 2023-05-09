


package apex.hibernatemapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Laptop lp=new Laptop();
     //  lp.setLid(101);
        lp.setLname("dell");
        
        
        
        Student st=new Student();
     //  st.setRollno(1);
        st.setName("abc");
        st.setMarks(50);
      //  st.setLaptop(lp);
     
        st.getLaptop().add(lp);
     //   lp.getStudent().add(st);
        
        
        
       
     
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Student.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=session.beginTransaction();
        session.save(lp);
        session.save(st);
       
        tx.commit();
       System.out.println(st); 
      //  System.out.println(lp);
        
        
        
        
        
        
    }
}
