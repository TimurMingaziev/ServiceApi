package hello;

/**
 * Created by Switch on 03.03.2016.
 */

import hello.DAO.MeasQuantsDAO;
import hello.DAO.TypeMqDAO;
import hello.impl.MeasQuantsImpl;
import hello.impl.TypeMqImpl;
import hello.model.*;
import io.spring.guides.gs_producing_web_service.*;
import io.spring.guides.gs_producing_web_service.MeasQuants;
import io.spring.guides.gs_producing_web_service.TypeMq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint //регистрирует класс Spring WS как потенциальный кандидат для обработки входящих SOAP сообщений
public class ApplicationEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";
    private static final Logger LOG = LoggerFactory.getLogger("logfile");

    //@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest")
    // используется Spring WS для выбора метода
    // обработчика на основе namespace и localPart сообщения.

    // @ResponsePayload //указывает на то, что входящее сообщение будет сопоставлено параметру request метода
    //создает соответствующее значение возвращаемому
    // значению полезной части ответа.


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTypeMQListRequest")
    @ResponsePayload
    public GetTypeMQListResponce getTypeMQList(@RequestPayload GetTypeMQListRequest request){
        long timeout= System.currentTimeMillis();
        GetTypeMQListResponce responce = null;
        LOG.info("respons getTypeMQListRequest");
       // Logger log = LoggerFactory.getLogger(ApplicationEndpoint.class);
        //log.info("respons getTypeMQListRequest");
        try {
            responce = new GetTypeMQListResponce();
            TypeMqDAO typeMq = new TypeMqImpl();

            responce.getListTypeMq().addAll(typeMq.getInfoAboutAll(request.getToken(), request.getMinMqId(), request.getMaxMqId()));
            LOG.info("success");
        }
        catch (Exception ex){LOG.error("Error response");}
        finally {
            LOG.info("getTypeMQListRequest finished for "
                    + Long.toString(System.currentTimeMillis() - timeout) + " millisecond(s)");
            return responce;
        }
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMQuantInfoRequest")
    @ResponsePayload
    public GetMQuantInfoResponce getMQuantInfo(@RequestPayload GetMQuantInfoRequest request){

        GetMQuantInfoResponce responce = new GetMQuantInfoResponce();
        MeasQuantsDAO measQuantsDAO = new MeasQuantsImpl();

        responce.getListMeasQuants().addAll(measQuantsDAO.getMQuantInfo(request.getToken(),request.getMinMqId(),request.getMaxMqId()));
        return responce;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getMQuantInfoByIdRequest")
    @ResponsePayload
    public  GetMQuantInfoByIdResponce getMQuantInfoById(@RequestPayload GetMQuantInfoByIdRequest request){
        GetMQuantInfoByIdResponce responce = new GetMQuantInfoByIdResponce();
        MeasQuantsDAO measQuantsDAO = new MeasQuantsImpl();

        responce.setMqInfo((measQuantsDAO.getMQuantInfoById(request.getId())));
        return responce ;
    }
}