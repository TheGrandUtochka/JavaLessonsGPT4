public class Main {
    public static void main(String[] args) {
        AnimeCharacter character1 = new AnimeCharacter("Jotaro Kujo", 9000, "JoJo's Bizarre Adventure");
        AnimeCharacter character2 = new AnimeCharacter("Killua Zoldyck", 10000, "Hunter x Hunter");
        AnimeCharacter character3 = new AnimeCharacter("Denji", 4444, "Chainsaw Man");
        character3.setPowerLevel(1111);
        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);
    }
}
