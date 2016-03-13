package hello;

/**
 * Created by Switch on 03.03.2016.
 */
import hello.DAO.TypeMqDAO;
import hello.impl.TypeMqImpl;
import hello.model.TypeMq;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

//        TypeMqDAO typeMq = new TypeMqImpl();
//        listTypeMq(typeMq.getInfoAboutAll());
    }
//    private static void listTypeMq(List<TypeMq> typesMq) {
//        System.out.println("");
//        System.out.println("Listing contacts without details:");
//        for (TypeMq typeMq : typesMq) {
//            System.out.println(typeMq);
//            System.out.println();
//        }
//    }

}