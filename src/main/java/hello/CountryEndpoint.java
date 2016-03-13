package hello;

/**
 * Created by Switch on 03.03.2016.
 */

import hello.DAO.TypeMqDAO;
import hello.impl.TypeMqImpl;
import hello.model.*;
import io.spring.guides.gs_producing_web_service.*;
import io.spring.guides.gs_producing_web_service.TypeMq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint //регистрирует класс Spring WS как потенциальный кандидат для обработки входящих SOAP сообщений
public class CountryEndpoint {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

    private CountryRepository countryRepository;

    @Autowired
    public CountryEndpoint(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCountryRequest") //используется Spring WS для выбора метода
                                                               // обработчика на основе namespace и localPart сообщения
    @ResponsePayload //указывает на то, что входящее сообщение будет сопоставлено параметру request метода
    public GetCountryResponse getCountry(@RequestPayload GetCountryRequest request)  //создает соответствующее значение возвращаемому
                                                                                    // значению полезной части ответа.
    {
        GetCountryResponse response = new GetCountryResponse();
        response.setCountry(countryRepository.findCountry(request.getName()));

        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTypeMQListRequest")
    @ResponsePayload
    public GetTypeMQListResponce getTypeMQList(@RequestPayload GetTypeMQListRequest request){
        GetTypeMQListResponce responce = new GetTypeMQListResponce();
        TypeMqDAO typeMq = new TypeMqImpl();

        responce.getListTypeMq().addAll(typeMq.getInfoAboutAll(request.getToken(),request.getMinMqId(),request.getMaxMqId()));
        return responce;
    }

}