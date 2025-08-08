package org.example;
import org.example.*;
public class Wizard extends Player{

    private int spell;

    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, spell);
        this.spell = spell;
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Elf convertToElf() {
         Elf wizarElfed = new Elf (getHealth(),getStrength(),getLives(),getSpell());
         return wizarElfed;
    }

}
