package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest  {

    @Test
    void testGetHealth() {
        Warrior warrior =new Warrior(1,1,1,1);
        assertEquals(1,warrior.getHealth());
    }

    @Test
    void testGetStrength() {
        Warrior warrior =new Warrior(1,1,1,1);
        assertEquals(1,warrior.getHealth());

    }

    @Test
    void testGetLives() {
        Warrior warrior =new Warrior(1,1,1,1);
        assertEquals(1,warrior.getLives());
    }

    @Test
    void testSetLives() {
        Warrior warrior =new Warrior(1,1,1,1);
        warrior.setLives(2);
        assertEquals(2,warrior.getLives());
    }

    @Test
    void testSetStrength() {
        Warrior warrior =new Warrior(1,1,1,1);
        warrior.setStrength(2);
        assertEquals(2,warrior.getStrength());
    }

    @Test
    void testSetHealth() {
        Warrior warrior =new Warrior(1,1,1,1);
        warrior.setHealth(2);
        assertEquals(2,warrior.getHealth());
    }

    @Test
    void testDecrementLive() {
        Warrior warrior =new Warrior(1,1,1,3);
        warrior.decrementLive();
        assertEquals(2,warrior.getLives());
    }

    @Test
    void testDecrementLive2() {
        Warrior warrior =new Warrior(1,1,1,1);
        warrior.decrementLive();
        assertEquals(0,warrior.getLives());
    }



    @Test
    void testAttack() {
        Warrior warrior =new Warrior(1,1,1,1);
        Warrior warrior2 =new Warrior(1,1,1,1);
        warrior.attack(warrior2);
        assertEquals(0,warrior.getHealth());

    }

    @Test
    void testCheckHealth() {
        Warrior warrior =new Warrior(1,0,1,1);
        warrior.checkHealth();
        assertEquals(0,warrior.getLives());
    }
}