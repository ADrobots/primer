import com.fasterxml.classmate.AnnotationConfiguration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder().configure().build();
        SessionFactory sessionFactory = new MetadataSources(registry)
                .addAnnotatedClass(Primer.class)
                .buildMetadata().buildSessionFactory();
        Primer primer1=new Primer();
        primer1.first_name="aab";
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(primer1);
        transaction.commit();
        session.close();




    }

}
