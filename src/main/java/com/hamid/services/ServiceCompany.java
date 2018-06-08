package com.hamid.services;


import com.hamid.entity.Company;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import javax.persistence.NamedQuery;

public class ServiceCompany {

    public void doServiceCompany(EntityManager em) {



        TypedQuery<Company> companyQuery = em.createQuery("SELECT r FROM com.hamid.entity.Company r", Company.class);
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
        System.out.println("======Belo Co test=========");

        //1.EntityManager.createQuery Example
        //  it ask user that what you want from name of companies in DB
        String name = "%:Co%";
        List<Company> resCompany1 = findWithName(em , name);
        for (Company c : resCompany1) {
            System.out.println("here: " + c.getNome_azienda());
        }
        //2. Named Parameters in Queries

        //3. Positional Parameters in Queries with ? mark
        //Insert into company
        String nome_azienda = "BeSolution1";
        persistCompany(em ,nome_azienda);
        //Get the last ID

        String name1 = "sth";
        List<Company> resCompany2 = findAllRuolo(em , name1);
        for (Company c : resCompany2) {
            System.out.println("here: " + c.getNome_azienda());
        }


    }

    private List<Company> findAllRuolo(EntityManager em, String name) {
        return em.createQuery("SELECT c FROM com.hamid.entity.Company c WHERE c.nome_azienda LIKE :someSymbol")
                .setParameter("someSymbol", "%:Co%")
                .getResultList();
    }


    private void persistCompany(EntityManager em , String nome_azienda) {
        Query query = em.createNativeQuery("INSERT INTO Company (nome_azienda) VALUES (?)");
        query.setParameter(1, nome_azienda);
        query.executeUpdate();
    }

    private List<Company> findWithName(EntityManager em, String name) {
        return em.createQuery("SELECT c FROM com.hamid.entity.Company c WHERE c.nome_azienda LIKE :someSymbol")
                .setParameter("someSymbol", "%:Co%")
                .getResultList();
    }



}
