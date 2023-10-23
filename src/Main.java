import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<AnimeCharacter>> animeCharacters = new HashMap<>();

        addAnime(animeCharacters, "Jojo's Bizzare Adventure STARDUST CRUSADERS",
                new AnimeCharacter("Jotaro Kujo", 9000),
                new AnimeCharacter("Joseph Joestar", 7500),
                new AnimeCharacter("Muhammad Avdol", 8000),
                new AnimeCharacter("Noriaki Kakyoin", 7800),
                new AnimeCharacter("Jean Pierre Polnareff", 8200));

        addAnime(animeCharacters, "Vinland Saga",
                new AnimeCharacter("Einar", 9000));

        addAnime(animeCharacters, "Naruto",
                new AnimeCharacter("Naruto", 6000),
                new AnimeCharacter("Sasuke", 5800),
                new AnimeCharacter("Sakura", 5500));

        addAnime(animeCharacters, "Attack on Titan",
                new AnimeCharacter("Eren Yeager", 6000),
                new AnimeCharacter("Mikasa Ackerman", 5800),
                new AnimeCharacter("Armin Arlert", 5500),
                new AnimeCharacter("Iggi", 9000));

        removeCharacter(animeCharacters, "Attack on Titan", new AnimeCharacter("Iggi", 9000));
        addCharacter(animeCharacters, "Jojo's Bizzare Adventure STARDUST CRUSADERS", new AnimeCharacter("Iggi", 9000));;
        System.out.println("HashMap:");
        for (Map.Entry<String, List<AnimeCharacter>> entry : animeCharacters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, List<AnimeCharacter>> linkedAnimeCharacters = new LinkedHashMap<>();
        addAnime(linkedAnimeCharacters, "My Hero Academia",
                new AnimeCharacter("Izuku Midoriya", 8000));
        addAnime(linkedAnimeCharacters, "Neon Genesis Evangelion",
                new AnimeCharacter("Shinji Ikari", 8200));
        addAnime(linkedAnimeCharacters, "Hunter x Hunter",
                new AnimeCharacter("Gon Freecss", 7500));
        System.out.println("\nLinkedHashMap:");
        for (Map.Entry<String, List<AnimeCharacter>> entry : linkedAnimeCharacters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, List<AnimeCharacter>> treeAnimeCharacters = new TreeMap<>(animeCharacters);
        System.out.println("\nTreeMap:");
        for (Map.Entry<String, List<AnimeCharacter>> entry : treeAnimeCharacters.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static void addAnime(Map<String, List<AnimeCharacter>> map, String anime, AnimeCharacter... characters) {
        map.put(anime, new ArrayList<>(List.of(characters)));
    }

    static void removeCharacter(Map<String, List<AnimeCharacter>> map, String anime, AnimeCharacter character) {
        List<AnimeCharacter> characters = map.get(anime);
        characters.remove(character);
    }

    static void addCharacter(Map<String, List<AnimeCharacter>> map, String anime, AnimeCharacter character) {
        List<AnimeCharacter> characters = map.get(anime);
        characters.add(character);
    }

}
