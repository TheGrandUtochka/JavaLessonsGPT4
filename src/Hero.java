public class Hero extends AnimeCharacter{
    private String specialMove;

    public Hero(String name, int powerLevel, String anime, String specialMove) {
        super(name, powerLevel, anime);
        this.specialMove = specialMove;
    }

    public String getSpecialMove() {
        return specialMove;
    }

    public void setSpecialMove(String specialMove) {
        this.specialMove = specialMove;
    }
}
