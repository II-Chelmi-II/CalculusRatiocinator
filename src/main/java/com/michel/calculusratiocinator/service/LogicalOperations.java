package com.michel.calculusratiocinator.service;

import com.michel.calculusratiocinator.model.Statement;

public class LogicalOperations {
    public static boolean et(Statement s1, Statement s2){
        return s1.evaluate() && s2.evaluate();
    }

    public static boolean ou(Statement s1, Statement s2){
        return s1.evaluate() || s2.evaluate();
    }

    public static boolean donc(Statement s1, Statement s2){
        return !s1.evaluate() || s2.evaluate();
    }
}
