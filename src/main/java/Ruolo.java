import javax.persistence.*;

@Entity
@Table(name = "ruolo")
public class Ruolo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ruolo_id;
    private int azienda_id;
    private String nome;


    @ManyToOne
    @JoinColumn(name="ins_utente", referencedColumnName="utente_id")
    private Users users;

    public int getRuolo_id() {
        return ruolo_id;
    }

    public void setRuolo_id(int ruolo_id) {
        this.ruolo_id = ruolo_id;
    }

    public int getAzienda_id() {
        return azienda_id;
    }

    public void setAzienda_id(int azienda_id) {
        this.azienda_id = azienda_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
