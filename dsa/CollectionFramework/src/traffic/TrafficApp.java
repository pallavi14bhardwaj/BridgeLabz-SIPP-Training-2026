package traffic;

public class TrafficApp {
    public static void main(String[] args) {
        TrafficMonitor monitor = new TrafficMonitor();

        // recording some initial traffic
        monitor.updateTraffic("Main Street", 350);
        monitor.updateTraffic("Highway 1", 800);
        monitor.updateTraffic("Elm Street", 120);
        monitor.updateTraffic("Broadway", 600);

        // getting another update later in the day
        monitor.updateTraffic("Elm Street", 50);

        // display sorted data
        monitor.displaySortedTraffic();

        // find the busiest road
        monitor.showBusiestRoad();

        // print the official report
        monitor.generateReport();
    }
}
