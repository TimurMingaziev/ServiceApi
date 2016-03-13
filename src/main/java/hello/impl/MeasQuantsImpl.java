package hello.impl;

import hello.DAO.MeasQuantsDAO;
import hello.model.MeasQuants;
import hello.util.HibernateUtil;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by Switch on 11.03.2016.
 */
public class MeasQuantsImpl implements MeasQuantsDAO {
    
    private Session session = null;
    
    @Override
    public List<MeasQuants> getMQuantInfo(String token, int minMqId, int maxMqId) {
        List<MeasQuants> listMeasQuants = new ArrayList<MeasQuants>();
        try {
            Locale.setDefault(Locale.ENGLISH);
            session = HibernateUtil.getSessionFactory().openSession();
            listMeasQuants = session.createQuery("from MeasQuants").list();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            if(session!=null)
                session.close();
        }
        return listMeasQuants;
    }

    @Override
    public MeasQuants getMQuantInfoById(int id) {
        MeasQuants mqInfo = null;
        try {
            Locale.setDefault(Locale.ENGLISH);
            session = HibernateUtil.getSessionFactory().openSession();
            mqInfo = (MeasQuants)session.createQuery("from MeasQuants where idMq = id");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            if(session!=null)
                session.close();
        }

        return mqInfo;
    }

    @Override
    public int getMaxMQuantsId() {
        return 0;
    }
}
