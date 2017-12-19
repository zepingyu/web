import com.pojo.StudentEntity;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
/**
 * Created by yzp on 17-12-18.
 */
public class HibernateSessionFactory {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            configuration.addClass(StudentEntity.class);

            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            session.beginTransaction();
            StudentEntity entity = session.load(StudentEntity.class, 2);
            //只有在使用对象时，它才发出查询SQL语句，加载对象。
            System.out.println("Student.Name=" + entity.getName());
            //因为此的user为persistent状态，所以数据库进行同步
            entity.setName("342401199209081211");
            session.getTransaction().commit();
        } catch (Exception e) {
            Transaction transaction = session.getTransaction();
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}