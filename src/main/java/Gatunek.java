import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Gatunek {
    @Id
    int id_gat;
    String nazwa;

    public Gatunek(int id_gat, String nazwa) {
        this.id_gat = id_gat;
        this.nazwa = nazwa;
    }

    public int getId_gat() {
        return id_gat;
    }

    public void setId_gat(int id_gat) {
        this.id_gat = id_gat;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
