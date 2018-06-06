import javax.persistence.*;
import java.util.Collection;
import java.util.Map;
import java.util.Random;
import java.util.List;

/**
 * Three basic form of Query expression
 *  - JPQL
 *  - Native SQL
 *  - Criteria API
 *      - String-Based Accessors
 *      - Metamodel Accrssors
 *      - Canonical Metamodel Accessors
 *
 * Entity Model provides More:
 *  - JPQL
 *  - Criteria API --> Type Safe of Query
 * Native SQL provides direct access to:
 *  - full power of SQL
 *  - full access to db specific extensions
 *
 */


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
        //this 3 lines is constant
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("User");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        ServiceUsers su = new ServiceUsers();
        su.doServiceUsers(em);

        ServiceCompany sc = new ServiceCompany();
        sc.doServiceCompany(em);

        ServicePermesso sp = new ServicePermesso();
        sp.doServicePermesso(em);

        ServiceRuolo sr = new ServiceRuolo();
        sr.doServiceRuolo(em);

        //Please do the Queries in JPA Below

        /*
        1. JPQL (Java Persistence Query Language
            - Access to the *entity* model using a SQL-like text query language
            - Queries expressed using entities, properties, and relationships
            --------------Example JPQL------------
                "c" is part of root query
                "c" represents rows from Customer entity table(s)
                "c.lastName" is path off root term
                ":firstName" is parameter placeholder
                "c.firstName" is path off root term
                "Customer.class" type parameter allows for a type-safe return result
         */
        //String jpaqlString = "select c from Users c where c.nome_utente = :Admin " ;
        //TypedQuery<Users> query = em.createQuery(jpaqlString, Users.class);


                /*
                Execute JPQL
                 */
        //at this point we are query-type agnostic

        //List<Users> customers = query.setParameter("nome_utente", "thing").getResultList();
        //log.info("result=" + customers);
        //assertEquals("unexpected number of results", 2, customers.size());


        /*
        2. Native SQL Queries
        =
         */

        //String tableName = "users";
        //String nativeSQLEx = "select u.utente_id, u.nome_utente " +
        //        String.format("from %s u" , tableName) +
        //        " where utente_id = 111 " ;
        //"order by u.LAST_NAME ASC"

        //Query nativeSQLExQuery = em.createNativeQuery(nativeSQLEx, Users.class);
        //System.out.println(nativeSQLExQuery);

        /*
        3. Criteria API Queries
        Build overall query using Java types (demonstrated here with "string accessors")
        =======
        Ex: convert below
        select u from users u where u.utente_id = :xx
        order by u.azienda_id ASC
        ------- Conver Above SQL To Criteria API--------
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Users> qdef = cb.createQuery(Users.class);
        Root<Users> u = qdef.from(Users.class);
        qdef.select(u)
        .where(cb.equal(u.get("xx"),
        cb.parameter(String.class,"xx")))
        .orderBy(cb.asc(u.get("azienda_id")));
        //build query from criteria definition
        TypedQuery<Users> query = em.createQuery(qdef);
        ---------------Explain--------------
            "CriteriaBuilder" used as starting point to build objects within the query tree
            "CriteriaQuery<T>" used to hold the definition of query
            "Root<T>" used to reference root level query terms
            "CriteriaBuilder.from()" used to designate the entity that represents root query term
            Result used to create path references for query body
            "CriteriaBuilder.select()" officially lists the objects returned from query
            "CriteriaBuilder.where()" builds a decision predicate of which entities to include
            "CriteriaBuilder.equal()" builds an equals predicate for the where clause
            "Root<T>.get()" returns the property referenced in path expression
            "CriteriaBuilder.parameter()" builds a parameter placeholder within query. Useful with @Temporal date comparisons
         */

        /*
        4. Strongly Typed Queries
            Previous Criteria API examples were string label based -- not type safe
            Criteria API provides means for stronger typing
            Strong typing permits automatic detection of model and query differences
         */


/*
        Query q1 = em.createNativeQuery("SELECT utn.amministratore, utn.nome_utente, utn.utente_id, utn.azienda_id_mmas, utn.ruolo_id, prm.nome, prm.permesso_id FROM users utn \n" +
                "\t    \tJOIN ruolo rl ON utn.ruolo_id = rl.ruolo_id \n" +
                "\t\t\tJOIN rel_ruolo_permesso rrp ON rl.ruolo_id = rrp.ruolo_id\n" +
                "\t\t\tJOIN permesso prm ON rrp.permesso_id = prm.permesso_id WHERE utn.utente_id = 1 AND utn.nome_utente = \"Admin\";");
        List<Object[]> students = (List<Object[]>)q1.getResultList();

        for (Object[] o : students) {
            System.out.println("Users :{ " + " Admin Id : " + o[0] + " UserName : " + o[1] + " Id_User: " + o[2] + " azienda_id_mmas : " + o[3] + " rouolo_id : " + o[4] + " ruolo: " + o[5] +  " }" );
        }
*/


       // System.out.println(q1);



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

        //Object students = (Object) q.getResultList();



        em.getTransaction().commit();

        System.out.println("Done...");
    }
}


