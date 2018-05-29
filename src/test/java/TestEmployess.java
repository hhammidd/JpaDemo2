import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestEmployess {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(11);
        employee.setFirstName("Hamid");
        employee.setLastName("mamad");
        employee.setSalary(16000);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        System.out.println(employee);
    }
}
