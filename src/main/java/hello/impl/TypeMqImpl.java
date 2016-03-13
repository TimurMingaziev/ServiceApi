package hello.impl;
import hello.DAO.*;
import hello.model.TypeMq;
import hello.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Switch on 11.03.2016.
 */

@Transactional
@Repository(value="typeMqDAO")
public class TypeMqImpl implements TypeMqDAO {

    private SessionFactory sessionFactory;

    @Override
    public List<TypeMq> getInfoAboutAll(String token, int minMqId, int maxMqId) {
        Session session = null;
        List<TypeMq> listTypes = new ArrayList<TypeMq>();
        try {
            Locale.setDefault(Locale.ENGLISH);
            session = HibernateUtil.getSessionFactory().openSession();
            listTypes = session.createQuery("from TypeMq").list();

//            System.out.println(sessionFactory.getCurrentSession().toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return  listTypes;
    }

    @Override
    public TypeMq getInfoById(TypeMq id) {

        return null;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }


    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
