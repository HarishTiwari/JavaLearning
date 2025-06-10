package designPatterns.strategyPattern;

// Concrete strategy: Implements AttackPattern for Kick attack
public class Kick implements AttackPattern{
    @Override
    public void attack() {
        System.out.println("Kick attack...");
    }
}
