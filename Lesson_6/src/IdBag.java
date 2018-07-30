import java.util.Objects;

public class IdBag {
    int ID;


    public IdBag(int ID) { this.ID = ID; }

    public int getID() {
        return ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdBag idBag = (IdBag) o;
        return ID == idBag.ID;
    }

    @Override
    public String toString() {
        return "IdBag{" +
                "ID=" + ID +
                '}';
    }
}
