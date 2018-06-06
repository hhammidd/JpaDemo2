

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

public class ServiceCompany {
    public void doServiceCompany(EntityManager em) {

        RepoCompany rc = new RepoCompany();
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


        String temp = company_name.get(1);
        for (String s : company_name ) {
            System.out.println(s);
        }

        //1.EntityManager.createQuery Example
        //  it ask user that what you want from name of companies in DB
        String name = "%:Co%";
        List<Company> resCompany1 = rc.findWithName(em , name);
        for (Company c : resCompany1) {
            System.out.println(c.getNome_azienda());
        }

        //2. createNamedQuery Example


    }
}
