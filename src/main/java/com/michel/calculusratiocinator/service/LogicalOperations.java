package com.michel.calculusratiocinator.service;

import com.michel.calculusratiocinator.model.Statement;

public class LogicalOperations {
    public static boolean and(Statement s1, Statement s2){
        return s1.evaluate() && s2.evaluate();
    }

    public static boolean or(Statement s1, Statement s2){
        return s1.evaluate() || s2.evaluate();
    }

    public static boolean implies(Statement s1, Statement s2){
        return !s1.evaluate() || s2.evaluate();
    }
}
