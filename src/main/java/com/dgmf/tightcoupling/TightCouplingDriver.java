package com.dgmf.tightcoupling;

public class TightCouplingDriver {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        System.out.println(userManager.getUserInfo());
    }
}
