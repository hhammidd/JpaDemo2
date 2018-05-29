import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentTest {

    public static void main(String[] args) {
        Student student =new Student();

        student.setRollNumber(1);
        student.setName("afl");
        student.setGrade("111");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
        System.out.println(student);
    }
}
