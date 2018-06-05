

import javax.persistence.*;

@Entity
@Table(name = "rel_ruolo_permesso")
public class Ruolo_Permesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="permesso_id", referencedColumnName="permesso_id" )
    private Permesso permesso;

    @ManyToOne
    @JoinColumn(name = "ruolo_id", referencedColumnName = "ruolo_id")
    private Ruolo ruolo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Permesso getPermesso() {
        return permesso;
    }

    public void setPermesso(Permesso permesso) {
        this.permesso = permesso;
    }

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo = ruolo;
    }
}