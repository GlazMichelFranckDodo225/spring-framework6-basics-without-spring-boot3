package com.dgmf.loosecoupling;


import com.dgmf.loosecoupling.classes.UserManager;
import com.dgmf.loosecoupling.interfaces.UserDataProvider;
import com.dgmf.loosecoupling.interfaces.impl.MongoDBDatabaseProvider;
import com.dgmf.loosecoupling.interfaces.impl.UserDatabaseProvider;
import com.dgmf.loosecoupling.interfaces.impl.WebServiceDataProvider;

public class LooseCouplingDriver {
    public static void main(String[] args) {
        UserDataProvider userDatabaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(userDatabaseProvider);

        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceDataProvider = new WebServiceDataProvider();
        UserManager userManagerWithWS = new UserManager(webServiceDataProvider);

        System.out.println(userManagerWithWS.getUserInfo());

        UserDataProvider mongoDatabaseProvider = new MongoDBDatabaseProvider();
        UserManager userManagerWithMongoDB = new UserManager(mongoDatabaseProvider);

        System.out.println(userManagerWithMongoDB.getUserInfo());
    }
}
