package hello.DAO;

import hello.model.MeasQuants;

import java.util.List;

/**
 * Created by Switch on 11.03.2016.
 */
public interface MeasQuantsDAO {
    MeasQuants getMQuantInfoById(int id);
    List<MeasQuants> getMQuantInfo(String token, int minMqId, int maxMqId);
    int getMaxMQuantsId();

}
