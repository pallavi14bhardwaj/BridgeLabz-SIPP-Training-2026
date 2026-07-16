package playlist;

import java.util.LinkedList;

public class PlaylistEngine {
    // we use a LinkedList because we need to frequently add to the beginning 
    // and remove from the end, which is very fast with a linked list.
    private LinkedList<String> recentSongs = new LinkedList<>();
    private final int MAX_HISTORY = 10;

    // 1. Add newly played songs to the top
    // 2. & 3. Keep only 10 songs, remove the oldest if it exceeds
    public void playSong(String songName) {
        // if the song is already in the history, we might want to remove it 
        // first so it moves to the top, but let's just stick to the basic requirement
        // of adding to the top.
        recentSongs.addFirst(songName);
        System.out.println("Now playing: " + songName);

        // trim the history if it gets too long
        if (recentSongs.size() > MAX_HISTORY) {
            String removed = recentSongs.removeLast();
            System.out.println("(History full: removed oldest song '" + removed + "')");
        }
    }

    // 4. Search for a song in the recently played history
    public void searchSong(String songName) {
        if (recentSongs.contains(songName)) {
            System.out.println("Yep, '" + songName + "' is in your recent history.");
        } else {
            System.out.println("Nope, couldn't find '" + songName + "' in the history.");
        }
    }

    // 5. Display the complete list of recently played songs in order
    public void showHistory() {
        System.out.println("\n--- Recently Played History ---");
        if (recentSongs.isEmpty()) {
            System.out.println("History is empty. Play some music!");
        } else {
            int rank = 1;
            for (String song : recentSongs) {
                System.out.println(rank + ". " + song);
                rank++;
            }
        }
        System.out.println("-------------------------------\n");
    }
}
