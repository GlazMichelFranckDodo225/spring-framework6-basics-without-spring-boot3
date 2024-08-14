package com.dgmf.loosecoupling.interfaces.impl;

import com.dgmf.loosecoupling.interfaces.UserDataProvider;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {
        return "User Details from WebServiceDataProvider | Loose Coupling";
    }
}
