package mood;

public class Main {
    public static void main(String[] args) {

        AppInfo.show();

        MoodTracker tracker = new MoodTracker();

        tracker.addMood(new Mood("Monday", MoodType.HAPPY));
        tracker.addMood(new Mood("Tuesday", MoodType.SAD));
        tracker.addMood(new Mood("Wednesday", MoodType.HAPPY));
        tracker.addMood(new Mood("Thursday", MoodType.NEUTRAL));
        tracker.addMood(new Mood("Friday", MoodType.HAPPY));

        tracker.showAll();
        tracker.showSummary();
    }
}
