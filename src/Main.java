import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Anime> animeList = new ArrayList<>();

        animeList.add(new Anime("Naruto", "Action", 220));
        animeList.add(new Anime("Attack on Titan", "Action", 59));
        animeList.add(new Anime("One Piece", "Adventure", 1000));
        animeList.add(new Anime("Jujutsu Kaisen", "Supernatural", 24));

        outputAnimeList(animeList);

        animeList.add(new Anime("Hunter x Hunter", "Action", 148));

        outputAnimeList(animeList);

        animeList.remove(2);

        outputAnimeList(animeList);

        if (animeList.contains(new Anime("One Piece", "Adventure", 1000))) {
            System.out.println("One piece is real!");
        } else {
            System.out.println("One piece is not real!");
        }
    }

    public static void outputAnimeList(ArrayList<Anime> animeList) {
        for (Anime anime : animeList) {
            System.out.println(anime);
        }
        System.out.println("_____________________");
    }
}
