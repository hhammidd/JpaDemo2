import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class ServiceRuolo {
    public void doServiceRuolo(EntityManager em) {
        TypedQuery<Ruolo> ruoloQuery = em.createQuery("SELECT r FROM Ruolo r", Ruolo.class);
        List<Ruolo> ruoloRes = ruoloQuery.getResultList();
        System.out.println("Users: " + ruoloRes);




    }
}
