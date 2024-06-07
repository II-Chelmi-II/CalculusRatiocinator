package com.michel.calculusratiocinator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Statement {
    private String type;
    private String statement;

    public boolean evaluate() {
        return "truth".equals(type) ? true :
                "lie".equals(type) ? false :
                        jenesaispas();
    }

    private boolean jenesaispas() {
        return false;
    }
}
