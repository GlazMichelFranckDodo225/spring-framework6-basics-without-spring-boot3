package com.dgmf.loosecoupling.interfaces.impl;

import com.dgmf.loosecoupling.interfaces.UserDataProvider;

public class UserDatabaseProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        // Direct Access to DB
        return "User Details from UserDatabaseProvider | Loose Coupling";
    }
}
