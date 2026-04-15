package mood;

public class Mood {
    private String day;
    private MoodType feeling;

    public Mood(String day, MoodType feeling) {
        this.day = day;
        this.feeling = feeling;
    }

    public MoodType getFeeling() {
        return feeling;
    }

    public void display() {
        System.out.println(day + " -> " + feeling);
    }
}
