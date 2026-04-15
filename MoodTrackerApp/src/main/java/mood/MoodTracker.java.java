package mood;

import java.util.ArrayList;

public class MoodTracker {
    private ArrayList<Mood> moods = new ArrayList<>();

    public void addMood(Mood m) {
        moods.add(m);
    }

    public void showAll() {
        System.out.println("Mood History:");
        for (Mood m : moods) {
            m.display();
        }
    }

    public void showSummary() {
        int happy = 0, sad = 0, neutral = 0;

        for (Mood m : moods) {
            if (m.getFeeling() == MoodType.HAPPY) happy++;
            else if (m.getFeeling() == MoodType.SAD) sad++;
            else neutral++;
        }

        System.out.println("\nMood Summary:");
        System.out.println("Happy: " + happy);
        System.out.println("Sad: " + sad);
        System.out.println("Neutral: " + neutral);
    }
}
