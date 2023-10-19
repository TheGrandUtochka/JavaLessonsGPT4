import java.util.Objects;

public class Anime {
    private String title;
    private String genre;
    private int episodes;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public Anime(String title, String genre, int episodes) {
        this.title = title;
        this.genre = genre;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Anime anime = (Anime) o;
        return episodes == anime.episodes &&
                Objects.equals(title, anime.title) &&
                Objects.equals(genre, anime.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, episodes);
    }

}
