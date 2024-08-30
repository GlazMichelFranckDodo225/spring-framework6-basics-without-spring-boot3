package com.dgmf.ioc.loosecoupling;


import com.dgmf.ioc.loosecoupling.classes.UserManager;
import com.dgmf.ioc.loosecoupling.interfaces.UserDataProvider;
import com.dgmf.ioc.loosecoupling.interfaces.impl.MongoDBDatabaseProvider;
import com.dgmf.ioc.loosecoupling.interfaces.impl.UserDatabaseProvider;
import com.dgmf.ioc.loosecoupling.interfaces.impl.WebServiceDataProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCLooseCouplingDriver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "application.IoC.LooseCouplig.xml"
        );

        // UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        // UserManager userManagerWithDB = new UserManager(userDatabaseProvider);
        UserManager userManagerWithDB = (UserManager) context.getBean(
                    "userManagerWithUserDatabaseProvider"
        );

        System.out.println(userManagerWithDB.getUserInfo());
        System.out.println("==========");

        // UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
        // UserManager userManagerWithWS = new UserManager(webServiceDataProvider);
        UserManager userManagerWithWithwebServiceDataProvider =
                (UserManager) context.getBean(
                    "userManagerWithMongoDBDatabaseProvider"
        );

        System.out.println(userManagerWithWithwebServiceDataProvider.getUserInfo());
        System.out.println("==========");

        // UserDataProvider mongoDatabaseProvider = new MongoDBDatabaseProvider();
        // UserManager userManagerWithMongoDB = new UserManager(mongoDatabaseProvider);
         UserManager userManagerWithWebServiceDataProvider =
                 (UserManager) context.getBean(
                         "userManagerWithWebServiceDataProvider"
         );

        System.out.println(userManagerWithWebServiceDataProvider.getUserInfo());
    }
}
