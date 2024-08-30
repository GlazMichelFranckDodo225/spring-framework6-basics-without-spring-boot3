package com.dgmf.ioc.loosecoupling.interfaces.impl;

import com.dgmf.ioc.loosecoupling.interfaces.UserDataProvider;

public class MongoDBDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User Details from MongoDBDatabaseProvider | Loose Coupling - IoC";
    }
}
