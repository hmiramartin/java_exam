package com.gfa.exam.Restaurant;

import java.util.HashMap;
public class Chef extends Employee {
    protected HashMap<String, Integer> meals;

    public Chef(String name) {
        this.meals = new HashMap<>();
        this.name = name;
    }

    public Chef(String name, int experience) {
        this.meals = new HashMap<>();
        this.name = name;
        this.experience = experience;
    }

    public void work() {
        experience += 1;
    }

    public void cook(String mealName) {
        if (meals.containsKey(mealName)) {
            meals.put(mealName, meals.get(mealName) + 1);
        } else {
            meals.put(mealName, 1);
        }
    }

}
