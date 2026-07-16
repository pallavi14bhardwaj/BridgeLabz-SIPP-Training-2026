package mission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MissionManager {
    // Key: Mission Name, Value: List of astronauts on that mission
    private Map<String, List<Astronaut>> missions = new HashMap<>();
    
    // We'll use a HashSet of Strings to track who is already on which mission
    // Storing it as "MissionName_AstronautID" to prevent duplicates easily
    private HashSet<String> assignmentTracker = new HashSet<>();

    // 1. Add new missions
    public void addMission(String missionName) {
        missions.putIfAbsent(missionName, new ArrayList<>());
        System.out.println("Mission '" + missionName + "' initialized.");
    }

    // 2. & 3. Assign astronauts and prevent duplicates
    public void assignAstronaut(String missionName, Astronaut astronaut) {
        // ensure the mission actually exists first
        if (!missions.containsKey(missionName)) {
            System.out.println("Error: Mission '" + missionName + "' does not exist.");
            return;
        }

        // create a unique tracking key for this assignment
        String assignmentKey = missionName + "_" + astronaut.astronautId;

        // HashSet.add returns false if the item was already in the set
        if (assignmentTracker.add(assignmentKey)) {
            // it's a new assignment, add them to the list
            missions.get(missionName).add(astronaut);
            System.out.println("Assigned " + astronaut.name + " to " + missionName);
        } else {
            System.out.println("Hold up! " + astronaut.name + " is already assigned to " + missionName);
        }
    }

    // 4. Display all missions and their crews
    // 5. Show the total number of astronauts per mission
    public void displayMissions() {
        System.out.println("\n--- Space Missions Report ---");
        for (Map.Entry<String, List<Astronaut>> entry : missions.entrySet()) {
            String missionName = entry.getKey();
            List<Astronaut> crew = entry.getValue();
            
            System.out.println("Mission: " + missionName);
            System.out.println("Crew Size: " + crew.size());
            System.out.println("Members: " + crew);
            System.out.println();
        }
        System.out.println("-----------------------------");
    }
}
