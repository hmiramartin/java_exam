package com.gfa.exam.Restaurant;

public class Manager extends Employee {
    protected int moodLevel = 400;

    public Manager(String name, int experience) {
        this.experience = experience;
        this.name = name;
    }

    public Manager(String name) {
        this.name = name;
    }

    public void work() {
        experience += 1;
        startMeeting();
    }

    public void startMeeting() {
        moodLevel -= experience;
    }
}
