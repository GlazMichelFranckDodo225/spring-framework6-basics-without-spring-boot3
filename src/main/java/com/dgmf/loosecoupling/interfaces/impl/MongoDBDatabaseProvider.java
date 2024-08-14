package com.dgmf.loosecoupling.interfaces.impl;

import com.dgmf.loosecoupling.interfaces.UserDataProvider;

public class MongoDBDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User Details from MongoDBDatabaseProvider | Loose Coupling";
    }
}
