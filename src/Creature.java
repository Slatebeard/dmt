public abstract class Creature {

    public enum type {
        NPC,
        MONSTER,
        PLAYER,
        NAMED_CHARACTER,
        GOD;
    }


    public enum allignment {
        LAWFUL_GOOD,
        NEUTRAL_GOOD,
        CHAOTIC_GOOD,
        LAWFUL_NEUTRAL,
        TRUE_NEUTRAL,
        CHAOTIC_NEUTRAL,
        LAWFUL_EVIL,
        NEUTRAL_EVIL,
        CHAOTIC_EVIL;
    }


    public enum size {
        TINY,
        SMALL,
        MEDIUM,
        LARGE,
        HUGE,
        GARGANTUAN;
    }


    public enum creatureType {
        ABERRATION,
        BEAST,
        CELESTIAL,
        CONSTRUCT,
        DRAGON,
        ELEMENTAL,
        FEY,
        FIEND,
        GIANT,
        HUMANOID,
        MONSTROSITY,
        OOZE,
        PLANT,
        UNDEAD;
    }

    // Fields
    private Creature.type creatureType;
    private Creature.allignment creatureAlignment;
    private Creature.size creatureSize;
    private Creature.creatureType creatureCategory;

    private String name;
    private int level;
    private int healthPoints;
    private int armorClass;
    private int speed;



    // Constructor
    public Creature(String name, Creature.type creatureType, Creature.allignment creatureAlignment, Creature.size creatureSize, Creature.creatureType creatureCategory,
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
