package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfTest {

    @Test
    void getSpeed() {
        Elf elf = new Elf(1, 2, 2, 2);
        assertEquals(2, elf.getSpeed());
    }

    @Test
    void setSpeed() {
        Elf elf = new Elf(1, 2, 2, 2);
        elf.setSpeed(3);
        assertEquals(3, elf.getSpeed());
    }
}