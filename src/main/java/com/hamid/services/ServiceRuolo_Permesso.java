package com.hamid.services;

import com.hamid.entity.Permesso;
import com.hamid.entity.Ruolo;
import com.hamid.entity.Ruolo_Permesso;

import javax.persistence.EntityManager;

public class ServiceRuolo_Permesso {
    Ruolo_Permesso rp = new Ruolo_Permesso();
    Ruolo r1 = new Ruolo();
    Permesso p1 = new Permesso();

    public void doServiceRuolo_Permesso(EntityManager em) {

        persistRuolePermessoId(em);
    }

    private void persistRuolePermessoId(EntityManager em ) {
        r1.setRuolo_id(5);
        p1.setPermesso_id(3);

        rp.setRuolo(r1);
        rp.setPermesso(p1);

    }
}
