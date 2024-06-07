package com.michel.calculusratiocinator.controller;

import com.michel.calculusratiocinator.model.Statement;
import com.michel.calculusratiocinator.service.LogicalOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatementController {

    @GetMapping("/evaluate")
    public String evaluate(
            @RequestParam("statement1") String statement1,
            @RequestParam("type1") String type1,
            @RequestParam("statement2") String statement2,
            @RequestParam("type2") String type2,
            @RequestParam("operation") String operation
    ) {
        Statement s1 = new Statement(statement1, type1);
        Statement s2 = new Statement(statement2, type2);
        boolean result;

        switch (operation.toLowerCase()) {
            case "et":
                result = LogicalOperations.et(s1, s2);
                break;
            case "ou":
                result = LogicalOperations.ou(s1, s2);
                break;
            case "donc":
                result = LogicalOperations.donc(s1, s2);
                break;
            default:
                return "Invalid operation";
        }
        return "Result: " + result;
    }
}
