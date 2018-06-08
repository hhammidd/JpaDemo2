package com.hamid.services;

import com.hamid.entity.Company;
import com.hamid.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class ServiceUsers {

    public void doServiceUsers(EntityManager em) {

        findAll(em);
        insertUser(em);

    }

    private void insertUser(EntityManager em) {

        int azienda_id_k1 = 1;
        int azienda_id = 3;
        String UserName = "HamidUser";
        String passWord = "passipassi";
        int ruolId = 1;
        int adminId = 0;
        int userIns = 1 ;

        Users u = new Users();
        Company c1 = new Company();
        c1.setAzienda_id(azienda_id);
        u.setCompany(c1);
        u.setAzienda_id_mmas(azienda_id_k1);
        u.setNome_utente(UserName);
        u.setPassword(passWord);
        u.setRuolo_id(ruolId);
        u.setAmministratore(adminId);
        u.setIns_utente(userIns);
        em.persist(u);

    }

    private void findAll(EntityManager em) {
        TypedQuery<Users> usersQuery = em.createQuery("SELECT u FROM com.hamid.entity.Users u", Users.class);
        List<Users> usersRes = usersQuery.getResultList();
        System.out.println("Users: " + usersRes);
    }
}
