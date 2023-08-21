package com.juaracoding.utils;

public enum TestCases {
    T1("Login With Invalid Username Test"),
    T2("Login With Empty Username Test"),
    T3("Login With Empty Password Test"),
    T4("Login Valid Test");
    private String testCaseName;
    TestCases(String value){

        testCaseName = value;
    }

    public String getTestCaseName(){

        return testCaseName;
    }
}
