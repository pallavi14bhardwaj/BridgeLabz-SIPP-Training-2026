package oppsPracticeProblem.polymorphism.AdventureGameCharacterSystem;
class GameCharacter {
    String characterName;

    GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    void performAttack() {
        System.out.println(characterName + " attacks.");
    }
}