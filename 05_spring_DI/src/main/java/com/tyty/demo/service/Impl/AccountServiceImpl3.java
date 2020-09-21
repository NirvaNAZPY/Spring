package com.tyty.demo.service.Impl;

import com.tyty.demo.service.AccountService;

import java.util.*;

/**
 * Created by TYTY on 2020/9/17 20:42
 */

public class AccountServiceImpl3 implements AccountService{

    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    @Override
    public void saveAccount() {
        System.out.println("{\"AccountServiceImpl3\":{"
                + "\"myStrs\":"
                + Arrays.toString(myStrs)
                + ",\"myList\":"
                + myList
                + ",\"mySet\":"
                + mySet
                + ",\"myMap\":"
                + myMap
                + ",\"myProps\":"
                + myProps
                + "}}");
    }
}
