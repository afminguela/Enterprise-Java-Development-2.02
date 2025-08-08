package org.example;

public abstract class Player {

    private int health;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        this.health = health;
        this.strength = strength;
        this.lives = lives;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void decrementLive(){
        setLives(lives-1);
        setHealth(health);
        if (getLives() <=0){
            System.out.print("OH NO!!!, This character is DEAD!!!");
        }

    }

    public void attack (Player playerToAttack){
        this.setHealth(this.health - playerToAttack.strength);
    }

    public void checkHealth(){
        if (this.health <= 0){
            this.decrementLive();
        }
    }

}
