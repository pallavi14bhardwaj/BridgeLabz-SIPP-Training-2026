package mission;

public class MissionApp {
    public static void main(String[] args) {
        MissionManager manager = new MissionManager();

        Astronaut a1 = new Astronaut("A01", "Neil Armstrong", "Commander");
        Astronaut a2 = new Astronaut("A02", "Buzz Aldrin", "Lunar Module Pilot");
        Astronaut a3 = new Astronaut("A03", "Michael Collins", "Command Module Pilot");
        Astronaut a4 = new Astronaut("A04", "Sally Ride", "Mission Specialist");

        manager.addMission("Apollo 11");
        manager.addMission("STS-7");

        // assign crew to Apollo 11
        manager.assignAstronaut("Apollo 11", a1);
        manager.assignAstronaut("Apollo 11", a2);
        manager.assignAstronaut("Apollo 11", a3);

        // assign crew to STS-7
        manager.assignAstronaut("STS-7", a4);

        // try to assign Neil Armstrong to Apollo 11 again to test duplicate prevention
        manager.assignAstronaut("Apollo 11", a1);

        // display everything
        manager.displayMissions();
    }
}
