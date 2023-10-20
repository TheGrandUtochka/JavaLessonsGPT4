public class AnimeCharacter {
    private String name;
    private int powerLevel;
    private int age;

    public AnimeCharacter(String name, int powerLevel, int age) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnimeCharacter{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                ", age=" + age +
                '}';
    }
}
