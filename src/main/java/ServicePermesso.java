import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ServicePermesso {
    public void doServicePermesso(EntityManager em) {
        TypedQuery<Permesso> permessoQuery = em.createQuery("SELECT c FROM Permesso c", Permesso.class);
        List<Permesso> permessoRes = permessoQuery.getResultList();
        System.out.println("Permesso: " + permessoRes);

    }
}
