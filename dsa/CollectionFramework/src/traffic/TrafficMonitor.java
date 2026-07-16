package traffic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TrafficMonitor {
    // raw data storage
    private Map<String, Integer> roadData = new HashMap<>();

    // 1. Add or update vehicle counts
    public void updateTraffic(String roadName, int vehicleCount) {
        // if road exists, add to current count, else start fresh
        roadData.put(roadName, roadData.getOrDefault(roadName, 0) + vehicleCount);
        System.out.println("Updated " + roadName + ": added " + vehicleCount + " vehicles.");
    }

    // 2. Display all roads in sorted order using TreeMap
    public void displaySortedTraffic() {
        System.out.println("\n--- Sorted Traffic Data ---");
        // passing our HashMap into a TreeMap sorts the keys automatically!
        TreeMap<String, Integer> sortedData = new TreeMap<>(roadData);
        
        for (Map.Entry<String, Integer> entry : sortedData.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " vehicles");
        }
        System.out.println("---------------------------\n");
    }

    // 3. Identify busiest road
    public void showBusiestRoad() {
        String busiestRoad = null;
        int maxVehicles = -1;

        for (Map.Entry<String, Integer> entry : roadData.entrySet()) {
            if (entry.getValue() > maxVehicles) {
                maxVehicles = entry.getValue();
                busiestRoad = entry.getKey();
            }
        }

        if (busiestRoad != null) {
            System.out.println("Busiest Road Alert: " + busiestRoad + " with " + maxVehicles + " vehicles!");
        } else {
            System.out.println("No traffic data available yet.");
        }
    }

    // 4. Generate report & 5. Show total roads monitored
    public void generateReport() {
        System.out.println("\n===== OFFICIAL TRAFFIC REPORT =====");
        System.out.println("Total roads monitored: " + roadData.size());
        
        for (Map.Entry<String, Integer> entry : roadData.entrySet()) {
            String status = entry.getValue() > 500 ? "HEAVY" : "NORMAL";
            System.out.println(entry.getKey() + " - Count: " + entry.getValue() + " - Status: " + status);
        }
        System.out.println("===================================");
    }
}
