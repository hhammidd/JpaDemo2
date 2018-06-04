import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "permesso")
public class Permesso {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int permesso_id;
    private String nome;
    private String descrizione;

    @ManyToMany
    private List<Ruolo> ruolos = new ArrayList<Ruolo>();

    public int getPermesso_id() {
        return permesso_id;
    }

    public void setPermesso_id(int permesso_id) {
        this.permesso_id = permesso_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public List<Ruolo> getRuolos() {
        return ruolos;
    }

    public void setRuolos(List<Ruolo> ruolos) {
        this.ruolos = ruolos;
    }
}
