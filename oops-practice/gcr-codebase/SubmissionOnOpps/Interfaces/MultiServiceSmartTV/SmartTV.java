package oppsPracticeProblem.Interfaces.MultiServiceSmartTV;
class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming movies...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing games...");
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Inception",
                "Interstellar"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}