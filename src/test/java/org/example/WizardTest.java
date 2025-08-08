package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WizardTest {

    @Test
    void testgetForce() {
        Wizard wizar = new Wizard(1, 2, 2, 2);
        assertEquals(2, wizar.getSpell());
    }

    @Test
    void testsetSpell() {
        Wizard wizar = new Wizard(1, 2, 2, 2);
        wizar.setSpell(3);
        assertEquals(3, wizar.getSpell());
    }

    @Test
    void testconvertToElf() {
        Wizard wizar = new Wizard(1, 2, 2, 2);
        Elf elf = wizar.convertToElf();

        assertTrue(elf instanceof Elf);

    }

}
