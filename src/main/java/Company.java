
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Company implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int azienda_id;

    public int getAzienda_id() {
        return azienda_id;
    }

    @OneToMany(mappedBy = "company" )
    Set<Users> userss = new HashSet<Users>();

    public Set<Users> getUserss() {
        return userss;
    }

    public void setUserss(Set<Users> userss) {
        this.userss = userss;
    }

    public void setAzienda_id(int azienda_id) {
        this.azienda_id = azienda_id;
    }


    private String nome_azienda;
    public String getNome_azienda() {
        return nome_azienda;
    }

    public void setNome_azienda(String nome_azienda) {
        this.nome_azienda = nome_azienda;
    }


}
