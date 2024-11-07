public class Monster extends Creature {

    // Monster-specific fields
    private int challengeRating;

    // Constructor
    public Monster(String name, Creature.type creatureType, alignment creatureAlignment, Creature.size creatureSize, Creature.creatureType creatureCategory,
                   int level, int healthPoints, int armorClass, int speed,
                   int challengeRating) {


        super(name, creatureType, creatureAlignment, creatureSize, creatureCategory, level, healthPoints, armorClass, speed);

        // Initialize monster-specific fields
        this.challengeRating = challengeRating;
    }

    public int getChallengeRating() {
        return challengeRating;
    }

    public void setChallengeRating(int challengeRating) {
        this.challengeRating = challengeRating;
    }
}
