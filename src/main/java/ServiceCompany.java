import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class ServiceCompany {
    public void doServiceCompany(EntityManager em) {

        TypedQuery<Company> companyQuery = em.createQuery("SELECT r FROM Company r", Company.class);
        List<Company> companyRes = companyQuery.getResultList();

        for (Company s : companyRes){
            System.out.println("Azienda_id: " + s.getAzienda_id() + " Nome Azienda: " + s.getNome_azienda());
            System.out.println("Company: " + companyRes);
        }

        //The name of companies
        String query_azienda = "SELECT nome_azienda FROM company";
        Query q = em.createNativeQuery("SELECT nome_azienda FROM company");
        List<String> company_name = q.getResultList();
        for (String s : company_name ) {
            System.out.println(s);
        }

    }
}
