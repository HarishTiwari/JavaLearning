package designPatterns.strategyPattern;

public class Main {

    public static void main(String[] args) {
        /*
         * Strategy Pattern Revision Points:
         * ----------------------------------
         * 1. Defines a family of algorithms (strategies), encapsulates each one, and makes them interchangeable.
         * 2. Allows the algorithm to vary independently from clients that use it.
         * 3. Promotes composition over inheritance (behavior can be changed at runtime).
         * 4. Components:
         *    - Strategy Interface (AttackPattern): Declares the contract for all strategies.
         *    - Concrete Strategies (Sword, Kick, Punch, ChokSlam): Implement the interface.
         *    - Context (GameCharacter): Maintains a reference to a strategy and allows changing it.
         * 5. Useful when you have multiple ways of doing something and want to switch between them dynamically.
         * 6. Example: Different attack behaviors in a game character.
         */

        // Create a game character (context)
        GameCharacter mortal = new GameCharacter();

        // Set different attack strategies at runtime
        mortal.setAttackPattern(new Sword()); // Setting Sword attack
        mortal.setAttackPattern(new ChokSlam()); // Changing to ChokSlam
    }
}
