package com.juaracoding.utils;

public enum TestCases {
    T1("Login Valid Test"),
    T2("Login With Invalid Username Test"),
    T3("Login With Empty Username Test"),
    T4("Login With Empty Password Test"),
    T5("Add New Vacancies");

    private String testCaseName;
    TestCases(String value){

        testCaseName = value;
    }

    public String getTestCaseName(){

        return testCaseName;
    }
}
