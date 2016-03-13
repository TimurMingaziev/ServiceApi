package hello.DAO;

import hello.model.TypeMq;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Switch on 11.03.2016.
 */

public interface TypeMqDAO {

    List<TypeMq> getInfoAboutAll(String token, int minMqId, int maxMqId);
    TypeMq getInfoById(TypeMq id);

}
