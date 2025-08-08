package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarriorTest  {



    @Test
    void testgetForce() {
        Warrior warrior = new Warrior(1, 2,2,2);
        assertEquals(1, warrior.getForce());
    }

    @Test
    void testsetForce() {
        Warrior warrior = new Warrior(1,2,2,2);
        warrior.setForce(2);
        assertEquals(2,warrior.getForce());
    }

    @Test
    void testconvertToElf(){
        Warrior warrior = new Warrior(1, 2, 2, 2);
        Elf elf = warrior.convertToElf();

        assertTrue(elf instanceof Elf);

    }



}