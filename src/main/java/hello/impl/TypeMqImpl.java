package hello.impl;
import hello.Application;
import hello.DAO.*;
import hello.model.TypeMq;
import hello.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/**
 * Created by Switch on 11.03.2016.
 */

@Transactional
@Repository(value="typeMqDAO")
public class TypeMqImpl implements TypeMqDAO {

//    private SessionFactory sessionFactory;
    private Session session = null;



    @Override
    public List<TypeMq> getInfoAboutAll(String token, int minMqId, int maxMqId) {

        List<TypeMq> listTypes = new ArrayList<TypeMq>();
        try {
            Locale.setDefault(Locale.ENGLISH);
            session = HibernateUtil.getSessionFactory().openSession();
            listTypes = session.createQuery("from TypeMq").list();

            ApplicationContext app = new AnnotationConfigApplicationContext(Application.class);
            StringRedisTemplate template = app.getBean(StringRedisTemplate.class);
            CountDownLatch latch = app.getBean(CountDownLatch.class);
            template.opsForValue().set("test:1:int",Integer.toString(listTypes.size()));
            template.convertAndSend("chat", "Hello from Redis!");
            latch.await();
//            System.out.println(sessionFactory.getCurrentSession().toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            if(session!=null)
                session.close();
        }
        return listTypes;
    }

    @Override
    public TypeMq getInfoById(TypeMq id) {
//        TypeMq typeInfo = null;
//        try {
//            Locale.setDefault(Locale.ENGLISH);
//            session = HibernateUtil.getSessionFactory().openSession();
//            typeInfo = (TypeMq)session.createQuery("from TypeMq where idTypeMq = id");
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        finally {
//            if(session!=null)
//                session.close();
//        }
        return null;
    }

//    public SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//
//    public void setSessionFactory(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
}
