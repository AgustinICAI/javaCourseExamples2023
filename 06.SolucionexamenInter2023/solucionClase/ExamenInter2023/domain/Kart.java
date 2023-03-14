package ExamenInter2023.domain;

import java.util.Objects;

public class Kart {
    private int id;

    public Kart(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Kart kart)) return false;
        return getId() == kart.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public int getId() {
        return id;
    }
}
