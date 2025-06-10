package designPatterns.strategyPattern;

// Concrete strategy: Implements AttackPattern for ChokSlam attack
public class ChokSlam implements AttackPattern{
    @Override
    public void attack() {
        System.out.println("Choke slam...");
    }
}
