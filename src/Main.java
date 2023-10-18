public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Gon Freecss", 5000, "Hunter x Hunter", "Jajanken");
        Villain villain = new Villain("Hisoka", 7000, "Hunter x Hunter", "Bungee Gum");

        System.out.println(hero.getSpecialMove());
        System.out.println(villain.getEvilPlan());

    }
}
