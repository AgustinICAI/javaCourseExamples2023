package examenInter2023.dominio;

public class Kart {
    private int id;

    public Kart(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Kart{" +
                "id=" + id +
                '}';
    }
}
