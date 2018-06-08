package com.hamid.services;

import com.hamid.entity.Company;
import com.hamid.entity.Ruolo;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;


public class ServiceRuolo {
    public void doServiceRuolo(EntityManager em) {
        TypedQuery<Ruolo> ruoloQuery = em.createQuery("SELECT r FROM com.hamid.entity.Ruolo r", Ruolo.class);
        List<Ruolo> ruoloRes = ruoloQuery.getResultList();

    }

}
