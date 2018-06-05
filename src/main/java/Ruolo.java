import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ruolo")
public class Ruolo {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int ruolo_id;

    @ManyToOne
    @JoinColumn(name = "azienda_id", referencedColumnName = "azienda_id")
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    private String nome;


    @ManyToOne
    @JoinColumn(name="ins_utente", referencedColumnName="utente_id")
    private Users users;

    /*
    @ManyToMany(mappedBy = "ruolos")
    @JoinTable(name = "rel_ruolo_permesso" , joinColumns = @JoinColumn(name="EMP_ID", referencedColumnName="ruolo_id")
    ,inverseJoinColumns = @JoinColumn(name = "permesso_id", referencedColumnName = "permesso_id"))
    private List<Permesso> permessos = new ArrayList<Permesso>();
    */

    @OneToMany(mappedBy = "ruolo")
    Set<Ruolo_Permesso> perm_ruolo = new HashSet<Ruolo_Permesso>();

    public Set<Ruolo_Permesso> getPerm_ruolo() {
        return perm_ruolo;
    }

    public void setPerm_ruolo(Set<Ruolo_Permesso> perm_ruolo) {
        this.perm_ruolo = perm_ruolo;
    }

    public int getRuolo_id() {
        return ruolo_id;
    }

    public void setRuolo_id(int ruolo_id) {
        this.ruolo_id = ruolo_id;
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
