public class Villain extends AnimeCharacter{
    private String evilPlan;

    public Villain(String name, int powerLevel, String anime, String evilPlan) {
        super(name, powerLevel, anime);
        this.evilPlan = evilPlan;
    }

    public String getEvilPlan() {
        return evilPlan;
    }

    public void setEvilPlan(String evilPlan) {
        this.evilPlan = evilPlan;
    }
}
