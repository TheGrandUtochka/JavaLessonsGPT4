import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<JJBACharacter> JJBACharacterList = new LinkedList<>();
        JJBACharacterList.add(new JJBACharacter("Jotaro Jujo", 9000, 17, "Star Platinum"));
        JJBACharacterList.add(new JJBACharacter("Joseph Joestar", 7500, 69, "Hermit Purple"));
        JJBACharacterList.add(new JJBACharacter("Muhammad Avdol", 8000, 28, "Magician's Red"));
        JJBACharacterList.add(new JJBACharacter("Noriaki Kakyoin", 7800, 17, "Hierophant Green"));
        JJBACharacterList.add(new JJBACharacter("Jean Pierre Polnareff", 8200, 22, "Silver Chariot"));

        output(JJBACharacterList);

        JJBACharacterList.remove(2);
        JJBACharacterList.remove(3);

        output(JJBACharacterList);
    }

    public static void output(LinkedList<JJBACharacter> JJBACharacterList) {
        for(JJBACharacter i : JJBACharacterList) {
            System.out.println(i);
        }
        System.out.println("_______________");
    }
}
