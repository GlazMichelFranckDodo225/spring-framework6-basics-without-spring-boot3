package com.dgmf.loosecoupling.classes;

import com.dgmf.loosecoupling.interfaces.UserDataProvider;

public class UserManager {
    private final UserDataProvider userDataProvider;

    public UserManager(UserDataProvider userDataProvider) {
        this.userDataProvider = userDataProvider;
    }

    public String getUserInfo() {
        return userDataProvider.getUserDetails();
    }
}
