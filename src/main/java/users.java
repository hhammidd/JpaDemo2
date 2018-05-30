import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int utente_id;

    private int azienda_id;
    private int azienda_id_mmas;

    private String nome_utente;
    private String password;

    private int ruolo_id;

    private int amministratore;

    private int ins_utente;

    private int clruolo_id;

}
