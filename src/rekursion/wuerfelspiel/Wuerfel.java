package rekursion.wuerfelspiel;

public class Wuerfel {
    int seiten;

    public Wuerfel(int pSeiten) {

    }

    public int getSeiten() {
        return seiten;
    }

    public int wuerfeln() {
        return (int) (Math.random() * seiten) + 1;
    }
}
