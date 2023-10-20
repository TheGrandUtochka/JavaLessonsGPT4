public class JJBACharacter extends AnimeCharacter{
    private String stand;

    public JJBACharacter(String name, int powerLevel, int age, String stand) {
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
        return "JJBA STARDUST CRUSADERS Characters{" +
                "name='" + getName() + '\'' +
                ", powerLevel=" + getPowerLevel() +
                ", age=" + getAge() +
                ", stand='" + stand + '\'' +
                '}';
    }
}
