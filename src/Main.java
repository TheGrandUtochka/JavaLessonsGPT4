import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<AnimeCharacter>> animeCharacters = new HashMap<>();

        addAnime(animeCharacters, "Jojo's Bizzare Adventure STARDUST CRUSADERS",
                new AnimeCharacter("Jotaro Kujo", 9000),
                new AnimeCharacter("Joseph Joestar", 7500),
                new AnimeCharacter("Muhammad Avdol", 8000),
                new AnimeCharacter("Noriaki Kakyoin", 7800),
                new AnimeCharacter("Jean Pierre Polnareff", 8200));

        addAnime(animeCharacters, "Attack on Titan",
                new AnimeCharacter("Eren Yeager", 6000),
                new AnimeCharacter("Mikasa Ackerman", 5800),
                new AnimeCharacter("Armin Arlert", 5500),
                new AnimeCharacter("Iggi", 9000));

        System.out.println(animeCharacters);

        removeCharacter(animeCharacters, "Attack on Titan", new AnimeCharacter("Iggi", 9000));
        System.out.println(animeCharacters);

        addCharacter(animeCharacters, "Jojo's Bizzare Adventure STARDUST CRUSADERS", new AnimeCharacter("Iggi", 9000));;
        System.out.println(animeCharacters);
    }

    static void addAnime(HashMap<String, List<AnimeCharacter>> map, String anime, AnimeCharacter... characters) {
        map.put(anime, new ArrayList<>(List.of(characters)));
    }

    static void removeCharacter(HashMap<String, List<AnimeCharacter>> map, String anime, AnimeCharacter character) {
        List<AnimeCharacter> characters = map.get(anime);
        characters.remove(character);
    }

    static void addCharacter(HashMap<String, List<AnimeCharacter>> map, String anime, AnimeCharacter character) {
        List<AnimeCharacter> characters = map.get(anime);
        characters.add(character);
    }

}
