import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int utente_id;
    private int azienda_id;
    private int azienda_id_mmas;
    private String nome_utente;
    private String password;
    private int ruolo_id;
    private int amministratore;
    private int ins_utente;
    private int clruolo_id;

    @OneToMany(mappedBy = "users" , fetch = FetchType.EAGER)
    //@JoinColumn(name = "ins_utente")
    private List<Ruolo> ruolos = new ArrayList<Ruolo>();

    public int getUtente_id() {
        return utente_id;
    }

    public void setUtente_id(int utente_id) {
        this.utente_id = utente_id;
    }

    public int getAzienda_id() {
        return azienda_id;
    }

    public void setAzienda_id(int azienda_id) {
        this.azienda_id = azienda_id;
    }

    public int getAzienda_id_mmas() {
        return azienda_id_mmas;
    }

    public void setAzienda_id_mmas(int azienda_id_mmas) {
        this.azienda_id_mmas = azienda_id_mmas;
    }

    public String getNome_utente() {
        return nome_utente;
    }

    public void setNome_utente(String nome_utente) {
        this.nome_utente = nome_utente;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRuolo_id() {
        return ruolo_id;
    }

    public void setRuolo_id(int ruolo_id) {
        this.ruolo_id = ruolo_id;
    }

    public int getAmministratore() {
        return amministratore;
    }

    public void setAmministratore(int amministratore) {
        this.amministratore = amministratore;
    }

    public int getIns_utente() {
        return ins_utente;
    }

    public void setIns_utente(int ins_utente) {
        this.ins_utente = ins_utente;
    }

    public int getClruolo_id() {
        return clruolo_id;
    }

    public void setClruolo_id(int clruolo_id) {
        this.clruolo_id = clruolo_id;
    }

    public List<Ruolo> getRuolos() {
        return ruolos;
    }

    public void setRuolos(List<Ruolo> ruolos) {
        this.ruolos = ruolos;
    }

    @Override
    public String toString() {
        return "Users{" +
                "utente_id=" + utente_id +
                ", azienda_id=" + azienda_id +
                ", azienda_id_mmas=" + azienda_id_mmas +
                ", nome_utente='" + nome_utente + '\'' +
                ", password='" + password + '\'' +
                ", ruolo_id=" + ruolo_id +
                ", amministratore=" + amministratore +
                ", ins_utente=" + ins_utente +
                ", clruolo_id=" + clruolo_id +
                ", ruolos=" + ruolos +
                '}';
    }
}
