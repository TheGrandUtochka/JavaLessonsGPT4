import java.util.Objects;

public class JJBACharacters extends AnimeCharacters {
    private String stand;

    public JJBACharacters(String name, int powerLevel, int age, String stand) {
        super(name, powerLevel, age);
        this.stand = stand;
    }

    public String getStand() {
        return stand;
    }

    public void setStand(String stand) {
        this.stand = stand;
    }

    @Override
    public String toString() {
        return "JJBA{" +
                "name='" + getName() + '\'' +
                ", powerLevel=" + getPowerLevel() +
                ", age=" + getAge() +
                ", stand='" + stand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JJBACharacters that = (JJBACharacters) o;
        return Objects.equals(stand, that.stand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stand);
    }
}