package designPatterns.strategyPattern;

// Factory class to get the appropriate AttackPattern strategy
public class AttackFactory {

    // Returns an AttackPattern based on the attack type string
    public static AttackPattern getAttack(String attack){
        if(attack.equals("Sword")){
            return new Sword();
        }
        // You can add more strategies here (e.g., "Kick", "Punch", etc.)
        return null;
    }
}
