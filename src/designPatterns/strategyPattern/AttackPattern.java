package designPatterns.strategyPattern;

// Strategy interface: defines the contract for all attack strategies
public interface AttackPattern {
    // Method to be implemented by all concrete strategies
    void attack();
}
