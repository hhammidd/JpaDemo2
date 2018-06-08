package com.hamid.services;

import com.hamid.entity.Company;
import com.hamid.entity.Permesso;
import com.hamid.entity.Ruolo;
import com.hamid.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


public class ServiceRuolo {
    public void doServiceRuolo(EntityManager em) {
        findAll(em);
        insertruolo(em);
        findRuolNoWhereAziendaIdAndName(em);
    }

    private void findRuolNoWhereAziendaIdAndName(EntityManager em) {

    }

    private void insertruolo(EntityManager em) {
        Ruolo r = new Ruolo();
        Company c = new Company();
        Users u = new Users();

        String ruoleName = "Developer";

        c.setAzienda_id(4045);
        u.setUtente_id(219);

        r.setCompany(c);
        r.setNome(ruoleName);
        r.setUsers(u);

        em.persist(r);

    }

    private void findAll(EntityManager em) {
        TypedQuery<Ruolo> ruoloQuery = em.createQuery("SELECT r FROM com.hamid.entity.Ruolo r", Ruolo.class);
        List<Ruolo> ruoloRes = ruoloQuery.getResultList();
    }

}
