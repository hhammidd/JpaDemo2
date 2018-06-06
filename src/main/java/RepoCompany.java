import javax.persistence.*;
import java.util.List;

public class RepoCompany {

    /**
     * this method fetch all the name
     * whiich include ...
     * @param em
     * @param name
     * @return
     */

    public List<Company> findWithName(EntityManager em, String name) {
        return em.createQuery("SELECT c FROM Company c WHERE c.nome_azienda LIKE :azienda_name1")
                .setParameter("azienda_name1" , name)
                .getResultList();

    }


}
