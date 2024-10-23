public abstract class Creature {

    private String name;

    private enum type {
        NPC,
        MONSTER,
        PLAYER,
        NAMED_CHARACTER,
        GOD,

    }

    private enum allignment {
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

    private enum size {
        TINY,
        SMALL,
        MEDIUM,
        LARGE,
        HUGE,
        GARGANTUAN;
    }

    private enum creatureType {
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

    private int level;

    private int healthPoints;

    private int armorClass;

    private int speed;


}
