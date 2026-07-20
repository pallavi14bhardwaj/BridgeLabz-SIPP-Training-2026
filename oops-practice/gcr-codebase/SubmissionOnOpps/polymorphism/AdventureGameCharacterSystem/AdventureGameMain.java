package oppsPracticeProblem.polymorphism.AdventureGameCharacterSystem;

public class AdventureGameMain {

    static void startBattle(GameCharacter[] characters) {
        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("Battle Started!\n");

        for (GameCharacter c : characters) {
            c.performAttack();   // Dynamic Method Dispatch

            if (c instanceof Warrior) {
                warriorCount++;
            } else if (c instanceof Mage) {
                mageCount++;
            } else if (c instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("\nCharacters Participated:");
        System.out.println("Warriors : " + warriorCount);
        System.out.println("Mages    : " + mageCount);
        System.out.println("Archers  : " + archerCount);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = new GameCharacter[5];

        characters[0] = new Warrior("Aragorn");
        characters[1] = new Mage("Gandalf");
        characters[2] = new Archer("Legolas");
        characters[3] = new Warrior("Leon");
        characters[4] = new Archer("Robin");

        startBattle(characters);
    }
}