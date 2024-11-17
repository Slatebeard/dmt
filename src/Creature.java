public abstract class Creature {

    public enum type {
        Npc,
        Monster,
        Player,
        Named_Character,
        God;

        @Override
        public String toString() {
            return name().replace("_", " ");
        }
    }


    public enum alignment {
        Lawful_Good,
        Neutral_Good,
        Chaotic_Good,
        Lawful_Neutral,
        True_Neutral,
        Chaotic_Neutral,
        Lawful_Evil,
        Neutral_Evil,
        Chaotic_Evil;
        
        @Override
        public String toString() {
            return name().replace("_", " ");
        }

    }


    public enum size {
        Tiny,
        Small,
        Medium,
        Large,
        Huge,
        Gargantuan;
        
        @Override
        public String toString() {
            return name().replace("_", " ");
        }

    }


    public enum creatureType {
        Aberration,
        Beast,
        Celestial,
        Construct,
        Dragon,
        Elemental,
        Fey,
        Fiend,
        Giant,
        Humanoid,
        Monstrosity,
        Ooze,
        Plant,
        Undead;

        @Override
        public String toString() {
            return name().replace("_", " ");
        }

    }

    // Fields
    private Creature.type creatureType;
    private alignment creatureAlignment;
    private Creature.size creatureSize;
    private Creature.creatureType creatureCategory;

    private String name;
    private int level;
    private int healthPoints;
    private int armorClass;
    private int speed;



    // Constructor
    public Creature(String name, Creature.type creatureType, alignment creatureAlignment, Creature.size creatureSize, Creature.creatureType creatureCategory,
                    int level, int healthPoints, int armorClass, int speed) {
        this.name = name;
        this.creatureType = creatureType;
        this.creatureAlignment = creatureAlignment;
        this.creatureSize = creatureSize;
        this.creatureCategory = creatureCategory;
        this.level = level;
        this.healthPoints = healthPoints;
        this.armorClass = armorClass;
        this.speed = speed;
    }
}




























