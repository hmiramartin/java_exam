package com.gfa.exam.Restaurant;

public class Waiter extends Employee {
    protected int tips = 0;

    public Waiter(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public Waiter(String name) {
        this.name = name;
    }

    public void work() {
        tips += 1;
        experience += 1;
    }
}
