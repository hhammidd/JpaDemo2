import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {
    public static void main(String[] args) {

        Alien a = new Alien();
        a.setAid(10);
        a.setAname("mamad");
        a.setTech("bikar");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
        System.out.println(a);
    }
}


