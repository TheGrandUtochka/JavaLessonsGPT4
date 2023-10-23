import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<JJBACharacters> hashSetJJBACharacters = new HashSet<>();
        hashSetJJBACharacters.add(new JJBACharacters("Jotaro Jujo", 9000, 17, "Star Platinum"));
        hashSetJJBACharacters.add(new JJBACharacters("Joseph Joestar", 7500, 69, "Hermit Purple"));
        hashSetJJBACharacters.add(new JJBACharacters("Muhammad Avdol", 8000, 28, "Magician's Red"));
        hashSetJJBACharacters.add(new JJBACharacters("Noriaki Kakyoin", 7800, 17, "Hierophant Green"));
        hashSetJJBACharacters.add(new JJBACharacters("Jean Pierre Polnareff", 8200, 22, "Silver Chariot"));
        hashSetJJBACharacters.add(new JJBACharacters("Muhammad Avdol", 8000, 28, "Magician's Red"));
        hashSetJJBACharacters.add(null);

        output(hashSetJJBACharacters);

        Set<JJBACharacters> linkedHashSetJJBACharacters = new LinkedHashSet<>();
        linkedHashSetJJBACharacters.add(new JJBACharacters("Josuke Higashikata", 8500, 16, "Crazy Diamond"));
        linkedHashSetJJBACharacters.add(new JJBACharacters("Koichi Hirose", 8000, 15, "Echoes"));
        linkedHashSetJJBACharacters.add(new JJBACharacters("Okuyasu Nijimura", 8200, 16, "The Hand"));
        output(linkedHashSetJJBACharacters);

        Set<JJBACharacters> treeSetJJBACharacters = new TreeSet<>(Comparator.comparingInt(JJBACharacters::getPowerLevel));
        treeSetJJBACharacters.add(new JJBACharacters("Giorno Giovanna", 9000, 15, "Gold Experience"));
        treeSetJJBACharacters.add(new JJBACharacters("Bruno Bucciarati", 8700, 20, "Sticky Fingers"));
        treeSetJJBACharacters.add(new JJBACharacters("Leone Abbacchio", 8500, 21, "Moody Blues"));
        output(treeSetJJBACharacters);
    }

    public static void output(Set<JJBACharacters> JJBACharactersList) {
        for(JJBACharacters i : JJBACharactersList) {
            System.out.println(i);
        }
        System.out.println("_______________");
    }
}
