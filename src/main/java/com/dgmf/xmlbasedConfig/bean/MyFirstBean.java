package com.dgmf.xmlbasedConfig.bean;

public class MyFirstBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void ShowMessage() {
        System.out.println("Message : " + message);
    }

    @Override
    public String toString() {
        return "MyFirstBean : {" +
                "message='" + message + '\'' +
                '}';
    }
}
