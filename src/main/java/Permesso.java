import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "permesso")
public class Permesso {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int permesso_id;
    private String nome;
    private String descrizione;

    @OneToMany(mappedBy = "permesso")
    private Set<Ruolo_Permesso> roulo_perm = new HashSet<Ruolo_Permesso>();



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



}
