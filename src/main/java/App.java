import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.Collection;
import java.util.Map;
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
        //
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Query q = em.createNativeQuery("SELECT  utn.azienda_id_mmas, utn.ruolo_id FROM users utn \n" +
                "\t    \tJOIN ruolo rl ON utn.ruolo_id = rl.ruolo_id \n" +
                "\t\t     WHERE utn.utente_id = 1 AND utn.nome_utente = \"admin\";");
        List<Object[]> students = (List<Object[]>)q.getResultList();

        for (Object[] o : students) {
            System.out.println("Students:{ " + " name: " + o[1] + " " +" marks : " + o[0] + " }" );
        }

        System.out.println(q);

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
        //Query q = em.createNativeQuery("select * from student where marks>60");

        /*
       //here is native Query
        Query q = em.createNativeQuery("select marks, name from student where marks > 60");


        List<Object[]> students = q.getResultList();

        for (Object[] o : students) {
            System.out.println("Students:{ " + " name: " + o[1] + " " +" marks : " + o[0] + " }" );
        }

*/

       // Query q = em.createQuery("select sum(marks) from Student s where s.marks > 60");

        //Object[] student = (Object[]) q.getSingleResult();
        //System.out.println(student[0] + " : " + student[1] + " " + student[2]);

        // Now Test the List
       // List<Object[]> students = (List<Object[]>)q.getResultList();

        //Object students = (Object) q.getResultList()



        em.getTransaction().commit();

        System.out.println("Done...");
    }
}


