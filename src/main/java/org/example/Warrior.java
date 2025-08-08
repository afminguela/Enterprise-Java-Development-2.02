package org.example;
import org.example.Elf;

public class Warrior extends Player {
    private int force;

    public Warrior(int force, int health, int strength,int lives) {
        super(health,strength,lives);
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
    public Elf convertToElf() {
        Elf warriorElfed = new Elf (getHealth(),getStrength(),getLives(),
                getForce());
        return warriorElfed;
    }
}
