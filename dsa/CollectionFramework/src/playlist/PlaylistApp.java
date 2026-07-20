package playlist;

public class PlaylistApp {
    public static void main(String[] args) {
        PlaylistEngine engine = new PlaylistEngine();

        // let's play a bunch of songs to test the 10-song limit
        engine.playSong("Bohemian Rhapsody");
        engine.playSong("Hotel California");
        engine.playSong("Shape of You");
        engine.playSong("Blinding Lights");
        engine.playSong("Rolling in the Deep");
        engine.playSong("Uptown Funk");
        engine.playSong("Smells Like Teen Spirit");
        engine.playSong("Sweet Child O' Mine");
        engine.playSong("Billie Jean");
        engine.playSong("Imagine");
        
        // this one should push "Bohemian Rhapsody" out
        engine.playSong("Hey Jude");

        engine.showHistory();

        // check if search works
        engine.searchSong("Blinding Lights");
        engine.searchSong("Bohemian Rhapsody"); // shouldn't be there anymore
    }
}
