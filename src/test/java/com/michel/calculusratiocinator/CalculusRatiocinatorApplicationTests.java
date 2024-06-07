package com.michel.calculusratiocinator;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.michel.calculusratiocinator.model.Statement;
import com.michel.calculusratiocinator.service.LogicalOperations;

@SpringBootTest
class CalculusRatiocinatorApplicationTests {

    @Test
    void lou_est_pauvre_et_lou_est_genereux() {
        Statement s1 = new Statement("lie", "Lou est pauvre");
        Statement s2 = new Statement("normal", "Lou est généreux");
        boolean result = LogicalOperations.and(s1, s2);
        assertEquals(false, result);
    }

    @Test
    void lou_est_beau_donc_lou_est_pauvre() {
        Statement s1 = new Statement("truth", "Lou est beau");
        Statement s2 = new Statement("lie", "Lou est pauvre");
        boolean result = LogicalOperations.implies(s1, s2);
        assertEquals(false, result);
    }

    @Test
    void lou_est_pauvre_donc_lou_est_genereux() {
        Statement s1 = new Statement("lie", "Lou est pauvre");
        Statement s2 = new Statement("normal", "Lou est généreux");
        boolean result = LogicalOperations.implies(s1, s2);
        assertEquals(true, result);
    }

    @Test
    void lou_est_beau_ou_lou_est_genereux_donc_lou_est_pauvre() {
        Statement s1 = new Statement("truth", "Lou est beau ou Lou est généreux");
        Statement s2 = new Statement("lie", "Lou est pauvre");
        boolean result = LogicalOperations.implies(s1, s2);
        assertEquals(false, result);
    }

    @Test
    void lou_est_pauvre_ou_lou_est_genereux() {
        Statement s1 = new Statement("lie", "Lou est pauvre");
        Statement s2 = new Statement("normal", "Lou est généreux");
        boolean result = LogicalOperations.or(s1, s2);
        assertEquals(false, result);
    }
}