public class Subject {
    private String name;
    private int difficulty; // 1 (easy) to 5 (hard)

    public Subject(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public String getName() { return name; }
    public int getDifficulty() { return difficulty; }
}
