package designPatterns.strategyPattern;

// Concrete strategy: Implements AttackPattern for Punch attack
public class Punch implements AttackPattern{

    @Override
    public void attack() {
        System.out.println("Punch attack...");
    }
}
