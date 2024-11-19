import java.util.ArrayList;






public class MonsterBook {
    private final ArrayList<Creature> creatures = new ArrayList<>();


    public void addCreature(Creature creature) {
        creatures.add(creature);
    }

    public void listMonsterBook() {
        System.out.println("Creatures in the Monster Book:");
        for (int i = 0; i < creatures.size(); i++) {
            System.out.println(i + 1 + "\n" + creatures.get(i));
        }
    }
}
