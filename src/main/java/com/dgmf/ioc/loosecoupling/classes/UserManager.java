package com.dgmf.ioc.loosecoupling.classes;

import com.dgmf.ioc.loosecoupling.interfaces.UserDataProvider;

public class UserManager {
    private final UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return userDataProvider.getUserDetails();
    }
}
