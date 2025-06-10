package designPatterns.strategyPattern;

// Context class: uses an AttackPattern strategy
public class GameCharacter {

    // Reference to the current attack strategy
    AttackPattern attackPattern;

    // Allows changing the attack strategy at runtime
    public void setAttackPattern(AttackPattern attackPattern){
        this.attackPattern = attackPattern;
    }

    // Executes the current attack strategy
    public void attack(){
        attackPattern.attack();
    }
}
