package com.dgmf.ioc.loosecoupling.interfaces.impl;

import com.dgmf.ioc.loosecoupling.interfaces.UserDataProvider;

public class WebServiceDataProvider implements UserDataProvider {
    @Override
    public String getUserDetails() {

        return "User Details from WebServiceDataProvider | Loose Coupling - IoC";
    }
}
