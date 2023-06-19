// File: Chicken.java
package rikkei.academy.animals;

import rikkei.academy.edible.IEdible;

public class Chicken extends Animal implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
