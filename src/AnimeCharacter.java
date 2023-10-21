import java.util.Objects;

public class AnimeCharacter {
    private String name;
    private int powerLevel;

    public AnimeCharacter(String name, int powerLevel) {
        this.name = name;
        this.powerLevel = powerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AnimeCharacter animeCharacter = (AnimeCharacter) o;
        return powerLevel == animeCharacter.powerLevel && Objects.equals(name, animeCharacter.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, powerLevel);
    }
}
