import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class App {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();

        Alien a = em.find(Alien.class, 2);

        System.out.println(a);
    }
}


