import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ServiceUsers {

    public void doServiceUsers(EntityManager em) {

        TypedQuery<Users> usersQuery = em.createQuery("SELECT u FROM Users u", Users.class);
        List<Users> usersRes = usersQuery.getResultList();
        System.out.println("Users: " + usersRes);

        Users u = new Users();
        Company c1 = new Company();
        c1.setAzienda_id(4);

        u.setCompany(c1);
        u.setAzienda_id_mmas(111);
        u.setNome_utente("newnew");
        u.setPassword("newnew");
        u.setRuolo_id(1);
        u.setAmministratore(0);
        u.setIns_utente(4);

        em.persist(u);
        System.out.println("u: " + u);


    }
}
