package oppsPracticeProblem.polymorphism.AdventureGameCharacterSystem;
class Mage extends GameCharacter {

    Mage(String characterName) {
        super(characterName);
    }

    @Override
    void performAttack() {
        System.out.println(characterName + " casts a fire spell!");
    }
}