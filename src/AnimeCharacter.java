public class AnimeCharacter {
    private String name;
    private int powerLevel;
    private String anime;

    public AnimeCharacter(String name, int powerLevel, String anime) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.anime = anime;
    }

    public String getName() {
        return name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String getAnime() {
        return anime;
    }

    @Override
    public String toString() {
        return "AnimeCharacter{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                ", anime='" + anime + '\'' +
                '}';
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }
}
