import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collection;
import java.util.Random;
import java.util.List;

public class App {
    public static void main(String[] args) {

        /*
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");


        Student s = new Student();
        s.setName("Hamid");
        s.setRollno(1);
        s.setMarks(50);
        s.getLaptop().add(laptop);

        laptop.getStudent().add(s);

        //s.setLaptop(laptop);

*/

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        /*
        Query q = em.createQuery("from Student where rollno = 7");
        //List<Student> students = q.getResultList();
        Student student = (Student) q.getSingleResult();
        System.out.println(student);
*/

        /*
        for (Student s : students){
            System.out.println(s);
        }

        */
        //create SQL in JPA






        em.getTransaction().commit();

        System.out.println("Done...");
    }
}


