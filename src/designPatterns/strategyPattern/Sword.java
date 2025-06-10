package designPatterns.strategyPattern;

// Concrete strategy: Implements AttackPattern for Sword attack
public class Sword implements AttackPattern{

    private String coverName;

    // Constructor with custom cover name
    Sword(String coverName){
        this.coverName = coverName;
    }

    // Default constructor
    Sword(){
        this.coverName = "default";
    }

    @Override
    public void attack() {
        System.out.println("Sword attack...");
    }

}
