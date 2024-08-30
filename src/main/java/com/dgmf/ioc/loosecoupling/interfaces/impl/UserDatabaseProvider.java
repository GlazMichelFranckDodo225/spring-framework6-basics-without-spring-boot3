package com.dgmf.ioc.loosecoupling.interfaces.impl;

import com.dgmf.ioc.loosecoupling.interfaces.UserDataProvider;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        // Direct Access to DB
        return "User Details from UserDatabaseProvider | Loose Coupling - IoC";
    }
}
